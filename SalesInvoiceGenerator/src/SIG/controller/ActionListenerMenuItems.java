/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIG.controller;
import SIG.view.SIG_Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author mary
 */
public class ActionListenerMenuItems implements ActionListener{
    private SIG_Frame frame;

    public ActionListenerMenuItems(SIG_Frame frame) {
        this.frame = frame;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()){
            case "Load File":
                System.out.println("Load File");
                break;
            case "Save File":
                System.out.println("Save File");
                break;
        }
    }
    
}
