package MiniProject;

import java.util.Scanner;

class personalInfo{
	private String hobby;
	private String homeNumber;
	private String smoking;

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public void setHomeNumber(String homeNumber) {
		this.homeNumber = homeNumber;
	}
	public void setSmoking(String smoking) {
		this.smoking = smoking;
	}
	public String getHobby() {
		return hobby;
	}
	public String getHomeNumber() {
		return homeNumber;
	}
	public String getSmoking() {
		return smoking;
	}
	public void Input(String hobby, String homeNumber, String smoking) {
		if (hobby.isEmpty()) {
		}else {
			System.out.println("취미: "+hobby);
		}
		if (homeNumber.isEmpty()) {
		}else {
			System.out.println("집 전화번호: "+homeNumber);
		}
		if (smoking.isEmpty()) {
		}else {
			if (smoking.equals("핀다")) {
				System.out.println("흡연자");
			}else {
				System.out.println("비흡연자");
			}
		}
	}

	}

public class choices {
	public static void main(String[] args) {
		System.out.println("선택 입력 정보입니다.\n해당 사항이 없을 경우 enter를 누르세요.");
		personalInfo myInfo = new personalInfo();
		Scanner sc = new Scanner(System.in);
		System.out.print("취미: ");
		String myHobby = sc.nextLine();
		System.out.print("집 전화번호 : ");
		String myHomeNumber = sc.nextLine();
		System.out.print("흡연 여부(핀다, 안핀다로 응답): ");
		String mySmoking = sc.nextLine();
		
		myInfo.setHobby(myHobby);
		myInfo.setHomeNumber(myHomeNumber);
		myInfo.setSmoking(mySmoking);

		myInfo.Input(myInfo.getHobby(),myInfo.getHomeNumber(),myInfo.getSmoking());
	}
}

