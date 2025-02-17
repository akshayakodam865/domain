import java.util.Scanner;
class Main
{
public static void main(String[] args)
{
int sum=0,pro=1;
int arr[]=new int[5];
Scanner s=new Scanner(System.in);
System.out.println("Enter a numbers");
for(int x=0; x<=arr.length-1; x++)
{
arr[x]=s.nextInt();
}
for(int x=0; x<=arr.length-1; x++)
{
if(arr[x]%2==0)
{
sum=sum+arr[x];
}
else
{
pro=pro*arr[x];
}
}
System.out.println("even"+sum);
System.out.println("odd"+pro);
}
}