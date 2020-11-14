import java.util.ArrayList;

public class VarTypeSample {

	public static void main(String[] args) {
		// arithmetic operations for integers. +,-,*,/,%
		int a=3023;
		int b=27;
		
		System.out.println(a+"/"+b+" is "+a/b);
		System.out.println(a+"%"+b+" is "+a%b);

		// shift operations for integers: >>, <<
		int c=1<<4;
		int d=0b10111>>3;
		System.out.println("1<<4 is "+c); // 0b10000
		System.out.println("0b10111>>3 is "+d); // 0b10
		System.out.printf("1<<4 is %d,0x%x\n",c,c); // 0b10000
		System.out.printf("0b10111>>3 is %d,0x%x\n",d,d); // 0b10
		
		// bit operation: &, |, ~, ^
		// &,|,^ : exchange rule, combination rule.
		// & to | : allocation rule.
		// | to & : allocation rule.
		// a^a=0
		
		a=0b10111011;
		b=0b01111001;
		
		System.out.println("a&b=ob"+toBinary(a&b)+",a|b="+toBinary(a|b)
			+",a^b="+toBinary(a^b)+",~a="+toBinary(~a));
		
		// logic operation: >,<,>=,<=,==,!= -> boolean result;
		a=100;
		b=99;
		System.out.println((a>b)+","+(a<b)+","+(a>=b)+","
				+(a<=b)+","+(a==b)+","+(a!=b));
		
		//double: +,-,*,/,>,<,>=,<=,==,!=
		
		//boolean operation: &&, || , !
		System.out.println("T&&T="+(true&&true)+","+"T&&F="+(true&&false));
		
		
		
		
		
	}

	private static String toBinary(int i) {
		// TODO Auto-generated method stub
		String s="";
		while (i!=0 && i!=-1) {
			if ((i&0b1)==1) 
				s="1"+s;
			else
				s="0"+s;
			i>>=1;//i=i>>1;
		}
		return "0b"+s;
	}

}
