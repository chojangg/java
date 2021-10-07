import java.util.Scanner;
public class Sum_Money{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String name;
		int er;
		int pen;
		int not;

		System.out.print("문방구 이름 : ");
		name=scan.nextLine();
		System.out.print("지우개, 연필, 노트 : ");
		er=scan.nextInt();
		pen=scan.nextInt();
		not=scan.nextInt();

		int hab=(500*er+700*pen+1600*not);
		System.out.println(name + "문방구에 총지불금액은 " + hab + "원입니다.");
	}
}