package src.AvtoFactory.service;
import java.until.ArrayList;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.naming.InitialContext;

import src.AvtoFactoryExample.data.ExampleCar;
import src.AvtoFactoryExample.model.BoardType;
import src.AvtoFactoryExample.model.Door;
import src.AvtoFactoryExample.model.Engine;
import src.AvtoFactoryExample.model.ExampleCar;
@Stateless
public class ExampleCarManager implements ExampleCarManagerLocal{
	@EJB
	private ExampleCar db;
	
	@Override
	public ExampleCar create(int doorsCount, int power) {
		if(doorsCount <= 0)
			throw new IllegalArgumentException("Ваш автомобиль без дверей!");
		
		if(power <= 0)
			throw new IllegalArgumentException("Без Мощности автомобиль не сдвинется с места!");
		
		ExampleCar car = new ExampleCar();
		
		List<Door> doors = new ArrayList<Door>();
		
		for (int i = 0; i < doorsCount; i++) {
			Door d = new Door();
			d.setEletricity(false);
			
			doors.add(d);
		}
		
		Engine eng = new Engine();
		eng.setHorsePower(power);
		
		car.setDoors(doors);
		car.setEngine(eng);
		
		car.setLabel("Example Car");
		car.setType(BoardType.HATCHBACK);
		car.setDoorsCount(doorsCount);
		
		return db.create(car);
	}

	@Override
	public ExampleCar get(String id) {
		return db.find(id);
	}
	

}
