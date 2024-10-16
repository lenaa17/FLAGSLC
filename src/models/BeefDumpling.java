package models;

public class BeefDumpling  extends Dumpling{

	public BeefDumpling(String ingredients, String name, Integer price) {
		super(ingredients, name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeDumpling() {
		System.out.println("Streaming Beef");
		System.out.println("Wrapped into dumpling");
		System.out.println("Dumpling is ready");
		
	}

}
