package p62;

public class BoxingTest {

	public static void main(String[] args) {
		//UnBoxing
		
		int num=10;  // type -> 크기를 지정함						
		
		//Integer num02=Integer.valueOf(10); -> 좋은 방법(예제)   값을 넣어줄때는 valueOf 불러올때는 intValue
		Integer numInt=10;  // 안좋은 방법 ; 오토박싱 -> 클린하지 않은 코드 
		
		
		//Integer sum=num + numInt.intValue(); -> 좋은 방법
		Integer sum=num + numInt; //안좋은 방법 ;
				                  //10이랑 오토박싱되어 있는 것을 같이 계산하려면 언박싱을 해야 함 -> 연산 -> 값을 집어넣기 위해서 오토박싱을 또 해야 함
		
		// * 결론 : 4개를 외우자 -> valueOf intValue parseInt toString *	
		
	}

}
