package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Body_car")
public class Body
{
	int color;
	String vin;
	BodyType bodyType;
	
	public BoardType getType() {
		return type;
	}

	public void setType(BoardType type) {
		this.type = type;
	}
}
