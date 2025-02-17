import java.util.Scanner;
class Main
{
public static void main(String[] args)
{
int arr[]=new int[5];
System.out.println(arr.length);
Scanner s=new Scanner(System.in);
System.out.println("Enter a number");
for(int x=0;x<=arr.length-1; x++)
{
arr[x]=s.nextInt();
}
for(int x=0; x<=arr.length-1; x++)
{
System.out.println("arr["+x+"]="+arr[x]);
}
}
}