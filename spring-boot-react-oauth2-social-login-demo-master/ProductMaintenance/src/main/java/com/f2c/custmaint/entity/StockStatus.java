package com.f2c.custmaint.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the stock_status database table.
 * 
 */
@Entity
@Table(name="stock_status")
@NamedQuery(name="StockStatus.findAll", query="SELECT s FROM StockStatus s")
public class StockStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="stock_status_id")
	private int stockStatusId;

	@Column(name="product_detail_id")
	private int productDetailId;

	@Column(name="stocks_closed")
	private int stocksClosed;

	@Column(name="stocks_open")
	private int stocksOpen;

	public StockStatus() {
	}

	public int getStockStatusId() {
		return this.stockStatusId;
	}

	public void setStockStatusId(int stockStatusId) {
		this.stockStatusId = stockStatusId;
	}

	public int getProductDetailId() {
		return this.productDetailId;
	}

	public void setProductDetailId(int productDetailId) {
		this.productDetailId = productDetailId;
	}

	public int getStocksClosed() {
		return this.stocksClosed;
	}

	public void setStocksClosed(int stocksClosed) {
		this.stocksClosed = stocksClosed;
	}

	public int getStocksOpen() {
		return this.stocksOpen;
	}

	public void setStocksOpen(int stocksOpen) {
		this.stocksOpen = stocksOpen;
	}

}