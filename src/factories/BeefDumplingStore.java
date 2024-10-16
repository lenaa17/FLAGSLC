package factories;

import java.util.Random;

import models.BeefDumpling;
import models.Dumpling;

public class BeefDumplingStore  extends DumplingStore{

	@Override
	protected Dumpling createDumpling() {
		String material = "beef,etc";
		String name = "Beef Dumpling";
		Integer price = new Random().nextInt(2) == 0 ? 5000 : 60000;
		return new BeefDumpling(material, name, price);
	
	}
	

}
