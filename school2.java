import java.util.Scanner;
public class school2{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String school;
        String n;
        int gr;
        int cl;

        System.out.print("�б� : ");
        school=scan.nextLine();
        System.out.print("�г� : ");
        gr=scan.nextInt();
        System.out.print("�� : ");
        cl=scan.nextInt();
        System.out.print("�̸� : ");
        n=scan.nextLine();

        System.out.println(n + "��(��) "+ school + "�б� " + gr + "�г� " + cl + "���Դϴ�.");
    }
}