package Edit;
//피드백 드리겠습니다.
//1. 클래스 이름이 앞글자가 대문자가 아닙니다.
//2. 실제로 필드가 있는 클래스는 personalInfo인데 파일 이름과 다릅니다. 통일해주는 것이 좋습니다.
//3. Input메소드로 매개변수 값을 받았을 때 set메소드로 매개변수값을 필드값에 저장하는 기능을 추가하면 좋을 것 같습니다.
//4. 51번째 줄 처럼 중괄호 위치가 애매한 상황은 헷갈릴 수 있으므로 들여쓰기, 내어쓰기를 신경쓰는 습관을 들이면 좋을 것 같습니다.
import java.util.Scanner;

class personalInfo{
	private String hobby;
	private String homeNumber;
	private String smoking;

	public void setHobby(String hobby) {
		if(hobby.equals("")) this.hobby = "공란";
		else this.hobby = hobby;
	}
	public void setHomeNumber(String homeNumber) {
		if(homeNumber.equals("")) this.homeNumber = "공란";
		else this.homeNumber = homeNumber;
	}
	public void setSmoking(String smoking) {
		if(smoking.equals("")) this.smoking = "공란";
		else this.smoking = smoking;
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
		sc.close();
	}
}

