import java.util.Date;

public class Member {

	private long id;
	private String firstname;
	private String lastname;
	private String email;
	private String contactNum;
	private Date licStartDate;
	private Date licExpiryDate;
	
	public Member() {
		super();
	}

	/*
	 * public static Members getstr(String str) throws Exception { String[] strArr =
	 * str.split(","); long id = Long.parseLong(strArr[0]); String firstname =
	 * strArr[1]; String lastname = strArr[2]; String email = strArr[3]; String
	 * contactNum = strArr[4]; Date licSdate = new
	 * SimpleDateFormat("dd-MM-yyyy").parse(strArr[5]); Date licEdate = new
	 * SimpleDateFormat("dd-MM-yyyy").parse(strArr[6]); return new
	 * Members(id,firstname,lastname,email,contactNum,licSdate,licEdate); }
	 */
	public Member(long id, String firstname, String lastname, String email, 
					String contactNum,Date licStartDate, Date licExpiryDate) {
		this();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.contactNum = contactNum;
		this.licStartDate = licStartDate;
		this.licExpiryDate = licExpiryDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNum() {
		return contactNum;
	}

	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}
	public Date getLicStartDate() {
		 return licStartDate; }
	 
	 public void setLicStartDate(Date licStartDate) { 
		 this.licStartDate =licStartDate; }

	 public Date getLicExpiryDate() { 
		 return licExpiryDate; }
	 public void setLicExpiryDate(Date licExpiryDate) { 
		 this.licExpiryDate =licExpiryDate; }
	
	 
	
}
