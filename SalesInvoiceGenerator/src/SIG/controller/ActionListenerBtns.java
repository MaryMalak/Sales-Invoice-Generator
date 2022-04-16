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
                System.out.println("Create New Invoice");
                break;
            case "Delete Invoice":
                System.out.println("Delete Invoice");
                break;
            case "Save":
                System.out.println("save");            
                break;
            case "Cancel":
                System.out.println("cancel");
                break;
        }
       
    }
    
}
