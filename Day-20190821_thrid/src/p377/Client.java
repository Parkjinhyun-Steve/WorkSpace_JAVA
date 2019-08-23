package p377;

public class Client {

	public static void main(String[] args) {
		Lamp lamp=new Lamp();
		Button lampButton=new Button(lampOnCommand);
		lampButton.pressed();

	}

}
