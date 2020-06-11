package com.f2c.prodmaint.entity.beans;

import java.io.Serializable;

public class ProductStockDetails implements Serializable {
	private static final long serialVersionUID = 1L;
	private int productStockId;
	private int stockStatusId;
	private int orderedQuantity;
	private int stocksOpen;
	private int stocksClosed;
	private int price;
	private ProductSourceDetails productSource;
	
	public ProductStockDetails() {
	}

	public int getProductStockId() {
		return productStockId;
	}

	public void setProductStockId(int productStockId) {
		this.productStockId = productStockId;
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

	public ProductSourceDetails getProductSource() {
		return productSource;
	}

	public void setProductSource(ProductSourceDetails productSource) {
		this.productSource = productSource;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}