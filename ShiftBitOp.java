public class ShiftBitOp{
	public static void main(String args[]){
		int a=-65; // -128 127
		int c;
		c=/*(byte*/(a>>3);
		System.out.println(c);
		c=/*(byte*/(a<<3);
		System.out.println(c);
		c=/*(byte*/(a>>>3);
		System.out.println(c);
	}
}