package task_0625.task_0625_3;

public class Prob1 {
	
	public static void main(String[] args) {
		
		Emp emp = new Emp();
		emp.setId("12345");
		emp.setName("홍길동");
		emp.setBaseSalry(50000);
		System.out.print( emp.toString() );
		System.out.println( "봉급 = " + emp.getSalary( 30 ) );
		
	}

}
