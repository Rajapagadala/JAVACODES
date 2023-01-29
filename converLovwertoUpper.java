import java.util.*;
public class converLovwertoUpper {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string");
	String str=sc.nextLine();
	str=converLovwertoUpper(str);
	System.out.println(str+" ");
}

 static String converLovwertoUpper(String str) 
{ 
	char ch[]=str.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		
			if(ch[i]>='a' && ch[i]<='z')
			ch[i]=(char)(ch[i]-32);
		
	}
	str=new String(ch);
	return str;
}
}
