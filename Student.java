package reference;

public class Student {
	
	int studentId; // 학생 학번
	String studentName; // 학생이름
	
	Subject math; // 해당학생이 들은과목인 수학
	Subject korea; // 해당학생이 들은과목인 국어
	
	public Student(int id, String name) {
		studentId = id;
		studentName = name;
		
		math = new Subject();
		korea = new Subject();
				
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.subjectScore = score;
	}
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.subjectScore = score;
	}
	
	public void setStudentShow() {
		int total = math.subjectScore+korea.subjectScore;
		System.out.println(studentName+" ÇÐ»ýÀÇ ÃÑÁ¡Àº "+ total+"Á¡ ÀÔ´Ï´Ù.");
	}
}
