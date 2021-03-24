package reference;

public class StudentTest {

	public static void main(String[] args) {
		
		Student Park = new Student(2014,"박승제"); // Student 클래스를 이용하여 Park이라는 변수를 만들고 인자를 넣어 선언함.
		Student Lee = new Student(2015,"김덕배"); // Student 클래스를 이용하여 Lee이라는 변수를 만들고 인자를 넣어 선언함.
		
		Park.setMathSubject("수학", 100); // 위에서 Student클래스를 이용해 만든 인스턴스인 Park을 이용하여 Student클래스의 메소드인 setMathSubject에 인자값을 넣음
		Park.setKoreaSubject("국어", 75); // 동일
		Lee.setMathSubject("수학", 55); // 동일
		Lee.setKoreaSubject("국어", 78); // 동일
		
		Park.setStudentShow();  // 위에서 Student클래스를 이용해 만든 인스턴스인 Park을 이용하여 Student클래스의 메소드인 setStudentShow를 실행함
		Lee.setStudentShow();  // 
		
	}

}
