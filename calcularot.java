public class main{
	public static void main(String[] x) {
		java.util.Scanner calculator = new java.util.Scanner(System.in);


		System.out.println("============ Program Plus ============");
		System.out.println("Put the first number yo = ");
		var n1 = calculator.nextInt();

		System.out.println("Put the secondr yo = ");
		var n2= calculator.nextInt();

		var answer = n1 + n2;
		System.out.println("============ Answer ============");
		System.out.println("answer " + answer );
	}
}