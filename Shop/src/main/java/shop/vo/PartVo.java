package shop.vo;

import java.util.ArrayList;
import java.util.List;

public class PartVo {
	private int partId;
	private String partTag;
	private String partName;
	List<ProductVo> products = new ArrayList<>();
	public PartVo() {}
	
	public PartVo(int partId, String partTag, String partName) {
		super();
		this.partId = partId;
		this.partTag = partTag;
		this.partName = partName;
	}

	public int getPartId() {
		return partId;
	}

	public String getPartTag() {
		return partTag;
	}

	public String getPartName() {
		return partName;
	}

	public List<ProductVo> getProducts() {
		return products;
	}

	public void setPartId(int partId) {
		this.partId = partId;
	}

	public void setPartTag(String partTag) {
		this.partTag = partTag;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public void setProducts(List<ProductVo> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "PartVo []";
	}
	
	
	public void addProduct(ProductVo product) {
		products.add(product);
	}
	
	public void removeProduct(int productId) {
		for(ProductVo product: products) {
			if(product.getProductId() == productId) {
				products.remove(product);
				return;
			}
		}
	}
	public ProductVo findProduct (int productId) {
		for(ProductVo product: products) {
			if(product.getProductId() == productId) {
				return product;
			}
			return null;
		}
	}
	
}
