package com.demo.warehouseservice.dubbo;

import com.demo.warehouseservice.dto.Stock;

public interface WarehouseService {
    //查询库存
    public Stock getStock(Long skuId);
}
