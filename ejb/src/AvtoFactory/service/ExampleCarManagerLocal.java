package src.AvtoFactoryExample.servise;

import javax.ejb.Local;
import src.AvtoFactoryExample.model.ExampleCarModel;

@Local
public interface ExampleCarManagerLocal {

	ExampleCar create(int doorsCount, int power);

	ExamleCar get(String id);

}
