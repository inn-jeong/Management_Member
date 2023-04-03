package Edit;

import java.io.FileWriter;

public class Output {
	private String name;
	private String address;
	private String gender;
	private String phoneNumber;
	private String year;
	private String email;
	private String hobby;
	private String homeNumber;
	private String smoking;
	private String ID;
	private String PW;

	public Output(Member member) {
		this.name = member.getName();
		this.address = member.getAddress();
		this.gender = member.getGender();
		this.phoneNumber = member.getphoneNumber();
		this.year = member.getYear();
		this.email = member.getEmail();
		this.hobby = member.getHobby();
		this.homeNumber = member.getHomeNumber();
		this.smoking = member.getSmoking();
		this.ID = member.getID();
		this.PW = member.getPW();
	}
	public void writeToFile(String output) throws Exception {
		FileWriter writer = new FileWriter(output+name+".txt");
		writer.write("Name: " + name + "\n");
		writer.write("Address: " + address + "\n");
		writer.write("Gender: " + gender + "\n");
		writer.write("Phone Number: " + phoneNumber + "\n");
		writer.write("Year: " + year + "\n");
		writer.write("Email: " + email + "\n");
		writer.write("Hobby: " + hobby + "\n");
		writer.write("Home Number: " + homeNumber + "\n");
		writer.write("Smoking: " + smoking + "\n");
		writer.write("ID: " + ID + "\n");
		writer.write("PW: " + PW + "\n");
		writer.close();
		System.out.println("Output saved to file: " + output+name+".txt");
	}

}
