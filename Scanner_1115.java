import java.util.Scanner;
public class Scanner_1115{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String name;
		int a;
		int b;
		System.out.print("�簢���� �ظ� : ");
		a=scan.nextInt();
		System.out.print("�簢���� ���� : ");
		b=scan.nextInt();
		System.out.print("�簢���� ���� : "+(a*b));
	}
}