import java.util.*;
public class DuplicateArray {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the array size..");
	int n=sc.nextInt();
	System.out.println("enter the array elements..");
	int a[]=new int[n];
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	int deplicate=0;
	for(int i=0;i<a.length;i++ ) {
	for(int j=i+1;j<a.length;j++) {
		if(a[i]==a[j]) {
			System.out.print(i+"=>"+a[j]+" ");
		}
	}
	}
}
}
