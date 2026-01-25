/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.entity;

/**
 *
 * @author neths
 */
public class ItemEntity {
    private String ItemCode;
    private String Description;
    private String Packsize;
    private double UnitPrice;
    private int QtyOnHand;

    public ItemEntity() {
    }

    public ItemEntity(String ItemCode, String Description, String Packsize, double UnitPrice, int QtyOnHand) {
        this.ItemCode = ItemCode;
        this.Description = Description;
        this.Packsize = Packsize;
        this.UnitPrice = UnitPrice;
        this.QtyOnHand = QtyOnHand;
    }

    /**
     * @return the ItemCode
     */
    public String getItemCode() {
        return ItemCode;
    }

    /**
     * @param ItemCode the ItemCode to set
     */
    public void setItemCode(String ItemCode) {
        this.ItemCode = ItemCode;
    }

    /**
     * @return the Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * @param Description the Description to set
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * @return the Packsize
     */
    public String getPacksize() {
        return Packsize;
    }

    /**
     * @param Packsize the Packsize to set
     */
    public void setPacksize(String Packsize) {
        this.Packsize = Packsize;
    }

    /**
     * @return the UnitPrice
     */
    public double getUnitPrice() {
        return UnitPrice;
    }

    /**
     * @param UnitPrice the UnitPrice to set
     */
    public void setUnitPrice(double UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * @return the QtyOnHand
     */
    public int getQtyOnHand() {
        return QtyOnHand;
    }

    /**
     * @param QtyOnHand the QtyOnHand to set
     */
    public void setQtyOnHand(int QtyOnHand) {
        this.QtyOnHand = QtyOnHand;
    }

    @Override
    public String toString() {
        return "ItemEntity{" + "ItemCode=" + ItemCode + ", Description=" + Description + ", Packsize=" + Packsize + ", UnitPrice=" + UnitPrice + ", QtyOnHand=" + QtyOnHand + '}';
    }
    
    
}
