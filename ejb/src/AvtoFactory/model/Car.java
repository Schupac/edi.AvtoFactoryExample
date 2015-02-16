package Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@MappedSuperclass
public class Car extends IdObject {
  private BodyType body;
  private Engine engine;
  private Transmission transmission;
  private List<Door> doors;
  
  
  @OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="engine_id")
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="car_id")
	public List<Door> getDoors() {
		return doors;
	}

	public void setDoors(List<Door> doors) {
		this.doors = doors;
	}
	
}
