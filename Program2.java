import java.util.Scanner;
public class Program2{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int a;
		int b;
		int c;
		System.out.print("데이터 입력 : ");
		a = scan.nextInt();
			
		c = (a>=0) ? a : -(a);
		System.out.println(a + "의 절대값은 " + c);
		
		//if(a >= 0) System.out.println(a + "의 절대값은 " + a);
		//else System.out.println(a + "의 절대값은 " + -(a));
	}
}