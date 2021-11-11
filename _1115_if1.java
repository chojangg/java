import java.util.Scanner;
public class _1115_if1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		System.out.print("가위(1), 바위(2), 보(3) 입력 : ");
		int a=sc.nextInt();

		switch(a){
			case 1: System.out.println("당신은 가위를 내셨습니다.");break;
			case 2 : System.out.println("당신은 바위를 내셨습니다.");break;
			case 3 : System.out.println("당신은 보를 내셨습니다.");break;
			default : System.out.println("잘못 내셨습니다.");
		}
	}
}