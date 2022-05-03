package chapter06;

public class StringEx {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "  Hello         ";
		String str3 = str1.concat("Java");
		
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str1.toString());
		System.out.println(str2.toString());
		System.out.println(str3.hashCode());
		System.out.println(str1.equals(str3));
		System.out.println(str1.charAt(0));
		System.out.println(str1.length());
		System.out.println(str1.replace("ll", "**"));
		System.out.println(str2.trim());
		System.out.println("________________________________________");System.out.println();
		
		String a = new String("  C# ");
		String b =  new String(", C++ ");
		
		System.out.println(a+"의 길이는 "+a.length());
		System.out.println(a.contains("#"));
		
		a= a.concat(b);
		System.out.println(a);
		
		a= a.trim();
		System.out.println(a);
		
		a=a.replace("C#","Java");
		System.out.println(a);
		
		String s[] = a.split(",");
		for(int i=0; i<s.length; i++) System.out.println("분리된 문자열 "+i+" : "+s[i]);
		
		a=a.substring(5);
		System.out.println(a);
		
		char c = a.charAt(2);
		System.out.println(c);	
	
	}

}
