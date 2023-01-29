
public class AscendingANDDescending {
public static void main(String[] args) {
	int a[]= {1,75,45,3,2,10,98,6,7,8,9};
	int temp=0;
	for(int i=0;i<a.length/2;i++) {
		for(int j=i+1;j<a.length/2;j++ ) {
			if(a[i]>a[j])
			{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
		}
	
	System.out.print(a[i]+" ");
	}
	for(int i=a.length/2;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++ ) {
			if(a[i]<a[j])
			{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}  
		}
	
	System.out.print(a[i]+" ");
	}
	
}
}
