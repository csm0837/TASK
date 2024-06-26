package task_0630.Inheritance1;

public class Student {
	private String name;
	private String subject;
	private int fee;
	private double returnFee;


	public Student(String name, String subject, int fee) {
		this.name = name;
		this.subject = subject;
		this.fee = fee;
	}


	public void calcReturnFee() {
		if ("javaprogram".equals(subject)) {
			returnFee = fee * 0.25;
		} else if ("jspprogram".equals(subject)) {
			returnFee = fee * 0.20;
		} else {
			System.out.println("그런 과정명은 없습니다");
			return;
		}
	}


	public void print() {
		System.out.printf("%s 씨의 과정명은 %s 이고 교육비는 %d 원이며 환급금은 %.2f 원입니다.%n", name, subject, fee, returnFee);
	}


	public static void main(String[] args) {
		Student stu = new Student("차은우", "jspprogram", 500000);
		stu.calcReturnFee();
		stu.print();
	}
}
