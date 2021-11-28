import java.util.Scanner;
public class SwitchExam5{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int a;
		String result;
		System.out.print("반을 입력 : ");
		a=scan.nextInt();
		switch(a){
			case 1 : case 2 :
				result = "뉴미디어소프트웨어과"; break;
			case 3 : case 4 :
				result = "뉴미디어웹솔루션과"; break;
			 case 5 : case 6 :
				result = "뉴미디어디자인과"; break;
			default :
				result = "입력된 반은 존재하지 않습니다."; break;
		}
		System.out.println(result);
	}
}