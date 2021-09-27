import java.util.Scanner;
public class Four_op_1115{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String name;
		System.out.print("이름: ");
		name=scan.nextLine();
		System.out.println(name);

		int a;
		double b;
		
		System.out.print("정수를 입력하세요: ");
		a=scan.nextInt();
		System.out.print("실수를 입력하세요: ");
		b=scan.nextDouble();
		
		System.out.println(a+" + "+b+" = "+(a+b));
		System.out.println(a+" - "+b+" = "+(a-b));
		System.out.println(a+ " * "+b+" = "+(a*b));
		System.out.println(a+" / "+b+" = "+(a/b));

	}
}