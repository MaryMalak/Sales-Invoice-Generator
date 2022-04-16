/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIG.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author mary
 */
public class InvoiceHeader {
    private int number;
    private Date date;
    private String customerName;
    private ArrayList<InvoiceLine>lines ;

    public InvoiceHeader() {
    }

    public InvoiceHeader(int number, Date date, String customerName) {
        this.number = number;
        this.date = date;
        this.customerName = customerName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setLines(ArrayList<InvoiceLine> lines) {
        this.lines = lines;
    }
    
    public double getTotalInvoice(){
        double total=0;
        for (InvoiceLine line : lines) {
            total+=line.getTotalLine();
        }
        return total;
    
    }
    
    
}
