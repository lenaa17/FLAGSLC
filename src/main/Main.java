package main;

import factories.BeefDumplingStore;
import factories.ChickenDumplingStore;
import factories.DumplingStore;
import models.BeefDumpling;
import models.Dumpling;

public class Main {

	public Main() {
		
		DumplingStore BeefStore = new BeefDumplingStore();
		Dumpling dumpling1 = BeefStore.orderDumpling();
		
		System.out.println(" ");
		
		DumplingStore ChickenStore = new ChickenDumplingStore();
		Dumpling dumpling2 = ChickenStore.orderDumpling();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
