import java.util.Scanner;
class MinOfThree{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int a, b, c;
		System.out.print("ù ��° �� �Է� : ");
		a=scan.nextInt();
		System.out.print("�� ��° �� �Է� : ");
		b=scan.nextInt();
		System.out.print("�� ��° �� �Է� : ");
		c=scan.nextInt();

		System.out.print(a+"�� "+b+"�� "+c+"�� ���� ���� ���� ");
		if(a<b) {
			if(a<c) {
			System.out.print(a+"�Դϴ�.");
		} else(b<c)
			System.out.print(b+"�Դϴ�.");
		}
		
		if(b<c) System.out.print(c+"�Դϴ�.");
		else 
	}
}