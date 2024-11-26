package java_study_1126;

public class 반복문 {

	public static void main(String[] args) {

		/*
		//이중 for문(중첩반복)
		
		for(int i=0; i<3; i++) {
			System.out.println("아우터 for문");
			for(int j =0; j<3; j++) {
				System.out.println("이너 for문");
			}
		}
		
		for(int i=1; i<10; i++) {

			for(int j=1; j<10; j++) {
				System.out.println(i + "*" +j+"="+i*j);
			}
		}
		
		//직사각형 출력(이중 for문)
		
		int a = 5;
		int b = 3;
		for(int i=0; i<b; i++) {
			for(int j=0;j<a;j++) {
				System.out.print("*");
			}
			System.out.println();// 공백출력
		}
		*/
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=5; i>0; i--) {
			for(int j=0; j<i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
