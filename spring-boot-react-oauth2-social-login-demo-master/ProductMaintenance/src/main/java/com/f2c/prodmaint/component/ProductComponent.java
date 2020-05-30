package com.f2c.prodmaint.component;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.f2c.prodmaint.entity.Product;
import com.f2c.prodmaint.entity.ProductStock;
import com.f2c.prodmaint.entity.beans.ProductCategoryDetails;
import com.f2c.prodmaint.entity.beans.ProductDetails;
import com.f2c.prodmaint.entity.beans.ProductStockDetails;
import com.f2c.prodmaint.repository.ProductRepository;

@Service
public class ProductComponent {
	private static final Logger logger = LoggerFactory.getLogger(ProductComponent.class);

	ProductRepository productRepository;

	@Autowired
	public ProductComponent(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public ProductDetails getProductDetails(String productCode) {
		Product product = productRepository.findProductByProductCode(productCode);
		ProductDetails productDetails = getProductDetailsFromEntity(product);
		return productDetails;
	}

	private ProductDetails getProductDetailsFromEntity(Product product) {
		ProductDetails productDetails = new ProductDetails();
		productDetails.setProductId(product.getProductId());
		productDetails.setProductDesc(product.getProductDesc());
		productDetails.setLastAdded(product.getLastAdded());
		productDetails.setProductCode(product.getProductCode());

		ProductCategoryDetails productCategory = new ProductCategoryDetails();
		productCategory.setProduct_category_code(product.getProductCategory().getProductCategoryCode());
		productCategory.setProduct_category_desc(product.getProductCategory().getProductCategoryDesc());
		productCategory.setProduct_category_id(product.getProductCategory().getProductCategoryId());
		productDetails.setProductCategory(productCategory);

		List<ProductStockDetails> productStocks = new ArrayList<ProductStockDetails>();
		for (ProductStock productStock : product.getProductStocks()) {
			ProductStockDetails productStockDetails = new ProductStockDetails();
			productStockDetails.setProductDetailId(productStock.getProductDetailId());
			productStockDetails.setOrderedQuantity(productStock.getQuantity());
			productStockDetails.setStockStatusId(productStock.getStockStatus().getStockStatusId());
			productStockDetails.setStocksOpen(productStock.getStockStatus().getStocksOpen());
			productStockDetails.setStocksClosed(productStock.getStockStatus().getStocksClosed());
			productStocks.add(productStockDetails);
		}
		productDetails.setProductStocks(productStocks);
		return productDetails;
	}

	public List<ProductDetails> getAllActiveProducts() {
		List<Product> productEntityList = productRepository.findAll();
		List<ProductDetails> productDetailsList = new ArrayList<ProductDetails>();
		for (Product product : productEntityList) {
			productDetailsList.add(getProductDetailsFromEntity(product));
		}
		return productDetailsList;
	}

}
