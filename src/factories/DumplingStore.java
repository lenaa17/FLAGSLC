package factories;

import models.Dumpling;

public abstract class DumplingStore {

	protected  abstract  Dumpling createDumpling();
	
	public Dumpling orderDumpling() {
	
		System.out.println("Create Dumpling");
		Dumpling dumpling = createDumpling();
		dumpling.makeDumpling();
		System.out.println("Serving client");
		return dumpling;
		
	}
	
}
