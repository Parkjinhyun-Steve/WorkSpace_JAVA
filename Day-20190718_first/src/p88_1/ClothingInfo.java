package p88_1;

public class ClothingInfo {  
	String code;  // VO; Value object
	String name;
	String material;
	Season season;
	//int season;
	
	//static final int SPRING=1;  // DTO; data transaction object //  ������ �ϴ� ���� final �̴�. 
	//static final int SUMMER=2;
	//static final int FALL=3;
	//static final int WINTER=4;
	
		
	ClothingInfo(String code, String name, String material, Season season) { // 
		this.code=code;
		this.name=name;
		this.material=material;
		this.season=season;

	}
}
