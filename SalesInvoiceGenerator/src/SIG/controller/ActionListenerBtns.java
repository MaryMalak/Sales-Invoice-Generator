/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIG.controller;

import SIG.view.SIG_Frame;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import javax.swing.JFileChooser;




/**
 *
 * @author mary
 */
public class ActionListenerBtns implements ActionListener{
    private SIG_Frame frame;

    public ActionListenerBtns(SIG_Frame frame) {
        this.frame = frame;
    } 
    

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()){
            case "Create New Invoice":
                CreateNewInvoice();
                break;
            case "Delete Invoice":
                DeleteInvoice();
                break;
            case "Save":
                Save();           
                break;
            case "Cancel":
                Cancel();
                break;
        }
       
    }

    private void CreateNewInvoice() {
    }

    private void DeleteInvoice() {       
    }

    private void Save() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void Cancel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
