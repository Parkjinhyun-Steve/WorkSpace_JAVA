package p148;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamEx2 {

	public static void main(String[] args) {
		List<Student> students=new ArrayList<>();
		students.add(new Student("홍길동", 100));
		students.add(new Student("박문수", 80));
		students.add(new Student("이순신", 95));
		
		System.out.println(students);
		
		
		Collections.sort(students, (studentsTest1, studentsTest2) -> Integer.compare(studentsTest1.getScore(), studentsTest2.getScore()));
		
		System.out.println(students);
		
		
		
/*		students.stream()
			.filter(s->s.getScore() >= 90)    // 람다식
			.forEach(s->System.out.println(s.getName()));   // 람다식  */
		

	}

}
