import java.util.ArrayList;

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
		
		System.out.println((b1&&b2)+","+(b1||b2)+","+!(b1||(b1 && b2))+","+b5);
		
		int[] iAr= {1,5,8,4,7,6};
		for (i=0;i<iAr.length;i++) {
			System.out.print(iAr[i]+" ");
		}
		System.out.println();
		int n=100;
		int[] iAr2=new int[n];
		
		for (i=0;i<iAr2.length;i++) {
			iAr2[i]='A'+i%26;
		}
		for (i=0;i<iAr2.length;i++) {
			System.out.print((char)iAr2[i]);
		}
		System.out.println();
		
		String s1="I am a student.";
		String s2="You are also a student.";
		System.out.println(s1+s2);
		System.out.println("size of s1 is "+s1.length());
		for (i=0;i<s1.length();i++) {
			System.out.print(s1.charAt(i)+",");
		}
		System.out.println();
		
		String[] sAr=s2.split(" ");
		for (i=0;i<sAr.length;i++) {
			System.out.print(sAr[i]+"|");
		}
		System.out.println();
		
		
		String s3=s1+s2;
		int idx1=s3.indexOf("student");
		int idx2=s3.lastIndexOf("student");
		System.out.println("The first 'student' is from index "+idx1+". The last index of 'student' is from index "+idx2+".");
		
		
		ArrayList<String> al=new ArrayList<>();
		for (i=0;i<sAr.length;i++) {
			al.add(sAr[i]);
		}
		System.out.println(al);
		
		String[] sAr2=s1.split(" ");
		for (i=0;i<sAr2.length;i++) {
			al.add(i,sAr2[i]);
		}
		System.out.println(al);
		for (i=0;i<sAr2.length;i++) {
			al.add(0,sAr2[i]);
		}
		System.out.println(al);
		
		ArrayList<String> al2=new ArrayList<>();
		for (i=0;i<al.size();i++) {
			if (!al2.contains(al.get(i))) {
				al2.add(al.get(i));
			}
		}
		System.out.println(al2);
		
		al2.remove("student.");
		System.out.println(al2);
		
		al2.remove(3);
		System.out.println(al2);

	}

}
