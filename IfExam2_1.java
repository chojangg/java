import java.util.Scanner;
public class IfExam2_1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("���� �Է�(���� ������ ���̴� ������ �� ��) : ");
		int a=sc.nextInt();
		char op=sc.next().charAt(0);
		int b=sc.nextInt();
		switch(op){
			case '+' : System.out.println(a+" + "+b+" = "+(a+b));break;
			case '-' : System.out.println(a+" - "+b+" = "+(a-b));break;
			case '*' : System.out.println(a+" * "+b+" = "+(a*b));break;
			case '/' : System.out.println(a+" / "+b+" = "+(a/b));break;
			case '%' : System.out.println(a+" % "+b+" = "+(a%b));break;
			default : System.out.println("��Ģ�����ڰ� �ƴմϴ�.");break;
		}
	}
}