package Edit;

//회원 객체, 
public class Member {
	private String name;
	private String Address;
	private String gender;
	private String phoneNumber;
	private String year;
	private String email;
	private String hobby;
	private String homeNumber;
	private String smoking;
	private String ID;
	private String PW;

////////////////////개인정보 입력 받으면 값 저장/////////////////////////
	public void setInput(InputCheck input) {
		this.name = input.getName();
		this.Address = input.getAddres();
		this.gender = input.getGender();
		this.phoneNumber = input.getPhoneNum();
		this.year = input.getYear();
		this.email = input.getEmail();
	}
	
///////////////////선택사항 저장///////////////////////////
	public void setInput(personalInfo choice) {
		this.hobby = choice.getHobby();
		this.homeNumber = choice.getHomeNumber();
		this.smoking = choice.getSmoking();
	}
	
///////////////////id pw 저장////////////////////////////
	public void setInput(Info info) {
		this.ID = ""; // 수정
		this.PW = "";
	}

	
	////////////set///////////////////
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.Address = address;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setphonenumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public void setHomeNumber(String homeNumber) {
		this.homeNumber = homeNumber;
	}
	public void setID(String iD) {
		this.ID = iD;
	}
	public void setPW(String pW) {
		this.PW = pW;
	}
	public void setSmoking(String smoking) {
		this.smoking = smoking;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	/////////////////get/////////////////////
	public String getAddress() {
		return Address;
	}
	public String getEmail() {
		return email;
	}
	public String getGender() {
		return gender;
	}
	public String getHobby() {
		return hobby;
	}
	public String getHomeNumber() {
		return homeNumber;
	}
	public String getID() {
		return ID;
	}
	public String getName() {
		return name;
	}
	public String getphoneNumber() {
		return phoneNumber;
	}
	public String getPW() {
		return PW;
	}
	public String getSmoking() {
		return smoking;
	}
	public String getYear() {
		return year;
	}
}
