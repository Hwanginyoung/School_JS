package shop.vo;

public class OrderListVo {
	private int orderListId;
	private int productId;
	private int unitCount;
	private int productPrice;
	private ProductVo product;
	public OrderListVo() {}
	
	
	public OrderListVo(int orderListId, int productId, int unitCount, int productPrice) {
		super();
		this.orderListId = orderListId;
		this.productId = productId;
		this.unitCount = unitCount;
		this.productPrice = productPrice;
	}

	
	public int getOrderListId() {
		return orderListId;
	}

	public int getProductId() {
		return productId;
	}

	public int getUnitCount() {
		return unitCount;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public ProductVo getProduct() {
		return product;
	}

	public void setOrderListId(int orderListId) {
		this.orderListId = orderListId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public void setUnitCount(int unitCount) {
		this.unitCount = unitCount;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public void setProduct(ProductVo product) {
		this.product = product;
	}

	
	@Override
	public String toString() {
		return "OrderListVo []";
	}
	
	
}
