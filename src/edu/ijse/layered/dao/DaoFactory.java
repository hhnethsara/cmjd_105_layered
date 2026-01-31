/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.dao;

import edu.ijse.layered.dao.custom.impl.ItemDaoImpl;

/**
 *
 * @author neths
 */
public class DaoFactory {
    private static DaoFactory daoFactory;

    public DaoFactory() {
    }
    
    public static DaoFactory getInstance(){
        if(daoFactory == null){
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }
    public SuperDao getDao(DaoTypes type){
        switch (type) {
            case ITEM:
                return new ItemDaoImpl();
            default:
                return null;
                
        }
    }
    
    public enum DaoTypes{
        ITEM
    }
}
