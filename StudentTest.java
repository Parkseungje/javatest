package reference;

public class StudentTest {

	public static void main(String[] args) {
		
		Student Park = new Student(2014,"�ڽ���");
		Student Lee = new Student(2015,"�����");
		
		Park.setMathSubject("����", 100);
		Park.setKoreaSubject("����", 75);
		Lee.setMathSubject("����", 55);
		Lee.setKoreaSubject("����", 78);
		
		Park.setStudentShow();
		Lee.setStudentShow();
		
	}

}
