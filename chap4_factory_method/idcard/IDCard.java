package chap4_factory_method.idcard;

import chap4_factory_method.framework.Product;

public class IDCard extends Product {
	private String owner;
	
	public IDCard(String owner) {
		this.owner = owner;
		System.out.println(owner + "의 카드를 만듭니다. ");
	}
	
	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println(owner + "의 카드를 사용 합니다.");
	}
	
	public String getOwner() {
		return this.owner;
	}

}
