import java.util.Scanner;
public class Salary_switch_1{
	public static void main(String args[]){
		setRating(String rating, double currentSalary)
	}
}

import java.util.Scanner;
public class Salary_Switch{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        double currentSalary;
        String rating;
        double raise = 0.0;
        double newSalary;
        System.out.print("현 연봉을 입력하세요 : ");
        currentSalary=scan.nextInt();
        System.out.print("근무평가등급을 입력하세요 : ");
        rating=scan.next();

        raise = new Switch().setRating(rating, currentSalary);
        newSalary = currentSalary + raise;

        System.out.print("연봉 인상액 : " + (int)raise);
        System.out.println("새 연봉 : " + newSalary);

    }
}

class Switch {
    public double setRating(String rating, double currentSalary) {
        double raise = 0.0;
        switch(rating){
            case "우수" :
                raise=(currentSalary * 0.06);
                break;
            case "보통" :
                raise=(currentSalary * 0.04);
                break;
            case "불량" :
                raise=(currentSalary * 0.02);
                break;
            default :
                System.out.println("잘못 입력함");
        }
        return raise;
    }
}