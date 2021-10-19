import java.util.Scanner;
public class school2{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String school;
        String n;
        int gr;
        int cl;

        System.out.print("학교 : ");
        school=scan.nextLine();
        System.out.print("학년 : ");
        gr=scan.nextInt();
        System.out.print("반 : ");
        cl=scan.nextInt();
        System.out.print("이름 : ");
        n=scan.nextLine();

        System.out.println(n + "은(는) "+ school + "학교 " + gr + "학년 " + cl + "반입니다.");
    }
}