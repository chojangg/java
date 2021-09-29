import java.util.Scanner;
public class Constant2_1115{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String name;
		final double a=3.14;
		double r;
		System.out.print("반지름 : ");
		r=scan.nextDouble();
		System.out.println("반지름 "+r+"인 원의 둘레 : "+(r*2*a));
		System.out.println("반지름 "+r+"인 원의 넓이 : "+(r*r*a));
		
	}
}