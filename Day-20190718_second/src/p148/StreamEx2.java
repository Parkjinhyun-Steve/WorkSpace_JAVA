package p148;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamEx2 {

	public static void main(String[] args) {
		List<Student> students=new ArrayList<>();
		students.add(new Student("ȫ�浿", 100));
		students.add(new Student("�ڹ���", 80));
		students.add(new Student("�̼���", 95));
		
		System.out.println(students);
		
		
		Collections.sort(students, (studentsTest1, studentsTest2) -> Integer.compare(studentsTest1.getScore(), studentsTest2.getScore()));
		
		System.out.println(students);
		
		
		
/*		students.stream()
			.filter(s->s.getScore() >= 90)    // ���ٽ�
			.forEach(s->System.out.println(s.getName()));   // ���ٽ�  */
		

	}

}
