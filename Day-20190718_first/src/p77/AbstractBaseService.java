package p77;  //Say��� �Լ� ����

public abstract class AbstractBaseService implements BaseService {  // abstract(�߻�)�� �տ� ���̸� �ؿ� �������̵�  ��� ������ �Ȼ����.
	                                                                // �߻� Ŭ������ �� ������ �ʿ䰡 ��� // �׷��� �׳� implement�� ��� ����.
	                                                                // �߻��Լ��� ������ �־�� abstract�� ����Ҽ� �ִ�.
	protected String name=null;
	
	public AbstractBaseService(String name) {
			this.name=name;
	}
				
}
