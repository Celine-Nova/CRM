package com.mycrm.backend.core.controller;

import com.mycrm.backend.core.entity.Order;
import com.mycrm.backend.core.entity.TotalExcludeTaxe;
import com.mycrm.backend.core.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RestController // Json
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")
    public List<Order> getOrders() {
        return orderService.getOrderList();
    }
    @GetMapping("orders/taxe")
    public List<TotalExcludeTaxe> getTaxes() {
         //List <TotalExcludeTaxe> arrays = orderService.getTaxeList();
        //    for (TotalExcludeTaxe array : arrays){
        return orderService.getTaxeList() ;
    }
}
