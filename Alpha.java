import java.util.Scanner;
public class Alpha {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		char a;
		System.out.print("���� �Է� : ");
		a=sc.next().charAt(0);

		char b=(a-=32);
		System.out.println("�ҹ���" + a + "�� �빮�ڴ� " + b + "�Դϴ�.");
	}
}
