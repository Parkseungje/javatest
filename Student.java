package reference;

public class Student {
	
	int studentId;
	String studentName;
	
	Subject math;
	Subject korea;
	
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
		System.out.println(studentName+" 학생의 총점은 "+ total+"점 입니다.");
	}
}
