package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Enjine_car")
import javax.persistence.Entity;

public class Engine extends IdObject{
	double volume;
	String serialNumber;
	EngineType engineType;
	
	private int Power;
	@Column(name="Power")
	public int getPower() {
		return Power;
	}



	public void setPower(int Power) {
		this.Power = Power;
	}
	
	
	

}
