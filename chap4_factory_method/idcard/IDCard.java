package chap4_factory_method.idcard;

import chap4_factory_method.framework.Product;

public class IDCard extends Product {
	private String owner;
	
	public IDCard(String owner) {
		this.owner = owner;
		System.out.println(owner + "�� ī�带 ����ϴ�. ");
	}
	
	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println(owner + "�� ī�带 ��� �մϴ�.");
	}
	
	public String getOwner() {
		return this.owner;
	}

}
