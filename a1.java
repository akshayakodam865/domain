/*class Main
{
public static void main(String[] args)
{
int arr[]= new int[5];
arr[0]=100;
arr[1]=200;
arr[2]=300;
arr[3]=400;
arr[4]=500;
System.out.println(arr[0]);
System.out.println(arr[1]);
System.out.println(arr[2]);
System.out.println(arr[3]);
System.out.println(arr[4]);
for(int x=0; x<=4; x++)
{
System.out.println(arr[x]);
}
}
}*/
  /*class Main
  {
    public static void main(String[] args)
	{
	     int[]a=new int[]{10,20,30,40,50,60};
 	     int b[]=new int[a.length-1];
	     int index=3;
		 for(int x=0; x<index; x++)
		 {
		    b[x]=a[x];
		 }
		  int y=index;
                  for(int x=index; x<b.length;x++,y++)
		   {	
 	            b[x]=a[y+1];
	           }
                   for(int x=0; x<b.length-1;x++)
		   {
		   System.out.println(b[x]);
		   }
			
  			
            }
}*/
/* class Main
  {
	public static void main(String[] args)
		{
			int[] a=new int[]{10,-3,2,-1,90,45,-67,-23,12,56,-45,23};
			int[] b=new int[a.length];
		        int y=0;
			  for(int x=0; x<a.length; x++)
				{
					if(a[x]<0)
					{
					b[y]=a[x];
					y++;
				     }
			      }
			for(int x=0; x<=a.length; x++)
			{
			    if(a[x]>=0);		
			    {
			    b[y]=a[x];	
			    y++;
			   }
			}
		for(int x=0; x<=b.length; x++)
		{
		System.out.println(b[x]);
		}
	}
}*/



/*class Main {
    public static void main(String[] args) {
        int[] a = new int[]{10, -3, 2, -1, 90, 45, -67, -23, 12, 56, -45, 23};
        int[] b = new int[a.length];
        int y = 0;

     
        for (int x = 0; x < a.length; x++) {
            if (a[x] < 0) {
                b[y] = a[x];
                y++;
            }
        }

        
        for (int x = 0; x < a.length; x++) {
            if (a[x] >= 0) {
                b[y] = a[x];
                y++;
            }
        }

        
        for (int x = 0; x < b.length; x++) {
            System.out.println(b[x]);
        }
    }
}*/
/*class Main
{
	public static void main(String[] args)
		{
		int[] a=new int[]{1,5,9,2,8};
		
		for(int x=0; x<=9; x++)
		{       int search=x;
			int count=0;
			for(int y=0; y<a.length; y++)
			{         				
					count++;
					break;
					
				}
			}
			if(count==0)
			System.out.println(x);
		
		      }		
	}
}*/
//SHIFTING ZEROES TO END
/*class Main
{
	public static void main(String[] args)
		{
			int[] a=new int[]{0,2,0,6,7,0,8};
		         int s=0;
			    for(int x=0; x<=a.length-1; x++)
			      {
                       
			       for(int y=x+1; y<=a.length-1; y++)
			        {
			
					if(a[x]==0)
					{
					int temp=a[x];
					a[x]=a[y];
					a[y]=temp;
					}
				}
				s= a[a.length-1];	
		
				}
			for(int x=0; x<=a.length-1; x++)
		{
		System.out.println(a[x]);
		}
	}
}*/
class Main
{	
	public static void main(String[] args)
		{
		int[] a=new int[]{1,5,9,2,0};
		Demo d=new Demo();
		for(int x=0; x<=9; x++)
		{	
		int search=x;
		int[] res=d.missingnumber(a);
		for(int temp:a)
		System.out.println(temp);
		}
	}
}
class Demo
{	
	int[] missingnumber(int[] a)
		{
	
		int count=0;
		for(int y=0; y<=a.length-1; y++)
		{
			count++;
			break;
		}
		if(count==0)
		
		return a;
	}
}
/*class Main
{
	public static void main(String[] args)	
	{
		int[] a=new int[]{1,5,9,0};
		int[] b=new int[]{0,1,2,3,4,5,6,7,8,9};
		for(int x=0; x<=9; x++)
			{
				for(int y=0; y<=b.length-1; y++)
			        {
					if(a[x]!=b[y])
					{
					System.out.println();
					}
				}
			}
		}
}*/


		
	

