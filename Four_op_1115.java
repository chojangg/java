import java.util.Scanner;
public class Four_op_1115{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String name;
		System.out.print("�̸�: ");
		name=scan.nextLine();
		System.out.println(name);

		int a;
		double b;
		
		System.out.print("������ �Է��ϼ���: ");
		a=scan.nextInt();
		System.out.print("�Ǽ��� �Է��ϼ���: ");
		b=scan.nextDouble();
		
		System.out.println(a+" + "+b+" = "+(a+b));
		System.out.println(a+" - "+b+" = "+(a-b));
		System.out.println(a+ " * "+b+" = "+(a*b));
		System.out.println(a+" / "+b+" = "+(a/b));

	}
}