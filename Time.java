import java.util.Scanner;
public class Time{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int a;
		System.out.print("�� �Է� : ");
		a=scan.nextInt();
		
		int b = a/3600;
		int c = (a%3600)/60;
		int d = a%60;
		
		System.out.println(a + "�ʴ� " + b + "�ð� " + c + "�� " + d + "���Դϴ�.");
	}
}