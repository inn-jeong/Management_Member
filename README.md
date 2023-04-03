# Management_Member
회원관리 프로그램

## 보완할 점
- 도메인 선택시 1,2,3 선택지 이외의 숫자도 입력 가능하여 예외 발생(일단 보류)

###->보완 완료
- 아이디 중복 입력 가능
- 주소 입력 개선 해봤습니다
- checkName에서 setName() 없이 한글 입력만 체크하는 메소드 기능 추가
- 선택사항 입력시 공백이면 "없음" 이라고 출력 할 수 있도록 만들기.


### 코드 수정하고 나서 여기에 적어주시면 됩니다.

ex) 진영(23.03.30) Login.java - 클래스 Test1 추가, 메소드checkID 수정

진영(23.03.30) Login.java - 메소드 login 수정

진영(23.03.30) Member.java - 클래스 추가

진영(23.03.31) Member.java - 클래스 수정, 전체적으로 코드를 수정하거나 코멘트 달아놓았습니다. 제일 위에 주석 참고해주세용

규하(23.03.31) InputCheck.java - counter 필드 get,set 멤버 삭제 

진영(23.04.02) Info.java - 최신화

진영(23.04.02) Login.java, TestMain.java - 아이디 중복 입력 방지 기능 추가

### 23.04.02(해결) - 이름을 입력받았는데, 필드에 저장되지 않는 현상 발생. 현재 추적하며 원인 분석 

규하(23.04.02) InputCheck.java - 주소 패턴에 주석추가하고 변경

진영(23.04.02) TestMain.java - output 메소드를 이용한 txt파일에 정보 출력 구현

기현(23.04.02) Output.java - 개인정보 txt파일로 출력하는 기능 구현

규하(23.04.03) InputCheck.java - 주소 패턴을 간단하게 변경
