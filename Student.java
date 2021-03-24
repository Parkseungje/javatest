package reference;

public class Student { // 이 Student 클래스 전체가 인스턴스 Park, Lee의 붕어빵틀이 된다.
	
	int studentId; // 학생 학번
	String studentName; // 학생이름
	
	Subject math; // Subject클래스로 해당학생이 들은과목인 math를 변수화하여 선언
	Subject korea; // Subject클래스로 해당학생이 들은과목인 korea를 변수화하여 선언
	
	public Student(int id, String name) { // Student클래스의 생성자를 따로 인자를 대입할 수 있게 생성함
		studentId = id; // 위에서 선언한 studentId에 <- 인자 id를 대입
		studentName = name; // 위에서 선언한 studentName에 <- 인자 name을 대입
		
		math = new Subject(); // 위에서 선언한 변수를 생성자 선언
		korea = new Subject(); // 위에서 선언한 변수를 생성자 선언
				
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name; // 변수화한 math의 생성클래스인 Subject클래스에 들어가면 subjectname이 있다. <- 인자 name을 대입한것. 
		math.subjectScore = score; // 변수화한 math의 생성클래스인 Subject클래스에 들어가면 subjectScore가 있다. <- 인자 score를 대입한것. 
	}
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.subjectScore = score;
	}
	
	public void setStudentShow() {
		int total = math.subjectScore+korea.subjectScore; // 각 과목의 점수를 더함
		System.out.println(studentName+" ÇÐ»ýÀÇ ÃÑÁ¡Àº "+ total+"Á¡ ÀÔ´Ï´Ù."); // 학생이름과 점수를 
	}
}
