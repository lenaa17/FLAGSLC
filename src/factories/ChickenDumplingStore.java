package factories;

import java.util.Random;

import models.ChickenDumpling;
import models.Dumpling;

public class ChickenDumplingStore  extends DumplingStore{

	@Override
	protected Dumpling createDumpling() {
		String materials = "Chicken,etc";
		String name = "Chicken Dumpling";
		Integer price = new Random().nextInt(2) == 0 ? 4000 : 60000;
		
		return new ChickenDumpling(materials, name, price);
	}
	

}
