import java.util.Scanner;
public class _1115_if1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		System.out.print("����(1), ����(2), ��(3) �Է� : ");
		int a=sc.nextInt();

		switch(a){
			case 1: System.out.println("����� ������ ���̽��ϴ�.");break;
			case 2 : System.out.println("����� ������ ���̽��ϴ�.");break;
			case 3 : System.out.println("����� ���� ���̽��ϴ�.");break;
			default : System.out.println("�߸� ���̽��ϴ�.");
		}
	}
}