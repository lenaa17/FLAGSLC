package models;

public class ChickenDumpling extends Dumpling {

	public ChickenDumpling(String ingredients, String name, Integer price) {
		super(ingredients, name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeDumpling() {
		// TODO Auto-generated method stub
		System.out.println("Grilling chicken");
		System.out.println("wrapped into dumpling");
		System.out.println("Chcicken Dumpling");
	}

}
