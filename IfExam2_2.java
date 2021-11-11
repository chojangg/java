import java.util.Scanner;
public class IfExam2_2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String c=sc.nextLine();
		 String[] data = c.split(" ");
		int a=Integer.parseInt(data[0]);
		int b=Integer.parseInt(data[2]);
		 char op=data[1].charAt(0);

		if(op == '+' )
			System.out.println(a + "+" + b + "=" + (a+b));
		else if(op == '-')
			System.out.println(a + "-" + b + "=" + (a-b));
		else if(op == '*')
			System.out.println(a + "*" + b + "=" + (a*b));
		else if(op == '/')
			System.out.println(a + "/" + b + "=" + (a/b));
		else if(op == '%')
			System.out.println(a + "%" + b + "=" + (a%b));
		else System.out.println("사칙연산자가 아닙니다.");
    }
}