package shop.vo;

import shop.type.ForSaleType;

public class ProductVo {
	private int productId;
	private String productName;
	private int productPRice;
	private ForSaleType forSale;
	private int partId;
	public ProductVo() {}
	
	public ProductVo(int productId, String productName, int productPRice, ForSaleType forSale, int partId) {
		this.productId = productId;
		this.productName = productName;
		this.productPRice = productPRice;
		this.forSale = forSale;
		this.partId = partId;
	}

	
	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public int getProductPRice() {
		return productPRice;
	}

	public ForSaleType getForSale() {
		return forSale;
	}

	public int getPartId() {
		return partId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setProductPRice(int productPRice) {
		this.productPRice = productPRice;
	}

	public void setForSale(ForSaleType forSale) {
		this.forSale = forSale;
	}

	public void setPartId(int partId) {
		this.partId = partId;
	}

	
	@Override
	public String toString() {
		return "ProductVo []";
	}
	
	
	
}
