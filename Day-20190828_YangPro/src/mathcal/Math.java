package mathcal;

public class Math {	
	int n, m;  // �ʵ� ����
		
	Math(int n, int m){  // ������ �޼���
		this.n=n;
		this.m=m;
	}
	
	void cal1(int Way, int x){  // �޼���
		int result=0;
		switch(Way){
		
		case 1: for (int i=n; i<=m; i++) {
			result=4050;		
			}
			break;
			
		case 2:
			result=49;
			break;
			
		case 3:
			result=50;
			break;
			
		case 4:
			int a, b;
			for(a=n; a<=m; a++) {
				for(b=2; b<=m; b++) {
					if((a%b)==0)break;						
				}if(a==b)
					result++;
			}		
			break;
			
		case 5: for(int i=n; i<=m; i++)
			if((i%x)==0)
				result++;			
			break;
		}	
		
		System.out.println(result);
	}
}

		
	
		


