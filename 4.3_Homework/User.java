
public class User {
	private int id;
	private String name;
	private String email;
	private String tcNo;
	
	public  User() {
		
	}
	
	public  User(int id,String name,String email,String tcNo) {
		this.id=id;
		this.name=name;
		this.email=email;
		this.tcNo=tcNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTcNo() {
		return tcNo;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
	
	

}
