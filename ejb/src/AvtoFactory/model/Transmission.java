package Model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Transmission_car")
public class Transmission {
	
	TransmissionType transmissionType;
	
	private int serialNumber;
	@Column(name="serialNumber")
	public int getserialNumber() {
		return serialNumber;
	}

	public void setPower(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	
}
