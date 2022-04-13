import java.util.Scanner;

public class Aray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][]a=new int[3][];
a[0]=new int[3];
a[1]=new int[2];
a[2]=new int[4];
Scanner Scan = new Scanner(System.in);
for(i=0;i<=a.length-1;i++)
{
	for(j=0;j<=a[i].length-1;j++)
	{
		System.out.println("enter the marks of "+(i+1)+ " class "+(j+1)+" students ");
		a[i][j]=Scan.nextInt();
	}
}
for(i=0;i<=a.length-1;i++)
{
	for(j=0;j<=a[i].length-1;j++)
	{
System.out.println(a[i][j]);

	}

}
}}