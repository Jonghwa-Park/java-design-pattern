package chap6_prototype.framework;

public interface Product extends Cloneable{
	public void use(String s);
	public Product createClone();
}
