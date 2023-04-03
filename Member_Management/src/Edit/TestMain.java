package Edit;

//import java.awt.Checkbox;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) throws Exception {
		String name,phoneNum,address,email,year,homeNumber, hobby, smoking;
		int choice,num;
		InputCheck input = new InputCheck();
		personalInfo perInfo = new personalInfo(); 
		Scanner scan = new Scanner(System.in);
		System.out.print("입력할 인원수: ");
		num= scan.nextInt();
		Member[] arrMember = new Member[num]; //num크기의 객체배열 생성
		boolean checker = false;
		boolean flag_login = false;
		int counter = num;
		num=0;
		do {
			//////////////////////////////////이름 입력//////////////////////////////
			do {
				//공백 입력 방지를 위해 next() 메소드 사용
				System.out.print("이름: " );
				name = scan.next();
				checker=input.checkName(name);
				if (!checker) {
					System.out.println("한글만 입력해주세요.");
				}
			} while (!checker);

			///////////////////////////////주민번호 입력//////////////////////////////
			System.out.print("주민등록번호 첫번째 자리부터"
					+ "\n7번째 자리까지 입력 해주세요"
					+ "\n입력: ");
			checker = false;

			do {	 
				year=scan.next();
				checker=input.checkYear(year);
				if (!checker) {
					System.out.println("잘못 입력하셨습니다");
				}
			}while(!checker);

			///////////////////////////////전화번호 입력//////////////////////////////
			checker = false;
			System.out.print("전화 번호를 입력해주세요"
					+ "\n하이픈 상관없이"
					+ "\n휴대폰번호 입력: ");
			do {	 
				phoneNum=scan.next();
				checker=input.checkPhoneNum(phoneNum);
				if (!checker) {
					System.out.println("잘못 입력하셨습니다.");

				}
			}while(!checker);

			///////////////////////////////이메일 입력//////////////////////////////
			checker = false;
			do {	 
				System.out.println("-사용 가능한 이메일 도메인 번호-");
				System.out.println("1:google\n2:naver\n3.daum");
				System.out.print("도메인 번호 입력 ");
				choice = scan.nextInt();
				System.out.print("아이디 입력: ");
				email=scan.next();
				checker=input.checkEmail(email,choice);
				if (!checker) {
					System.out.println("영어와 숫자외 문자가 포함이 되어 있습니다.");
				}
			}while(!checker);

			///////////////////////////////주소 입력//////////////////////////////
			////////////////////확인 필요////////////////////////////
			checker=false;

			do {
				
				System.out.println("도로명 주소를 입력해주세요"); 
				
				address=scan.next();
				address+=scan.next();
				
				checker=input.checkAddress(address);
				if (!checker) {
					System.out.print("잘못입력 하셨습니다.");
				}
			}while(!checker);

			///////////////////////////집 전화번호 입력//////////////////////////////
			checker=false;
			System.out.println();
			System.out.println("이하 항목들은 선택사항입니다. 공백으로 작성하여도 됩니다.");
			System.out.print("집 전화번호: ");
			//			 do {
			scan.nextLine();
			homeNumber=scan.nextLine();
			//선택사항은 공백을 입력받을 수 있어야 하므로 nextLine 사용, 그런데 println에 의해 엔터로 인식해 입력이 씹힘
			//씹힘 방지를 위해 nextLine을 한번 더 해줌

			perInfo.setHomeNumber(homeNumber);
			//집 전화는 010으로 시작하지 않으므로 일단 체크는 패스
			//				checker=input.checkPhoneNum(homeNumber);
			//				if (!checker) {
			//					 System.out.println("문자가 포함되어 있습니다.");
			////				 }
			//			 }while(!checker);
			/////////////////////////////취미 입력//////////////////////////////
			checker=false;
			System.out.print("취미를 입력해주세요: ");
			do {

				hobby=scan.nextLine();
				//				 scan.nextLine();
				//취미는 일반적으로 한글로 작성하므로 임시로 checkName 메소드 사용
				checker=InputCheck.checkKor(hobby);
				if (!checker) {
					System.out.println("잘못 입력하셨습니다.");
				}
			}while(!checker);
			perInfo.setHobby(hobby);
			System.out.println(hobby);
			/////////////////////////////흡연여부 입력//////////////////////////////
			checker=false;
			System.out.print("흡연 여부(핀다,안핀다): ");
			do {
				smoking = scan.nextLine();
				checker=InputCheck.checkKor(smoking);
				if (!checker) {
					System.out.println("잘못 입력하셨습니다.");
				}
			}while(!checker);
			perInfo.setSmoking(smoking);


			System.out.println("입력 마침");
			System.out.println();

			//입력을 마친 후 엔터를 입력해야 ID,PW 확인
			System.out.println("아이디 생성하기(Enter)");
			scan.nextLine();

			//아이디,비번을 생성하기 위한 객체 생성
			Info info = input.allInput();	
			Member member = new Member();	//회원 객체 생성
			member.setInput(input);		//회원 객체에 개인정보 저장
			member.setInput(perInfo);		//회원 객체에 선택정보 저장
			member.setID(info.checkId());	//회원 객체에 id 저장
			member.setPW(info.checkPw());	//회원 객체에 pw 저장

			System.out.println("생성된 ID: "+member.getID());
			System.out.println("생성된 PW: "+member.getPW());

			//객체 배열에 생성된 객체 추가
			arrMember[num] = member;
			num++;
			if(num != counter) {
				System.out.println("\n"+(num+1)+"번째 회원정보 입력");

			}

		} while (num!=counter);
		System.out.println();
		/////////////////////////////////////////////////////////////////////
		////////////////////////////////로그인//////////////////////////////////
		Member outputmember = new Member();
		Login login = new Login();
		if(login.login(arrMember)) {
			flag_login=true;
			outputmember = arrMember[login.getId_index()];
		}

		//////////////////////////////텍스트 파일 출력(예정)//////////////////////////////////////
		//기현아 힘내
		if(flag_login) {
			Output output = new Output(outputmember);
			output.writeToFile("D:\\dev");
		}
		System.out.println("프로그램을 종료합니다.");
		scan.close();
	}

}
