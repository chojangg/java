import java.util.Scanner;
public class SwitchExam5{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int a;
		String result;
		System.out.print("���� �Է� : ");
		a=scan.nextInt();
		switch(a){
			case 1 : case 2 :
				result = "���̵�����Ʈ�����"; break;
			case 3 : case 4 :
				result = "���̵�����ַ�ǰ�"; break;
			 case 5 : case 6 :
				result = "���̵������ΰ�"; break;
			default :
				result = "�Էµ� ���� �������� �ʽ��ϴ�."; break;
		}
		System.out.println(result);
	}
}