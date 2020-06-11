package com.f2c.prodmaint.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


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
	@Column(name="STOCK_STATUS_ID")
	private int stockStatusId;

	@Column(name="STOCKS_CLOSED")
	private int stocksClosed;

	@Column(name="STOCKS_OPEN")
	private int stocksOpen;

	//bi-directional many-to-one association to ProductStock
	@OneToMany(mappedBy="stockStatus")
	private List<ProductStock> productStocks;

	public StockStatus() {
	}

	public int getStockStatusId() {
		return this.stockStatusId;
	}

	public void setStockStatusId(int stockStatusId) {
		this.stockStatusId = stockStatusId;
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

	public List<ProductStock> getProductStocks() {
		return this.productStocks;
	}

	public void setProductStocks(List<ProductStock> productStocks) {
		this.productStocks = productStocks;
	}

	public ProductStock addProductStock(ProductStock productStock) {
		getProductStocks().add(productStock);
		productStock.setStockStatus(this);

		return productStock;
	}

	public ProductStock removeProductStock(ProductStock productStock) {
		getProductStocks().remove(productStock);
		productStock.setStockStatus(null);

		return productStock;
	}

}