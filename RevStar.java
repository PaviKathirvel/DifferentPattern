import java.util.*;
public class RevStar{
public static void main(String args[]){
	int n;
	Scanner s = new Scanner(System.in);
	n=s.nextInt();
	int a[]=new int[n];
	int i,ep,sp;
	a[0]=1;
	for(i=1;i<n;i++){
	a[i]=(i+1)+a[i-1];	
	}
	for(i=n-1;i>=0;i--){
		ep=a[i];
		sp=ep-i;
		while(sp<=ep){
		System.out.print(sp+" ");
		sp++;
		}
	System.out.println();
	}
}
}