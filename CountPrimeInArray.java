import java.util.*;
public class CountPrimeInArray {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the values..");
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<a.length;i++) {
	a[i]=sc.nextInt();
}
int cp=cuntprime(a);
System.out.println(cp+" number of prime numbers in the array..");
}
private static int cuntprime(int[] a ) 
{  
	int count=0;
	for(int i=0;i<a.length;i++) {
		boolean rs=isprime(a[i]);
		if(rs==true)
			count++;
	}
	return count;
}
private static boolean isprime(int x)
{  for(int i=2;i<x;i++) {
	if(x%i==0) 
		return false;
}
	return true;
}
}
