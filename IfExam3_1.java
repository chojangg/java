public class IfExam3_1{
	public static void main(String args[]){
		int a = args.length; //2   0 1    3   0 1 2
		if(a==0)
			System.out.println("����� �Ű������� �Է��ϼ���");
		else {
			System.out.print("�Էµ� ����� �Ű������� ");
			for(int i=0; i<args.length; i++)
				System.out.print(args[i]+" ");
		}
	}
}