package Edit;

public class Main {
	public static void main(String[] args) {
		Login login = new Login();
		Test1 obj1 = new Test1();
		obj1.ID = "abc";
		obj1.PW = "123";
		Test1 obj2 = new Test1();
		obj2.ID = "def";
		obj2.PW = "456";
		Test1[] arr = {obj1, obj2};
		
		login.login(arr);
		
	}
}
