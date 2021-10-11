import java.util.Scanner;
public class Time{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int a;
		System.out.print("초 입력 : ");
		a=scan.nextInt();
		
		int b = a/3600;
		int c = (a%3600)/60;
		int d = a%60;
		
		System.out.println(a + "초는 " + b + "시간 " + c + "분 " + d + "초입니다.");
	}
}