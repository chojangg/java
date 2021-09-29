import java.util.Scanner;
public class Scanner_1115{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String name;
		int a;
		int b;
		System.out.print("사각형의 밑면 : ");
		a=scan.nextInt();
		System.out.print("사각형의 높이 : ");
		b=scan.nextInt();
		System.out.print("사각형의 넓이 : "+(a*b));
	}
}