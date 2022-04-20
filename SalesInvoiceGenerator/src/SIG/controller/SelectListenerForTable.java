/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIG.controller;

import SIG.model.InvoiceHeader;
import SIG.model.InvoiceLine;
import SIG.model.InvoiceLineTable;
import SIG.view.SIG_Frame;
import java.util.ArrayList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author mary
 */
public class SelectListenerForTable implements ListSelectionListener{
   private SIG_Frame frame;

    public SelectListenerForTable(SIG_Frame frame) {
        this.frame = frame;
    }
   

    @Override
    public void valueChanged(ListSelectionEvent e) {
        int indexOfSelectedRow=frame.getjTable_Invoice().getSelectedRow();
        if (indexOfSelectedRow != -1) {
            
        InvoiceHeader selectedRow =frame.getInvoicesArr().get(indexOfSelectedRow);
        ArrayList<InvoiceLine> lines=selectedRow.getLines();
        InvoiceLineTable lineTable=new InvoiceLineTable(lines);
        frame.setLinesArr(lines);
        frame.getjTable_Items().setModel(lineTable);
        frame.getjTextField_CustomerName().setText(selectedRow.getCustomerName());
        frame.getjLabel_InvoiceNumber().setText(selectedRow.getNumber()+"");
        frame.getjLabel_InvoiceTotal().setText(selectedRow.getTotalInvoice()+"");
        frame.getjTextField_InvoiceDate().setText(SIG_Frame.date.format(selectedRow.getDate()));
        
        }
       
    }

    private void getLines() {
     
    }
    
}
