
public class ExampleCarModel
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Example_car"){
	public class ExampleCarModel extends Car {
		
		private String label;

		@Column(name="car_label")
		public String getLabel() {
			return label;
		}

		public void setLabel(String label) {
			this.label = label;
		}
		

	}

}
