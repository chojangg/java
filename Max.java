import java.util.Scanner;
class Max {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);						System.out.print("ù ��° �� �Է� : ");
		int a=sc.nextInt();
		System.out.print("�� ��° �� �Է� : ");
		int b=sc.nextInt();
		
		System.out.print(a+"�� "+b+" �� ū ���� ");
		if(a>b)
			System.out.print(a+"�Դϴ�.");
		else
			System.out.print(b+"�Դϴ�.");
	}
}