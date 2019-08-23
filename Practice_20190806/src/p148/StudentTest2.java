package p148;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentTest2 {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("Jung",100));
		studentList.add(new Student("Song",70));
		studentList.add(new Student("Tommy",80));
		
		System.out.println(studentList);
		
		Collections.sort(studentList, (student1, student2) -> Integer.compare(student1.getScore(), student2.getScore()));
		
		System.out.println(studentList);		
		
	}

}
