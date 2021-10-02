public class BitOp{
	public static void main(String args[]){
		int a=3;
		int b=5;
		System.out.println(a&b);//1
		System.out.println(a|b);//7
		System.out.println(a^b);//6
		System.out.println(~a);//-4
		System.out.println(~b);//-6
		System.out.println(3<<2);
		System.out.println(5<<3);//5*2*2*2=40
		System.out.println(12>>2);//12/2/2=3
		System.out.println(-17>>2);//1
		System.out.println(-17>>>2);//0

		System.out.println(17>>2);//0
		System.out.println(17>>>2);//0
	}
}