package Edit;

public class Main {
	public static void main(String[] args) {
		Login login = new Login();
		Member obj1 = new Member();
		obj1.ID = "abc";
		obj1.PW = "123";
		Member obj2 = new Member();
		obj2.ID = "def";
		obj2.PW = "456";
		Member[] arr = {obj1, obj2};
		
		login.login(arr);
		
	}
}
