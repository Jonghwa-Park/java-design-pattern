package chap4_factory_method.idcard;

import java.util.ArrayList;
import java.util.List;

import chap4_factory_method.framework.Factory;
import chap4_factory_method.framework.Product;

public class IDCardFactory extends Factory {
	private List<String> owners = new ArrayList<>();
	@Override
	protected Product createProduct(String owner) {
		// TODO Auto-generated method stub
		return new IDCard(owner);
	}

	@Override
	protected void registerProduct(Product p) {
		// TODO Auto-generated method stub
		IDCard idcard = (IDCard)p;
		owners.add(idcard.getOwner());
	}
	
	public List<String> getOwners(){
		return owners;
	}

}
