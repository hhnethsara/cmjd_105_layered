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
import java.util.ArrayList;

/**
 *
 * @author neths
 */
public class ItemServiceImpl implements ItemService {

    private ItemDao itemdao = (ItemDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ITEM);
    
    @Override
    public String saveItem(ItemDto itemDto) throws Exception {
        ItemEntity itemEntity = new ItemEntity(itemDto.getItemCOde(),
                itemDto.getDescription(),
                itemDto.getPacksize(),
                itemDto.getUnitPrice(),
                itemDto.getQtyOnHand());
        if (itemdao.add(itemEntity)) {
            return "Success";
        } else {
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
        if (itemdao.update(itemEntity)) {
            return "Update Success";
        } else {
            return "Update Fail";
        }
    }
    
    @Override
    public String deleteItem(String itemCode) throws Exception {
        if (itemdao.delete(itemCode)) {
            return "Successfully Deleted";
        } else {
            return "Delete Fail";
        }
    }
    
    @Override
    public ItemDto getItem(String ItemCode) throws Exception {
        ItemEntity itemEntity = itemdao.get(ItemCode);
        return new ItemDto(itemEntity.getItemCode(),
                itemEntity.getDescription(),
                itemEntity.getPacksize(),
                itemEntity.getUnitPrice(),
                itemEntity.getQtyOnHand());
    }
    
    @Override
    public List<ItemDto> getAll() throws Exception {
        ArrayList<ItemEntity> itemEntitys = itemdao.getAll();
        List<ItemDto> itemDtos = new ArrayList<ItemDto>();
        for (ItemEntity itemEntity : itemEntitys) {
            itemDtos.add(new ItemDto(itemEntity.getItemCode(),
                    itemEntity.getDescription(),
                    itemEntity.getPacksize(),
                    itemEntity.getUnitPrice(),
                    itemEntity.getQtyOnHand()));
        }
    }
    
}
