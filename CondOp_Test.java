import java.util.Scanner;
public class CondOp_Test{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int a;
		System.out.print("������ �Է� : ");
		a=scan.nextInt();
		if(a % 2 == 0) System.out.println(a + "��(��) ¦���Դϴ�.");
		else System.out.println(a + "��(��) Ȧ���Դϴ�.");
		
	}
}