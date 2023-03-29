package Edit;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
//이메일을 -> 아이디 (@ 빼고,문자)
//비밀번호 -> 전화번호뒷자리(문자)+생년월일(정수)
//입력받았을때 아이디랑 패스워드를 만들어주는 class

class memberList{
	String key = "";
	Integer value = 0;
	
	//HashMap 클래스 객체 생성(키:문자열, 값:정수형 Wrapper클래스)
	Map<String, Integer> map = new HashMap<String, Integer>();
	
	//map 컬렉션의 모든 키들을 set 컬렉션으로 받음
	Set<String> keySet = map.keySet();
	//set컬렉션 방식으로 객체 처리
	Iterator<String> keyIterator = keySet.iterator();
	
//	while (keyIterator.hasNext()) {
//		String key = keyIterator.next();
//		Integer value = map.get(key);
//	}
}

class Input{ //규하//
	private String email;
	private String phonenumber;
	private int birth;
	
	public Input() {}
	public Input(String email, String phonenumber, int birth) {
		this.email = email;
		this.phonenumber = phonenumber;
		this.birth = birth;
	}
	public void setEmail(String eArr) {
		// TODO Auto-generated method stub
		
		
		
		
		
		
//	public void checkId() {
//		String eArr = new String(id);
//		String[] idArr = eArr.split("@"); //now_g @ gmail.com
//		input.setEmail(eArr);
//		id = idArr[0];
//
//		//Q.Key 오류 ??
//		while (true) {
//			if(id.equals(keySet)) {
//				System.out.println("중복된 ID가 있습니다.");
//				
//			} else {
//				
//			}
//		}
//	
//  }
//
//	@Override
//	public void checkPw() {
//		// TODO Auto-generated method stub
//		
//	}
	}
}


//interface setinfo{ //Q.이 메소드들 인터페이스로 꼭 써야할까?
//	public abstract void checkId(); //이메일을 받아서 아이디로 저장
//	public abstract void checkPw(); //전호번호,생년월일을 받아서 비밀번호로 저장
//} 


public class Info extends memberList{
	String id;
	String pw;
	String lastPhoneNumber;

	public Info(String id, String pw, String lastPhoneNumber, Input input) {
		super();
		this.id = id;
		this.pw = pw;
		this.lastPhoneNumber = lastPhoneNumber;
		this.input = input;
	}
	
	Input input = new Input();
	
	public void checkId() {
		//id
		String eArr = new String(id);
		String[] idArr = eArr.split("@"); //now_g @ gmail.com
		input.setEmail(eArr);
		id = idArr[0];
	}
	public void checkPw() {
		//전화번호뒷자리(문자)+생년월일(정수)
		//pw
		String pArr = new String(pw);
		String[] pwArr = pArr.split("-");
		String lastPhoneNumber = pwArr[2];
		//문자(폰)과 생년월일(정수) -> 정수
//		int finalPw = (Integer.parseInt(pwArr[2]))+birth;
		//마지막번호와 생년월일을 무작위로 섞을 수 있다면?
		//아? 폰넘버는 문자구나
//		C<String, Integer> password = new HashSet<String, Integer>();
		
		
	}
	
		
		
			
	
		
		
//		while(true) {
//			if (!id.equals(keySet)) {
//				System.out.println("중복된 ID가 있습니다.");
//				//이메일 재입력? 아이디 재입력??
//			}else {
//				//아이디를 멤버리스트에 저장
//				keySet.
//				break;
//			}

}


