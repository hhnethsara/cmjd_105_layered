/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.dto;

/**
 *
 * @author neths
 */
public class ItemDto {

    private String itemCOde;
    private String description;
    private String packsize;
    private double unitPrice;
    private int QtyOnHand;

    public ItemDto() {
    }

    public ItemDto(String itemCOde, String description, String packsize, double unitPrice, int QtyOnHand) {
        this.itemCOde = itemCOde;
        this.description = description;
        this.packsize = packsize;
        this.unitPrice = unitPrice;
        this.QtyOnHand = QtyOnHand;
    }

    

    /**
     * @return the itemCOde
     */
    public String getItemCOde() {
        return itemCOde;
    }

    /**
     * @param itemCOde the itemCOde to set
     */
    public void setItemCOde(String itemCOde) {
        this.itemCOde = itemCOde;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the packsize
     */
    public String getPacksize() {
        return packsize;
    }

    /**
     * @param packsize the packsize to set
     */
    public void setPacksize(String packsize) {
        this.packsize = packsize;
    }

    /**
     * @return the unitPrice
     */
    public double getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
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
        return "ItemDto{" + "itemCOde=" + itemCOde + ", description=" + description + ", packsize=" + packsize + ", unitPrice=" + unitPrice + ", QtyOnHand=" + QtyOnHand + '}';
    }

}
