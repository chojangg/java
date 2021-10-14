import java.util.Scanner;
class Multiple_3{
	public static void main(String args[]){
		System.out.print("정수 입력 : ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(num + "은(는) 3의 배수");
		if(num%3==0)//3의 배수
			System.out.print("입니다.");
		else
			System.out.print("가 아닙니다.");
	}
}