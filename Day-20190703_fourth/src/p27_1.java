import java.time.LocalDateTime;

public class p27_1 {

	public static void main(String[] args) {
		 int second=LocalDateTime.now().getSecond();
		 
		 if(second%2==0) {
			 System.out.println(second + "는 짝수 입니다.");
		 }else {
			 System.out.println(second + "는 홀수 입니다.");
		 }

	}
		 

}
