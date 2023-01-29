import java.util.*;
public class DEleteArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value..");
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	for(int i=0;i<a.length;i++) {
		System.out.println(i+"=>"+a[i]+" ");
	}
	System.out.println("location..");
	int loc=sc.nextInt();
	for(int i=loc;i<n-1;i++) {
		a[i]=a[i+1];
	}
	n--;
	for(int i=0;i<a.length-1;i++) {
		System.out.println(i+"=>"+a[i]+" ");
	}
}
}
