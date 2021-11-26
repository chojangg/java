import java.util.Scanner;
public class AddMethod{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);

		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int res=add(a, b);
		add(a, b);
		System.out.println(a+"+"+b+"="+res);
	
	}
	static void add(int aa, int bb){
		int result=aa+bb;
		return result;
	}
}