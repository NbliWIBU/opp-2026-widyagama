import java.util.Scanner;

public class Main{
	public static void main(String[] x) {
		Scanner input = new Scanner(System.in);

			System.out.println("What is your name? = ");
				String NA = input.nextLine();

			System.out.println("what class are you in? = ");
				String CL = input.nextLine();

			System.out.println("============");

			System.out.println("Name :" + NA);
			System.out.println("Class :" + CL);

			System.out.println("============");
	}
}