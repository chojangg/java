import java.util.Scanner;
public class IfExam2_1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("수식 입력(수와 연산자 사이는 공백을 둘 것) : ");
		int a=sc.nextInt();
		char op=sc.next().charAt(0);
		int b=sc.nextInt();
		switch(op){
			case '+' : System.out.println(a+" + "+b+" = "+(a+b));break;
			case '-' : System.out.println(a+" - "+b+" = "+(a-b));break;
			case '*' : System.out.println(a+" * "+b+" = "+(a*b));break;
			case '/' : System.out.println(a+" / "+b+" = "+(a/b));break;
			case '%' : System.out.println(a+" % "+b+" = "+(a%b));break;
			default : System.out.println("사칙연산자가 아닙니다.");break;
		}
	}
}