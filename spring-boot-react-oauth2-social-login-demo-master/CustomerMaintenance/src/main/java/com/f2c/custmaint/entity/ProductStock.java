package com.f2c.custmaint.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the product_stock database table.
 * 
 */
@Entity
@Table(name="product_stock")
@NamedQuery(name="ProductStock.findAll", query="SELECT p FROM ProductStock p")
public class ProductStock implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="product_detail_id")
	private int productDetailId;

	@Column(name="added_date")
	private Timestamp addedDate;

	@Column(name="last_updated_date")
	private Timestamp lastUpdatedDate;

	@Column(name="product_image")
	private byte[] productImage;

	@Column(name="product_long_desc")
	private String productLongDesc;

	@Column(name="product_price")
	private int productPrice;

	@Column(name="product_short_desc")
	private String productShortDesc;

	private String status;

	private int stock;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;

	//bi-directional many-to-one association to ProductCategory
	@ManyToOne
	@JoinColumn(name="product_category_id")
	private ProductCategory productCategory;

	//bi-directional many-to-one association to StockStatus
	@OneToMany(mappedBy="productStock")
	private List<StockStatus> stockStatuses;

	public ProductStock() {
	}

	public int getProductDetailId() {
		return this.productDetailId;
	}

	public void setProductDetailId(int productDetailId) {
		this.productDetailId = productDetailId;
	}

	public Timestamp getAddedDate() {
		return this.addedDate;
	}

	public void setAddedDate(Timestamp addedDate) {
		this.addedDate = addedDate;
	}

	public Timestamp getLastUpdatedDate() {
		return this.lastUpdatedDate;
	}

	public void setLastUpdatedDate(Timestamp lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public byte[] getProductImage() {
		return this.productImage;
	}

	public void setProductImage(byte[] productImage) {
		this.productImage = productImage;
	}

	public String getProductLongDesc() {
		return this.productLongDesc;
	}

	public void setProductLongDesc(String productLongDesc) {
		this.productLongDesc = productLongDesc;
	}

	public int getProductPrice() {
		return this.productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductShortDesc() {
		return this.productShortDesc;
	}

	public void setProductShortDesc(String productShortDesc) {
		this.productShortDesc = productShortDesc;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public ProductCategory getProductCategory() {
		return this.productCategory;
	}

	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}

	public List<StockStatus> getStockStatuses() {
		return this.stockStatuses;
	}

	public void setStockStatuses(List<StockStatus> stockStatuses) {
		this.stockStatuses = stockStatuses;
	}

	public StockStatus addStockStatus(StockStatus stockStatus) {
		getStockStatuses().add(stockStatus);
		stockStatus.setProductStock(this);

		return stockStatus;
	}

	public StockStatus removeStockStatus(StockStatus stockStatus) {
		getStockStatuses().remove(stockStatus);
		stockStatus.setProductStock(null);

		return stockStatus;
	}

}