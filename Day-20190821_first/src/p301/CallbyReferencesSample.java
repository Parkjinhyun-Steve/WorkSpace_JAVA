package p301;


public class CallbyReferencesSample {

	public static void main(String[] args) {
		EntityTest entiy = new EntityTest();
		entity.value=1;
		CallbyReferences(entity);
		System.out.println("main : "+entity.value);

	}

	public static void CallbyReferencesSample(EntityTest entity) {
		entity.value++;
		System.out.println("callByValue : "+entity.value);
		
	}

}