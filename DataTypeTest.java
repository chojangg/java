public class DataTypeTest{
	public static void main(String args[]){
		int a=19;
		int b=2147483647; //최대값
		System.out.println (a);
		System.out.println (b);

		double c=3.14; 
		double d=7.789;
		int e=a+b;
		System.out.println(e); //2147483666

		System.out.println(b+10); //-2147483639
		int bb=-2147483648; //최소값
		System.out.println(bb-3);
		
		//int f=a+c;
		//int g=c+d;
		double h=c+d;
		System.out.println(h);
	}
}