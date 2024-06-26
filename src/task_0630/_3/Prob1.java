package task_0630._3;

public class Prob1 {

	public static void main(String[] args) {
		
		int[] ia = new int[]{3,7,1,8,10,2,15,2,10}; 
		int[] ib = new int[]{1,2,3,4,5};
		
		Prob1 p = new Prob1();
		System.out.println("( 배열 ia )");
		p.calc(ia);
		System.out.println("( 배열ib )");
		p.calc(ib);
	}
	
	public void calc(int[] ix){

		int Odd = 0;
		int even = 0;

		for(int i = 0;i <ix.length;i++){
			if(ix[i]%2 == 0){
				even +=ix[i];
			}
			else Odd +=ix[i];
		}
		System.out.println("( 배열 ia )\n홀수의 합 : " + Odd);
		System.out.printf("짝수의 합 : " + even + "\n");
		
	}

}
