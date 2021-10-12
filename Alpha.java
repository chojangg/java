import java.util.Scanner;
public class Alpha {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		char a;
		System.out.print("문자 입력 : ");
		a=sc.next().charAt(0);

		char b=(a-=32);
		System.out.println("소문자" + a + "의 대문자는 " + b + "입니다.");
	}
}
