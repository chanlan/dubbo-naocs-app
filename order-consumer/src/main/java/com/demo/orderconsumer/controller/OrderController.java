package com.demo.orderconsumer.controller;

import com.demo.warehouseservice.dto.Stock;
import com.demo.warehouseservice.dubbo.WarehouseService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class OrderController {

    @DubboReference
    private WarehouseService warehouseService;

    @GetMapping("/create_order")
    public Map createOrder(Long skuId, Long salesQuantity) {
        Map result = new LinkedHashMap();

        Stock stock = warehouseService.getStock(skuId);
        if (stock.getQuantity() >= salesQuantity) {
            result.put("code", "SUCCESS");
            result.put("skuId", skuId);
            result.put("message", "订单创建成功");
        } else if (stock.getQuantity() < salesQuantity) {
            result.put("code", "NOT_ENOUGH_STOCK");
            result.put("skuId", skuId);
            result.put("message", "商品库存数量不足");
        }
        return result;
    }
}
