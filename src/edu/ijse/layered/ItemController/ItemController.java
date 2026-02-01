package edu.ijse.layered.ItemController;

import edu.ijse.layered.dto.ItemDto;
import edu.ijse.layered.service.ServiceFactory;
import edu.ijse.layered.service.custom.ItemService;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author neths
 */
public class ItemController {

    

    private ItemService itemService = (ItemService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ITEM);

    public String saveItem(ItemDto dto) throws Exception{
        return itemService.saveItem(dto);
    }
    public String updateItem(ItemDto dto) throws Exception {
        return itemService.updateItem(dto);
    }
}
