package Edit;

import java.util.Random;

public class Info{  
    private String id;
    private String pw;
	private String birth;
    private String phonenumber;
    private String email;
   
    public Info(String id, String pw, String birth, String phonenumber, String email) {
        this.id = id;
        this.pw = pw;
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