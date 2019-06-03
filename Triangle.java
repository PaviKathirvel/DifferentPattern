import java.util.*;
public class Traingle{
public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	int n=s.nextInt();
	int i,j;
	for(i=1;i<=n;i++){
		for(j=1;j<=n;j++){
			if(j==i || j==1 || i==n)
				System.out.print("* ");
			else
				System.out.print("  ");
			}
		System.out.println();
		}
	}
}