package jp.co.internous.kingdom.model.domain.dto;

public class PurchaseHistoryDto {
	
	private String purchasedAt;
	
	private String productName;
	
	private int price;
	
	private int productCount;
	
	private String familyName;
	
	private String firstName;
	
	private String address;
	
	public String getPurchasedAt() {
		return purchasedAt;
	}
	
	public void setPurchasedAt(String purchaseAt) {
		this.purchasedAt=purchaseAt;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName=productName;
	}
	public long getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	
	public long getProductCount() {
		return productCount;
	}
	
	public void setProductCount(int productCount) {
		this.productCount=productCount;
	}
	
	public String getFamilyName() {
		return familyName;
	}
	
	public void setFamilyName(String familyName) {
		this.familyName=familyName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}

}
