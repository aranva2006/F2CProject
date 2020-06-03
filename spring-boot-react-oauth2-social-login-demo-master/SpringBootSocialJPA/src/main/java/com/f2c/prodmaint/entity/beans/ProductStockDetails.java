package com.f2c.prodmaint.entity.beans;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)	
public class ProductStockDetails implements Serializable {
	private static final long serialVersionUID = 1L;
	private int productDetailId;
	private int stockStatusId;
	private int orderedQuantity;
	private int stocksOpen;
	private int stocksClosed;

	public ProductStockDetails() {
	}

	public int getProductDetailId() {
		return productDetailId;
	}

	public void setProductDetailId(int productDetailId) {
		this.productDetailId = productDetailId;
	}

	public int getStockStatusId() {
		return stockStatusId;
	}

	public void setStockStatusId(int stockStatusId) {
		this.stockStatusId = stockStatusId;
	}

	public int getOrderedQuantity() {
		return orderedQuantity;
	}

	public void setOrderedQuantity(int orderedQuantity) {
		this.orderedQuantity = orderedQuantity;
	}

	public int getStocksOpen() {
		return stocksOpen;
	}

	public void setStocksOpen(int stocksOpen) {
		this.stocksOpen = stocksOpen;
	}

	public int getStocksClosed() {
		return stocksClosed;
	}

	public void setStocksClosed(int stocksClosed) {
		this.stocksClosed = stocksClosed;
	}

}