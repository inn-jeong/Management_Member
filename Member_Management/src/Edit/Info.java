package Edit;
// -수정사항-
// 객체를 생성할 때 id와 pw를 입력받지는 않으므로 생성자 매개변수에서 제외하였습니다.
// -피드백-
// 필드를 private 으로 설정하여서 set메소드로 필드를 리턴하는 기능을 추가하면 좋을 것 같습니다.

import java.util.Random;

public class Info{  
    private String id;
    private String pw;
	private String birth;
    private String phonenumber;
    private String email;
   
//    public Info(String id, String pw, String birth, String phonenumber, String email) {
//        this.id = id;
//        this.pw = pw;
//        this.birth = birth;
//        this.phonenumber = phonenumber;
//        this.email = email;
//    }
    public Info(String birth, String phonenumber, String email) {
        this.birth = birth;
        this.phonenumber = phonenumber;
        this.email = email;
    }
    
	public String checkId() {
        String eArr = new String(email);
        String[] idArr = eArr.split("@");
        for (int i = 0; i < idArr.length; i++) {
			id =idArr[0];
		}
        return id;
    }
    public String checkPw() {
    	pw = phonenumber + birth;
    	Random random = new Random();
    	char[] newPw = new char[10];
    	for (int i = 0; i < newPw.length; i++) {
			newPw[i]=pw.charAt(random.nextInt(10));
		}
    	pw = new String(newPw);
        return pw;
    	}   
  
}