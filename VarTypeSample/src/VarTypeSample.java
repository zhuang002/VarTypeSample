
public class VarTypeSample {

	public static void main(String[] args) {
		// primitive types
		int i,j,k;
		i=1;
		j=2;
		k=i+j;
		
		System.out.println(i+","+j+","+k);
		
		long li,lj,lk;
		li=1;
		lj=2;
		lk=li+lj;
		
		System.out.println(li+","+lj+","+lk);		
		
		li=i;
		k=(int)lk;
		
		double d1,d2,d3;
		d1=0.1;
		d2=0.2;
		d3=d1+d2;
		
		System.out.println(d1+","+d2+","+d3);	
		
		d1=i;
		i=(int)d1;
		k=2/3;
		
		d2=li;
		li=(long)d2;
		
		char c1,c2,c3;
		c1='A';
		c2='^';
		c3='3';
		System.out.println(""+c1+c2+c3);
		System.out.println((int)c1+","+(int)c2+","+(int)c3);
		
		for (char c=c1;c<='Z';c++) {
			System.out.print(c);
		}
		
		System.out.println();
		System.out.println("ASCII code 63 is '"+(char)63+"'");
		
		boolean b1,b2,b3,b4,b5;
		b1=true;
		b2=false;
		b3=(i>j);
		b4=(i<=k);
		b5=b3||b4;
		
		System.out.print((b1&&b2)+","+(b1||b2)+","+!(b1||(b1 && b2))+","+b5);
		
		
		
	}

}
