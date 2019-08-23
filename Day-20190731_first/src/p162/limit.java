package p162;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class limit {    // 엔트리 클래스

	public static void main(String[] args) {
		List<Student> studentList= new ArrayList<>();   // 수집을 위해서 List에 저장  // 검색을 위해서는 Map을 사용
		studentList.add(new Student("Park", 100));
		studentList.add(new Student("Lee", 80));
		studentList.add(new Student("Hwank", 100));
		
		System.out.println(studentList);
		
		studentList.stream()
			.limit(2)
			.forEach(s->System.out.println(s.getName()+":"+s.getScore()));
		
	}

}
