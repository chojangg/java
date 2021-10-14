import java.util.Scanner;
class Max {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);						System.out.print("첫 번째 수 입력 : ");
		int a=sc.nextInt();
		System.out.print("두 번째 수 입력 : ");
		int b=sc.nextInt();
		
		System.out.print(a+"와 "+b+" 중 큰 수는 ");
		if(a>b)
			System.out.print(a+"입니다.");
		else
			System.out.print(b+"입니다.");
	}
}