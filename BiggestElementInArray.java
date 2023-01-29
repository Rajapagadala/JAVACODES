
public class BiggestElementInArray {
public static void main(String[] args) {
	int a[]= {8,78,98,24578,12,26,13,1356};
	int big=a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]>big) {
			big=a[i];
		}
	
		
	}
	System.out.println(big+" ");
}
}
