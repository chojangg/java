import java.util.Scanner;
public class Sum_Money{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String name;
		int er;
		int pen;
		int not;

		System.out.print("���汸 �̸� : ");
		name=scan.nextLine();
		System.out.print("���찳, ����, ��Ʈ : ");
		er=scan.nextInt();
		pen=scan.nextInt();
		not=scan.nextInt();

		int hab=(500*er+700*pen+1600*not);
		System.out.println(name + "���汸�� �����ұݾ��� " + hab + "���Դϴ�.");
	}
}