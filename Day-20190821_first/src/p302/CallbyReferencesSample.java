package p302;


public class CallbyReferencesSample {

	public static void main(String[] args) {
		EntityTest entiy = new EntityTest();
		entity.value=1;
		CallbyReferences(entity);
		System.out.println("main : "+entity.value);

	}

	public static void CallbyReferencesSample(EntityTest entity) {
		entity = new EntityTest();
		entity.value=2;
		System.out.println("CallbyReference : "+entity.value);
		
	}

}
