/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIG.controller;
import SIG.model.InvoiceHeader;
import SIG.model.InvoiceLine;
import SIG.view.SIG_Frame;
//import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JFileChooser;
import java.util.ArrayList;
import java.util.Date;
import java.util.List; 
import javax.swing.JOptionPane;

/**
 *
 * @author mary
 */
public class ActionListenerMenuItems implements ActionListener{
    private SIG_Frame frame;
    private SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");

    public ActionListenerMenuItems(SIG_Frame frame) {
        this.frame = frame;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()){
            case "Load File":
                LoadFile();
                break;
            case "Save File":
                SaveFile();
                break;
        }
    }
    private void LoadFile() {
        JFileChooser fileChooser=new JFileChooser();
        try{
        int choice= fileChooser.showOpenDialog(frame);
        if (choice==JFileChooser.APPROVE_OPTION) {
            Path PathOfHeaderFile=Paths.get(fileChooser.getSelectedFile().getAbsolutePath());
           List<String> linesOfHeaderFile;
            linesOfHeaderFile = Files.readAllLines(PathOfHeaderFile);
            ArrayList<InvoiceHeader> Headers = new ArrayList<>();
            for(String line :linesOfHeaderFile){
                String[]HeaderElements=line.split(",");
                int code =Integer.parseInt(HeaderElements[0]);
                Date invoiceDate = date.parse(HeaderElements[1]);
                InvoiceHeader invHeader = new InvoiceHeader(code, invoiceDate, HeaderElements[2]);
                    Headers.add(invHeader);      
            }
            frame.setInvoicesArr(Headers);
            choice= fileChooser.showOpenDialog(frame);
        if (choice==JFileChooser.APPROVE_OPTION) {
            Path PathOfLineFile=Paths.get(fileChooser.getSelectedFile().getAbsolutePath());
           List<String> linesOfLineFile;
            linesOfLineFile = Files.readAllLines(PathOfLineFile);
            ArrayList<InvoiceLine> invline = new ArrayList<>();
            for(String lineOfLineFile :linesOfLineFile){
                String[]lineElements=lineOfLineFile.split(",");
                int code =Integer.parseInt(lineElements[0]);
                double price=Double.parseDouble(lineElements[2]);
                int count=Integer.parseInt(lineElements[3]);
                InvoiceHeader inv=frame.getInvoiceHeaderObject(code) ;
                InvoiceLine line=new InvoiceLine(inv, lineElements[1], price, count);
                inv.getLines().add(line);
                
            }
        }
        }
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(frame, e.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
        }catch(ParseException e){
            JOptionPane.showMessageDialog(frame, e.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
        
    }
    }
    private void SaveFile() {
    }
    
}
