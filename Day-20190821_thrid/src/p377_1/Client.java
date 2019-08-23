package p377_1;

public class Client {

	public static void main(String[] args) {
		Lamp lamp=new Lamp();
		//온 명령어
		Command lampOnCommand=new LampOnCommand(lamp);
		//오프 명령어
		Command lampOffCommand=new LampOffCommand(lamp);
		//온 명령어 객체 생성
		Button lampButton=new Button(lampOnCommand);
		lampButton.pressed();
		//오프 명령어 객체 생성
		lampButton.setCommand(lampOffCommand);
		lampButton.pressed();

	}

}
