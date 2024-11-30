package java_study_1128;

public class 복습 {

	public static void main(String[] args) {

		//1차원 배열
		int [] array = {1,2,3};
		
		//2차원 배열
		int [][] array2 = {{1,2,3},{1,2,3},{1,2,3}};
		//2차원 배열 출력해보기
		for(int i=0;i<array2.length;i++) {
			
			for(int j=0;j<array2.length;j++) {
				System.out.print(array2[i][j]);
				
			}
		}
		
		//배열 형변환
		int array3[] = new int[3];
		String array4[] = new String[4];
		
		array3[0] = 3;
		array4[0] = "apple";
		
		//array4 첫번째 인덱스에 3넣기
		//array4[1] = 3; 문자열 배열이기에 숫자 x
		array4[1] = Integer.toString(array3[0]);
		//Integer.toString(실무에서 정말 많이 사용) - 숫자에서 문자로 형변환
		//Integer.pareInt(); - 문자에서 숫자로 형변환
		
		

	}

}
