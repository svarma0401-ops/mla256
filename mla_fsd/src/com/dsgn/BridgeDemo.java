package com.dsgn;


interface BrandType
{
	void anyBrandType();
	
}

abstract class Brand{
	protected BrandType brand1;
	protected BrandType brand2;
	
	public Brand(BrandType type1, BrandType type2) {
		this.brand1 = type1;
		this.brand2 = type2;
	}
	
	public abstract void designCompany();
}

class OriginalBrand implements BrandType{
	
	@Override
	public void anyBrandType() {
		System.out.println("Original");
	}
}

class CopyBrand implements BrandType{

	@Override
	public void anyBrandType() {
		System.out.println("Clone");
	}
}

class AppleB1 extends Brand
{
	public AppleB1(BrandType type1, BrandType type2) {
		super(type1,type2);
	}
	
	public void designCompany() {
		System.out.println("Apple India");
		brand1.anyBrandType();
		brand2.anyBrandType();
	}
}

class DellB1 extends Brand
{
	public DellB1(BrandType type1, BrandType type2) {
		super(type1,type2);
	}
	
	public void designCompany() {
		System.out.println("Dell India");
		brand1.anyBrandType();
		brand2.anyBrandType();
	}
}

class ProductStatus implements BrandType{

	@Override
	public void anyBrandType() {
		System.out.println("Completed");
	}
	
}

class ProductDelivered implements BrandType{

	@Override
	public void anyBrandType() {
	System.out.println("Delivered");
	}
	
}
public class BridgeDemo {

	public static void main(String[] args) {
	
		Brand obj1 = new AppleB1(new ProductStatus(), new ProductDelivered());
		Brand obj2 = new DellB1(new ProductStatus(), new ProductDelivered());
		
		obj1.designCompany();
		obj2.designCompany();
	}

}
