package com.demo.warehouseservice.dto;

import java.io.Serializable;

public class Stock implements Serializable {
    /**
     * 商品品类编号
     */
    private Long skuId;
    /**
     * 商品品类名称
     */
    private String title;
    /**
     * 库存数量
     */
    private Integer quantity;
    /**
     * 单位
     */
    private String unit;
    /**
     * 描述信息
     */
    private String description;

    public Stock(Long skuId, String title, Integer quantity, String unit) {
        this.skuId = skuId;
        this.title = title;
        this.quantity = quantity;
        this.unit = unit;
    }

    public Stock() {
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "skuId=" + skuId +
                ", title='" + title + '\'' +
                ", quantity=" + quantity +
                ", unit='" + unit + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
