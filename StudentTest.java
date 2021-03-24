package reference;

public class StudentTest {

	public static void main(String[] args) {
		
		Student Park = new Student(2014,"¹Ú½ÂÁ¦");
		Student Lee = new Student(2015,"±è´ö¹è");
		
		Park.setMathSubject("¼öÇÐ", 100);
		Park.setKoreaSubject("±¹¾î", 75);
		Lee.setMathSubject("¼öÇÐ", 55);
		Lee.setKoreaSubject("±¹¾î", 78);
		
		Park.setStudentShow();
		Lee.setStudentShow();
		
	}

}
