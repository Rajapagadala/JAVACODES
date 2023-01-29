
public class CountOvels {
public static void main(String[] args) {
	String s1="benguluru";
	int vc=CountOvels(s1);
	System.out.println(vc+" ");
}

private static int CountOvels(String s1) 
{  int vc=0;
	char ch[]=s1.toCharArray();
	for(int i=0;i<ch.length;i++) {
		 {
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				vc++;
			}
			
		}
	}
	
	return vc;
}
}
