import java.util.Scanner;
class Multiple_3{
	public static void main(String args[]){
		System.out.print("���� �Է� : ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(num + "��(��) 3�� ���");
		if(num%3==0)//3�� ���
			System.out.print("�Դϴ�.");
		else
			System.out.print("�� �ƴմϴ�.");
	}
}