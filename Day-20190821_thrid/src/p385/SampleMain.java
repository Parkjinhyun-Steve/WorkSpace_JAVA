package p385;

public class SampleMain {

	public static void main(String[] args) {
		Observer observer=new Client();  // 관찰자 // 감시  // 옵저버  //
		Subject dataChanger=new DataChanger();
		
		dataChanger.addObserver(observer);
		

	}

}
