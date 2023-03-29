package Edit;

import java.util.Scanner;

class Test1{
	String ID = "";
	String PW = "";
}

//로그인 클래스
//입력: 	아이디와 비밀번호를 입력받는다.
//출력: 	아이디가 없으면 아이디 없음,
//		아이디가 있는데 비밀번호가 틀렸으면 비밀번호 틀렸음
//		둘 다 맞으면 로그인 성공!
public class Login {
	Scanner scan = new Scanner(System.in);
	int id_index = 0;
	int count = 1;
	//임시로 객체 만들기
	Test1[] arrTest = new Test1[10];
	//바꿔야 할 것 Test1
	public void login(Test1[] arr) {
		String[] arrID = new String[arr.length];//ID들 모아놓은 배열
		String[] arrPW = new String[arr.length];//PW 모아놓은 배열
		//객체배열에서 객체의 ID값을 String 배열로 모음
		for(int i=0; i<arr.length; i++) {
			arrID[i] = arr[i].ID;
		}
		//객체배열에서 객체의 PW값을 String 배열로 모음
		for(int i=0; i<arr.length; i++) {
			arrPW[i] = arr[i].PW;
		}
		while(count<=3) {
			System.out.print("아이디: ");
			String ID = scan.nextLine();//ID 입력받음
			
			//아이디가 없다면
			if(!checkID(arrID, ID)) {
				System.out.println("입력된 아이디가 없습니다.\n다시 입력하세요.");
				continue;
			}
			System.out.print("비밀번호: ");
			String PW = scan.nextLine();//PW 입력받음
			
			//아이디가 있다면
			if(checkPW(arrPW,PW)) {//비밀번호가 맞았다면
				System.out.println("로그인 성공!");
				return;//메소드 종료
			}
			//비밀번호가 틀렸다면
			else{
				if(count == 3) {
					System.out.println("비밀번호가 틀렸습니다.");
					System.out.println("입력횟수를 초과하였습니다. 꺼.");
					break;
				}
				System.out.println("비밀번호가 틀렸습니다. 다시 입력하세요.");
				System.out.println("틀린 횟수: "+count);
				count++;
			}
		}
	}
	
	//아이디 목록에서 해당 아이디가 있는지 찾는 메소드
	//찾으면 true, 없으면 false 반환
	public boolean checkID(String[] arrID,String ID) {
		boolean flagID_OK = false;
		
		for(int i=0; i<arrID.length; i++) {
			if(arrID[i].equals(ID)) {
				flagID_OK = true;
				id_index = i;
				break;
			}
		}
		
		return flagID_OK;
	}
	
	//입력된 비밀번호가 맞는지 확인하는 메소드
	//맞으면 true, 없으면 false 반환
	public boolean checkPW(String[] arrPW, String PW) {
		boolean flagPW_OK = false;
		
		if(arrPW[id_index].equals(PW)) {
			flagPW_OK = true;
		}
		
		return flagPW_OK; 
	}
	
}
