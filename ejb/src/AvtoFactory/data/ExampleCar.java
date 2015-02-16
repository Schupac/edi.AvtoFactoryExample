package src.AvtoFactoryExample.data;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import src.AvtoFactoryExample.model.ExampleCarModel;
@Stateless

public class ExampleCar {

	@PersistenceContext
	private EntityManager em;
	

	public exmplCar find(String id) {
		return em.find(exmplCar.class, id);
	}
	
	public exmplCar create(exmplCar car){
		em.persist(car);
		em.flush();
		
		return car;
	}
	
	public EntityManager getEm() {
		return em;
	}
}
