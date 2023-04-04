package Edit;
//package Edit로 수정했습니다.
import java.util.regex.Pattern;

public class InputCheck {
	private String name;
	private String inputAddress;
	private String gender;
	private String phoneNum;
	private String year;
	private String email;
	private static final String[] DOMAINS = {"@gamil.com","@naver.com","@daum.net"};
	private static final String KOREAN_PATTERN= "[가-힣]*$";
	private static final String EMAIL_PATTERN= "^[a-zA-Z0-9+-\\_.]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$";
	//수정 경상남도,전라남도등 도를 제외한 주소 패턴 
	
	private static final String KOREAN_ADDRESS_PATTERN ="^.*[시군구]\\s.*[동읍면리]\\s"//시,군,구 다음으로 동,읍,면,리가 와야함
			+ ".*\\d{1,5}-\\d{0,3}(|로|길)\\s.*"//은 도로명주소로 로/길이 나와야함
			+ "\\d{1,5}(번지)?\\s"//번지가 나와야함(건물주소)
			+ ".*\\d{1,3}(동|층)?\\s.*$";//동이나 층이 포함 되어 있는지 확인

	
	
	//	일반적인 한국 이름 형식이 아니면 false 
	public boolean checkName(String name) {
		name = name.trim();
		if(Pattern.matches(KOREAN_PATTERN, name)) {
			setName(name);
			
			return true;
			}
		return false;	
	}
	//주소 확인 주소에 영어가 포함 되어있으면 false 리턴함 
	//값에 무조건 숫자가 포함 되어 있어야함
	public boolean checkAddress(String inputAddress) {
			if(inputAddress.matches(KOREAN_ADDRESS_PATTERN)){
				setAddres(inputAddress);
				
				return true;
				}
		return false;
		
	}
	//주민번호 앞에서부터 7자리를 받아서 남자인지 여자인지 판별하고 성별과 생연월일 6자리를 넘겨줌
	public boolean checkYear(String inputBirthYear) {
		inputBirthYear=inputBirthYear.replaceAll("[^0-9]", "");
		int checker = Integer.parseInt(inputBirthYear);
		int num = checker;
	
			checker %= 10; 
			
		String gender = ((checker+1)%2==0)?"남자":"여자";
		if (inputBirthYear.length()==7) {
			
		if(num<9912315) {
			if (checker<5) {
				setYear(inputBirthYear.substring(0,7));
				
				setGender(gender);
				return true;
			}
		}
		}
		return false;
	
	}
	//010으로 시작하는 전화 번호 형식이 아니면 무조건 false를 리턴함 하이픈 입력 상관없이 받아서 하이픈 삭제하고 전화번호 저장
	public boolean checkPhoneNum(String inputPhoneNum) {
		
		inputPhoneNum = inputPhoneNum.trim().replace("-", "");
		if (inputPhoneNum.substring(0, 3).equals("010")) {
			if (inputPhoneNum.length()==11) {
				setPhoneNum(inputPhoneNum);
				
				return true;				
			}
		}
		return false;
	}
	//메인에서 메일을 선택지를 뜨게해서 이메일 주소를 던져줌
	public boolean checkEmail(String email,int select) {
		
		if (Pattern.matches(EMAIL_PATTERN, email+DOMAINS[select-1])) {
			
				setEmail(email += DOMAINS[select-1]);
				
				return true;
			
		}		
		return false;
		
	}
	
	//모든 메소드들이 정상적으로 true를 리턴하면 info에 폰번호랑 생년월일 이메일을 넘겨줌
	//순서 생년월일, 번호, 이메일 순서인데 잘못 입력되어 있어서 변경합니당.
	public Info allInput() {
//				Info info = new Info(getEmail(),getPhoneNum(),getYear());	
				Info info = new Info(getYear(),getPhoneNum(),getEmail());	
			return info;
			
		}
	public String getName() {
		return name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddres() {
		return inputAddress;
	}
	public void setAddres(String addres) {
		this.inputAddress = addres;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

//쓸 일이 올까 이걸?
//if (Pattern.matches("[0-9]*$", year)) {
//	if (year.length()==7) {
//		if (Pattern.matches("[1-4]", year.substring(6))) {
//			return true;
//		}else {
//			return false;
//		}
//	}else {
//		return false;
//	}
//}else {
//	return false;
//}

}