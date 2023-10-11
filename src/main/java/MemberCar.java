public class MemberCar {
	private long id;
	Member member;
	Car car;

	private String carRegistrationNumber;
	private String carColor;
	
	public MemberCar() {
		super();
	}

	public MemberCar(long id, long memberid, long carid, String carRegistrationNumber, String carColor) {
		super();
		this.id = id;
		this.carRegistrationNumber = carRegistrationNumber;
		this.carColor = carColor;
	}

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCarRegistrationNumber() {
		return carRegistrationNumber;
	}

	public void setCarRegistrationNumber(String carRegistrationNumber) {
		this.carRegistrationNumber = carRegistrationNumber;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	
	
}