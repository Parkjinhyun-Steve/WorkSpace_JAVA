package p77;  //Say라는 함수 구현

public abstract class AbstractBaseService implements BaseService {  // abstract(추상)를 앞에 붙이면 밑에 오버라이드  없어도 에러가 안생긴다.
	                                                                // 추상 클래스는 꼭 구연할 필요가 없어서 // 그래서 그냥 implement가 사용 가능.
	                                                                // 추상함수를 가지고 있어야 abstract를 사용할수 있다.
	protected String name=null;
	
	public AbstractBaseService(String name) {
			this.name=name;
	}
				
}
