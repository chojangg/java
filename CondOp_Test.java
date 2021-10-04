import java.util.Scanner;
public class CondOp_Test{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int a;
		System.out.print("데이터 입력 : ");
		a=scan.nextInt();
		if(a % 2 == 0) System.out.println(a + "은(는) 짝수입니다.");
		else System.out.println(a + "은(는) 홀수입니다.");
		
	}
}