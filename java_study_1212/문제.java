package java_study_1212;

class cal{
	
	public int add(int a,int b){
		return a+b;
	}
	
	public int min(int a,int b){
		return a-b;
	}
	
	public int mul(int a,int b){
		return a*b;
	}
	
	public int div(int a,int b){
		return a/b;
	}
	
	public int avg(int n[]){
		
		int s=0;
		
		for(int i:n) {
			s += n[i];
		}
		
		return s/n.length;
	}
	
}

public class 문제 {

	public static void main(String[] args) {
		
		cal cal = new cal();
		//8
		int result1 = cal.add(1,2);
		int result2 = cal.min(2,1);
		int result3 = cal.mul(2,2);
		int result4 = cal.div(5,5);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		//9
		
		int n[] = {1,2,3}; 
		
		
		int result5 = cal.avg(n);
		System.out.println(result5);

	}

}
