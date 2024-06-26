package task_0630._1;

public class Prob1 {

	public static void main(String[] args) {
		
		int[] ia = new int[]{3,7,1,8,10,2,15,2,10}; 
		int[] ib = new int[]{1,2,3,4,5};


		int iaOdd = 0;
		int iaeven = 0;

		for(int i = 0;i <ia.length;i++){
			if(ia[i]%2 == 0){
				iaeven +=ia[i];
			}
			else iaOdd +=ia[i];

		}

		int ibOdd = 0;
		int ibeven = 0;

		for(int i = 0;i <ib.length;i++){
			if(ib[i]%2 == 0){
				ibeven +=ib[i];
			}
			else ibOdd +=ib[i];
		}

		System.out.println("( 배열 ia )\n홀수의 합 : " + iaOdd);
		System.out.printf("짝수의 합 : " + iaeven + "\n");
		System.out.println("( 배열 ib )\n홀수의 합 : " + ibOdd);
		System.out.printf("짝수의 합 : " + ibeven);


	}
	
	
}
