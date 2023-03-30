package MM;

import java.awt.Checkbox;
import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		InputCheck input = new InputCheck();
		Scanner scan = new Scanner(System.in);
		String name,phoneNum,Address,email,year;
		int choice,a,num;
		System.out.print("입력: ");
		num= scan.nextInt();
		boolean checker = false;
		int countet = num;
		num=0;
		do {
			num++;
			System.out.print("이름: " );
			do {
				name = scan.next();
				checker=input.checkName(name);
				if (!checker) {
					System.out.println("한글만 입력해주세요.");
				}
			} while (!checker);
			System.out.print("주민등록번호 첫번째 자리부터\n7번째 자리까지 입력 해주세요\n입력: ");
			checker = false;
				
			 do {	 
				year=scan.next();
				checker=input.checkYear(year);
				if (!checker) {
					System.out.println("잘못 입력하셨습니다");
				}
			}while(!checker);
			 checker = false;
			 	System.out.println("전화 번호를 입력해주세요\n하이픈 상관없이\n휴대폰번호 입력: ");
			 do {	 
				 phoneNum=scan.next();
				 checker=input.checkPhoneNum(phoneNum);
				 if (!checker) {
					 System.out.println("잘못 입력하셨습니다.");
					 
				 }
			 }while(!checker);
			 
			 checker = false;
			 do {	 
				 System.out.println("사용 가능한 도메인 번호");
				 System.out.println("1:google\n2:naver\n3.daum");
				 System.out.print("이메일 번호 입력 ");
				 choice = scan.nextInt();
				 System.out.print("아이디 입력 ");
				 email=scan.next();
				 checker=input.checkEmail(email,choice);
				 if (!checker) {
					 System.out.println("영어와 숫자외 문자가 포함이되어 있습니다.");
				 }
			 }while(!checker);
			checker=false;
			 System.out.println("으");
			 System.out.print("주소를 입력해주세요: ");
			 do {
				 
				 Address=scan.next();
				 
				 checker=input.checkAddress(Address);
				 if (!checker) {
					 System.out.println("문자가 포함되어 있습니다.");
				 }
			 }while(!checker);
			  
			 scan.nextLine();
			 System.out.println("다음 회원정보 입력");
			 Info info = new Info(input.getEmail(),input.getPhoneNum(),input.getYear());
			 System.out.println(info.checkId());
			 System.out.println(info.checkPw());

		
		
		} while (num!=countet);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	scan.close();
}
}
