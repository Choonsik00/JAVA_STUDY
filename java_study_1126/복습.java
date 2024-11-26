package java_study_1126;

public class 복습 {

	public static void main(String[] args) {

		/*
		//for문 (반복문)
		for(int i=0;i<3; i++) {
			System.out.println("Hello World!");
		}
		for(int i=1; i<=100; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			}else if(i % 3 == 0) {
				System.out.println("Fizz");
			}else if(i % 5 ==0) {
				System.out.println("Buzz");
			}
		}
		*/
		
//		int n = 20;
//		int t = 10;
//		for(int i=1;i<=t;i++) {
//			n = n * 2;
//			//n *= 2;
//		}
//		System.out.println(n);
//	}

	int count = 0;
	int n2 = 6;
	
	while(n2 != 1) {
		if(n2 % 2 == 0) {
			n2 = n2/2;
			++count;
		}else {
			n2 = n2 * 3 + 1; 
			//3을 곱하고 1을 더함
			++count;
		}
	}
		System.out.println("count: "+count);
	}
}
