package com.mycrm.backend.core.service;

import com.mycrm.backend.core.entity.Order;
import com.mycrm.backend.core.entity.TotalExcludeTaxe;
import com.mycrm.backend.core.repository.ExcludeTaxeRepository;
import com.mycrm.backend.core.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ExcludeTaxeRepository excludeTaxeRepository;

    public List<Order> getOrderList(){
        return orderRepository.findAll();
    }
    public List<TotalExcludeTaxe> getTaxeList(){
        return excludeTaxeRepository.findAll();
    }
}
