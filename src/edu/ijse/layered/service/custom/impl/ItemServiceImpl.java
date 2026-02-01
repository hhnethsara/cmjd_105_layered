/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.service.custom.impl;

import edu.ijse.layered.dao.DaoFactory;
import edu.ijse.layered.dao.custom.ItemDao;
import edu.ijse.layered.dto.ItemDto;
import edu.ijse.layered.entity.ItemEntity;
import edu.ijse.layered.service.custom.ItemService;
import java.util.List;

/**
 *
 * @author neths
 */
public class ItemServiceImpl implements ItemService{
    private ItemDao itemdao = (ItemDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ITEM);

    @Override
    public String saveItem(ItemDto itemDto) throws Exception {
        ItemEntity itemEntity = new ItemEntity(itemDto.getItemCOde(),
                itemDto.getDescription(),
                itemDto.getPacksize(),
                itemDto.getUnitPrice(),
                itemDto.getQtyOnHand());
        if(itemdao.add(itemEntity)){
            return "Success";
        }else{
            return "Fail";
        }
        
    }

    @Override
    public String updateItem(ItemDto itemDto) throws Exception {
        ItemEntity itemEntity = new ItemEntity(itemDto.getItemCOde(),
                itemDto.getDescription(),
                itemDto.getPacksize(),
                itemDto.getUnitPrice(),
                itemDto.getQtyOnHand());
        if(itemdao.update(itemEntity)){
            return "Update Success";
        }else{
            return "Update Fail";
        }
    }

    @Override
    public String deleteItem(ItemDto itemDto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ItemDto getItem(String ItemCode) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ItemDto> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
