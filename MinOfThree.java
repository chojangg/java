import java.util.Scanner;
class MinOfThree{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int a, b, c;
		System.out.print("첫 번째 수 입력 : ");
		a=scan.nextInt();
		System.out.print("두 번째 수 입력 : ");
		b=scan.nextInt();
		System.out.print("세 번째 수 입력 : ");
		c=scan.nextInt();

		System.out.print(a+"와 "+b+"와 "+c+"중 제일 작은 수는 ");
		if(a<b) {
			if(a<c) {
			System.out.print(a+"입니다.");
		} else(b<c)
			System.out.print(b+"입니다.");
		}
		
		if(b<c) System.out.print(c+"입니다.");
		else 
	}
}