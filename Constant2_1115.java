import java.util.Scanner;
public class Constant2_1115{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String name;
		final double a=3.14;
		double r;
		System.out.print("������ : ");
		r=scan.nextDouble();
		System.out.println("������ "+r+"�� ���� �ѷ� : "+(r*2*a));
		System.out.println("������ "+r+"�� ���� ���� : "+(r*r*a));
		
	}
}