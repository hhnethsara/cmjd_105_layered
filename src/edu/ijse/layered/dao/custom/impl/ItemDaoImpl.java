/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.dao.custom.impl;

import edu.ijse.layered.dao.CrudUtil;
import edu.ijse.layered.dao.custom.ItemDao;
import edu.ijse.layered.entity.ItemEntity;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author neths
 */
public class ItemDaoImpl implements ItemDao {

    @Override
    public boolean add(ItemEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO item VALUES (?,?,?,?,?)",
                t.getItemCode(),
                t.getDescription(),
                t.getPacksize(),
                t.getUnitPrice(),
                t.getQtyOnHand());
    }

    @Override
    public boolean update(ItemEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE item SET Description=?,Packsize=?,UnitPrice=?,QtyOnHand=? WHERE ItemCode=?",
                t.getDescription(),
                t.getPacksize(),
                t.getUnitPrice(),
                t.getQtyOnHand(),
                t.getItemCode());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM item WHERE ItemCode=?", id);
    }

    @Override
    public ItemEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM item WHERE ItemCode=?", id);
        while (rst.next()) {
            return new ItemEntity(rst.getString("ItemCode"),
                    rst.getString("Description"),
                    rst.getString("Packsize"),
                    rst.getDouble("UnitPrice"),
                    rst.getInt("QtyOnHand"));
        }
        return null;
    }

    @Override
    public ArrayList<ItemEntity> getAll() throws Exception {
        ArrayList<ItemEntity> itemEntitys = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM item");
        while(rst.next()){
            itemEntitys.add( new ItemEntity(rst.getString("ItemCode"),
                    rst.getString("Description"),
                    rst.getString("Packsize"),
                    rst.getDouble("UnitPrice"),
                    rst.getInt("QtyOnHand")));
        }
        return itemEntitys;
    }

}
