import java.util.Scanner;
public class _1115_if2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("오늘의 요일을 입력하세요.");
		System.out.print("SUN(0) MON(1) TUE(2) WED(3) THU(4) FRI(5) SAT(6) : ");
		int w=sc.nextInt();
		switch(w){
			case 0 :System.out.println("오늘은 SUNDAY입니다.");break;
			case 1:System.out.println("오늘은 TUESDAY입니다.");break;
			case 2:System.out.println("오늘은 WEDNESDAY입니다.");break;
			case 3:System.out.println("오늘은 THURSDAY입니다.");break;
			case 4:System.out.println("오늘은 FRIDAY입니다.");break;
			case 5:System.out.println("오늘은 SATURDAY입니다.");break;
			case 6:System.out.println("오늘은 SUNDAY입니다.");break;
			default :System.out.println("요일을 잘못 입력하셨습니다.");break;
		}
	}
}