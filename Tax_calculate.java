import java.util.Scanner;
public class Tax_calculate{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		
		int salary;
		System.out.print("근로소득을 입력하세요. : ");
		salary=scan.nextInt();
		System.out.print("소득세는 ");
		if (20000000 >= salary)
			System.out.print((int)(salary * 0.05));
		else if(salary <= 40000000)
			System.out.print((int)(salary * 0.15));
		else if(salary <= 80000000)
			System.out.print((int)(salary * 0.25));
		else if(salary > 80000000)
			System.out.print((int)(salary * 0.4));
		else System.out.print(" ");
		System.out.print("원 입니다.");
	}
}