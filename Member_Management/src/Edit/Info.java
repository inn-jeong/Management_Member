package Edit;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
//이메일을 -> 아이디 (@ 빼고)
//비밀번호 -> 전화번호뒷자리+생년월일 
//입력받았을때 아이디랑 패스워드를 만들어주는 class
class memberList{
	//HashMap 클래스 객체 생성(키:문자열, 값:정수형 Wrapper클래스)
	Map<String, Integer> map = new HashMap<>();
	
	//map 컬렉션의 모든 키들을 set 컬렉션으로 받음
	Set<String> keySet = map.keySet();
	//set컬렉션 방식으로 객체 처리
	Iterator<String> keyIterator = keySet.iterator();
	
//	while(keyIterator.hasNext()) {
//		String key = keyIterator.next();
//		Integer value = map.get(key);
//	}
}
class Input{
	String email;
	int phonenumber;
	int birth;
}
interface setinfo{ //Q.이 메소드들 인터페이스로 꼭 써야할까?
	public abstract void setId(); //이메일을 받아서 아이디로 저장
	public abstract void setPw(); //전호번호,생년월일을 받아서 비밀번호로 저장
}
public class Info extends memberList implements setinfo{
	String id;
	int pw;
	
	public Info(String id, int pw) {
			super();
			this.id = id;
			this.pw = pw;
	}
//	Input input = new Input();
//	id = input.email;
	
	//멤버리스트를 부모클래스로 둬야 중복된 아이디와 비밀번호를 비교하기 수월할것같다
	//Q.input 클래스에 접근하려면? 객체생성 근데 오류남 웨,,?why?
	
//	public Info(String id, int pw) { 
//		super();
//		this.id = id;
//		this.pw = pw;
//	}
	
	@Override
	public void setId() {
		String eArr = new String(id);
		String[] idArr = eArr.split("@"); //now_g@gmail.com
		id = idArr[0];

		//Q.Key 오류 ??
//		while (!id.equals(key)) {
//			System.out.println("다음 화면으로 이동합니다.");		
//			break;
//		} else {
//			System.out.println("중복된 ID가 있습니다.");
//		}
	}
	@Override
	public void setPw() {
		//split으로 전화번호 뒷자리 자르고, 생년월일을 더해서 pw로 저장
		//순서,중복 상관없이
	}
}