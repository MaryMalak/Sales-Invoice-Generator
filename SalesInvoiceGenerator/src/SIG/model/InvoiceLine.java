/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIG.model;

/**
 *
 * @author mary
 */
public class InvoiceLine {
    private InvoiceHeader header ;
    private String itemName;
    private double price;
    private int count;

    public InvoiceLine() {
    }

    public InvoiceLine(InvoiceHeader header, String itemName, double price, int count) {
        this.header = header;
        this.itemName = itemName;
        this.price = price;
        this.count = count;
    }

    public InvoiceHeader getHeader() {
        return header;
    }

    public void setHeader(InvoiceHeader header) {
        this.header = header;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    public double getTotalLine(){
        return count*price;
    }

    @Override
    public String toString() {
        return  header.getNumber() + "," + itemName + "," + price + "," + count ;
    }

    
}
