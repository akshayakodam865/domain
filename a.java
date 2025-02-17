/*class Main
{
	public static void main(String[] args)
		{
			int arr[]= new int[]{10,20,30,40,50};
			System.out.println("array length is "+arr.length);
		}
}*/
/*class Main
{
	public static void main(String[] args)
		{
			int[] a=new int[]{10,20,30,40,50};
			int size=a.length;
			int[] b=new int[size];
			System.out.println("a array length is"+a.length);
			System.out.println("b array length is"+b.length);
				for(int x=0; x<=size-1; x++)
				{
			           b[x]=a[x];
				}
				   System.out.println("a array element");
			       for(int x=0; x<=a.length-1; x++)
				{
				System.out.println(a[x]);
				}
				System.out.println("b array element");
				for(int x=0; x<=b.length-1; x++)
				{
				System.out.println(b[x]);
				}
			}
}*/
/*class Main
{
	public static void main(String[] args)
		{
			int[]a=new int[]{10,20,30,40,50};
			int search=40,count=0;
			  for(int x=0; x<=a.length; x++)
				{
				if(search==a[x])
				{
				System.out.println("search element " + search + " of found");
					count++;
					break;
				}
			}
		if(count==0)
		{
		System.out.println("search element " + search + " is not found");
		}
	}
}*/
/*class Main
{
	public static void main(String[] args)
		{
			int[] a=new int[]{10,20,30,40,50};
			int size=a.length;
			int[] b=new int[size];
			int y=size-1;
				for(int x=0;x<size; x++)
				{
					b[x]=a[y];		
					y--;
	              			}
					System.out.println("original array");
					     for(int x=0; x<size; x++)	
					      {
					       System.out.println(a[x]+" ");
					      }
					      System.out.println("reversed array");
					        for(int x=0; x<size; x++)	
					        {
					          System.out.println(b[x]+" ");
					        }
					

					
				
            }
}*/

/*class Main
{
	public static void main(String[] args)
		{
			int[] a=new int[]{10,20,30,40,50};
			int[] b=new int[]{16,54,36,112};
			int[] c=new int[a.length+b.length];
			int x=0,y=0,z=0;
				for(; y<=a.length-1; x++,y++)
				        {
					c[x]=a[y];
				        }
				for(; z<=b.length-1; x++,z++)
				        {
					c[x]=b[z];
				        }
				        System.out.println("Combined array:");
                                         for (int i = 0; i < c.length; i++) 
				         {
                                          System.out.print(c[i] + " ");
                                          }
					
			}
}*/
/*class Main
{
   public static void main(String[] args)
	{
		int[] a=new int[]{-5,-9,-7,-9,-2,-1};
		int Max=Integer.MIN_VALUE;
		for(int x=0; x<a.length; x++)
		{
		if(a[x]>Max)
		{
		Max=a[x];
		}
		
	}
		System.out.println("max of value " + Max);
	

	}

}*/
/*class Main
{
   public static void main(String[] args)
	{
		int[] a=new int[]{-5,-9,-7,-9,-2,-1};
		int Min=Integer.MAX_VALUE;
		for(int x=0; x<a.length; x++)
		{
		if(a[x]<Min)
		{
		Min=a[x];
		}
		
	}
		System.out.println("min of value " + Min);
	

	}

}*/
/*class Main
{
	public static void main(String[] args)
		{
			int[]a=new int[]{12,34,56,9,45};
			int max=Integer.MIN_VALUE;
			int smax=Integer.MIN_VALUE;
			for(int x=0;x<a.length; x++)
				{
				if(a[x]>max)
				{
				smax=max;
				max=a[x];
				}
				else if(a[x]>smax&&a[x]!=max)
				{
				smax=a[x];
				}
				
			}
			System.out.println(smax);
		}
}*/
/*class Main
{
	public static void main(String[] args)
		{
			int[]a=new int[]{12,34,56,9,45};
			int min=Integer.MAX_VALUE;
			int smin=Integer.MAX_VALUE;
			for(int x=0;x<a.length; x++)
				{
				if(a[x]<min)
				{
				smin=min;
				min=a[x];
				}
				else if(a[x]<smin&&a[x]!=min)
				{
				smin=a[x];
				}
				
			}
			System.out.println(smin);
		}
}*/
/*class Main
{
	public static void main(String[] args)
		{
  			int a[]=new int[]{10,20,30,40,50};
			int b[]=new int[a.length];
			for(int x=0; x<=a.length; x++)
			{
				if(x==0)
				{
  				b[x]=a[x]+a[x+1];
				if(x=a.length-1)
				b[x]=a[x]+a[x+1];
				else
				b[x]=a[x-1]+a[x+1];
				}
				for(int x=0; x<=b.length-1; x++)
				{
				System.out.println(b[x]);
				}
 			}	
		}
}*/
/*class Main
{
	public static void main(String[] args)
		{
			int[]a=new int[]{10,20,30,40,50};
			int[]b=new int[a.length];
			int sum=0;
				for(int x=0; x<=a.length-1; x++)
					{
						sum=sum+a[x];
					}
				for(int x=0; x<=a.length-1; x++)
					{
					b[x]=(sum-a[x])/a[x];
					}
				for(int x=0; x<=a.length-1; x++)
					{
					System.out.println(b[x]);
					}
		}
}*/
/*class Main
{
	public static void main(String[] args)
	{
		int a[]=new int[]{10,-1,-2,-3,90,45,-67,-23,12,56,-45,23};
		int b[]=new int[a.length];
		int y=0;
		for(int x=0; x<=a.length-1; x++)
		{
			if(a[x]<0)
			{
			    b[y]=a[x];
			    y++;
			}
		}	
		for(int x=0; x<=a.length-1; x++)
		{
			if(a[x]>0)
			{
			  b[y]=a[x];
			   y++;
			}
		}
		for(int x=0; x<=a.length-1; x++)
		{
		System.out.println(b[x]);
		}
	}
}*/
		
					

	/*class Main
	{
		public static void main(String[] args)
			{
			int[] a=new int[]{10,20,30,40,50,60};
			for(int x=0; x<=a.length-1; x++)
			{
				for(int y=x+1; y<=a.length-1; y++)
				{
				if(a[x]>a[y])
				{
				int temp=a[x];
				a[x]=a[y];
				a[y]=temp;
				}
			     }
			}
			for(int x=0; x<=a.length-1; x++)
			{
			System.out.println(a[x]);
			}
		}
}*/
/*class Main
{
	public static void main(String[] args)
	{
                        int[] a=new int[]{10,5,2,7,8,6,3,9,1};
			for(int x=0; x<=a.length-1; x++)
			{
				for(int y=x+1; y<=a.length-1; y++)
				{
				if(a[x]<a[y])
				{
				int temp=a[x];
				a[x]=a[y];
				a[y]=temp;
				}
			     }
			}
			for(int x=0; x<=a.length-1; x++)
			{
			System.out.println(a[x]);
			}
		}
}*/
// IN ASCENDING ORDER LEAST AND HIGH
/*class Main
{	
	public static void main(String[] args)
		{
			int  a[]=new int[]{10,5,2,7,8,6,3,9,1};
			for(int x=0; x<=a.length-1; x++)
			{
				for(int y=x+1; y<=a.length-1; y++)
				{
				if(a[x]>a[y])
				{
				int temp=a[x];
				a[x]=a[y];
				a[y]=temp;
			      }
			}
		}
			
		
		  System.out.println(a[a.length-1]);
		  System.out.println(a[0]);

		

			
		}
}*/
//IN DESENDING ODRDER LEAST AND HIGHEST
/*class Main
{
	public static void main(String[] args)
	{
int[] a=new int[]{10,5,2,7,8,6,3,9,1};
			for(int x=0; x<=a.length-1; x++)
			{
				for(int y=x+1; y<=a.length-1; y++)
				{
				if(a[x]<a[y])
				{
				int temp=a[x];
				a[x]=a[y];
				a[y]=temp;
				}
			     }
			}
			System.out.println(a[0]);
			System.out.println(a[a.length-1]);
						
		}
}*/
//second high in decending order
/*class Main
{
	public static void main(String[] args)
	{
int[] a=new int[]{10,5,2,7,8,6,3,9,1};
			for(int x=0; x<=a.length-1; x++)
			{
				for(int y=x+1; y<=a.length-1; y++)
				{
				if(a[x]<a[y])
				{
				int temp=a[x];
				a[x]=a[y];
				a[y]=temp;
				}		

			     }
			}
			for(int x=1; x<=a.length-1; x++)			
			{
			if(a[x]!=a[a.length-1])
			{ 
			System.out.println("second high " + a[x]);
			break;
			}
			}
		
						
		}
}*/
//second high in ascending order
/*class Main
{
	public static void main(String[] args)
	{
int[] a=new int[]{10,5,2,7,8,6,3,9,1};
			for(int x=0; x<=a.length-1; x++)
			{
				for(int y=x+1; y<=a.length-1; y++)
				{
				if(a[x]>a[y])
				{
				int temp=a[x];
				a[x]=a[y];
				a[y]=temp;
				}		

			     }
			}
			for(int x=1; x<=a.length-1; x++)			
			{
			if(a[x]!=a[a.length-1])
			{ 
			System.out.println("second high " + a[x]);
			break;
			}
			}
		
						
		}
}*/
	

	
/*import java.util.Arrays;
/*class Main
{
	public static void main(String[] args)
		{
			int[] a=new int[]{10,25,23,45,33,57,65};
			int[] b=new int[]{10,23,25,33,45,65,57};
			Arrays.sort(a);
			Arrays.sort(b);
			boolean res=Arrays.equals(a,b);
			if(res==true)
			System.out.println("equal");
			else
			System.out.println("not equal");
		}
}*/
/*class Main
{
	public static void main(String[] args)
		{
		int[] a=new int[]{1,-2,4,-6,5,-8,9};
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
	        for(int x=0; x<a.length; x++)
		{
			if(a[x]>0)
			{
			b[y]=a[x];
			y++;
			}
		}
	for(int x=0; x<y; x++)
	{
	System.out.print(b[x]+" ");
	}
     }
}*/
/*class Main
{
	public static void main(String[] args)
		{
			int[] a=new int[]{12,17,8,5,20,3,6};
			int[] b=new int[a.length];
			int y=0;
			for(int x=0; x<a.length; x++)
			{
				if(a[x]%2==0)
				{
				b[y]=a[x];
				y++;
				}
			}
			for(int x=0; x<a.length; x++)
			{
				if(a[x]%2!=0)
				{
				b[y]=a[x];
				y++;
				}
			}
			for(int x=0; x<y; x++)
			{
			System.out.println(b[x]);
			}

		}
}*/
/*class Main
{
	public static void main(String[] args)
		{
			int[] a=new int[]{10,20,30,40,50,60};
			int[] b=new int[a.length];
			int y=0;
			for(int x=0; x<a.length; x++)
			{
				if(x%2==0)
				{
				b[y]=a[x];
				y++;
				}
			}
			for(int x=0; x<a.length; x++)
			{
				if(x%2!=0)
				{
				b[y]=a[x];
				y++;
				}
			}
			for(int x=0; x<y; x++)
			{
			System.out.println(b[x]);
			}

		}
}*/

/*class Main
{
	public static void main(String[] args)
		{
			int[] a=new int[]{2,3,4,5,40,44};
			for(int x=0; x<a.length; x++)
			{
			int num=a[x];
			int count=0;
			for(int start=2; start<=num/2; start++)
			{
				if(num%start==0)
				{
				count++;
				break;
			
			        }
			
		        }
			if(count==0&&num>=2)
			{
			System.out.println(num);
			}
		    }
		}
}*/
//LEFT ROTATION;
/*class Main
{
	public static void main(String[] args)	
		{
			int[] a=new int[]{10,20,30,40,50,60,70,80,90,100};
			int temp=a[0];
			for(int x=0;x<a.length-1; x++)
			{
			a[x]=a[x+1];
			}
			a[a.length-1]=temp;
			for(int x=0; x<a.length; x++)		
			{
			System.out.println(a[x]+" ");
			}
		}
}*/
//RIGHT ROTAION;
			
/*class Main
{
	public static void main(String[] args)
		{
			int [] a=new int[]{10,20,30,40,50,60,70,80,90,100};
			int temp=a[a.length-1];	
			for(int x=a.length-1;x>0; x--)
			{
			a[x]=a[x-1];
			}
			a[0]=temp;
			for(int x=0; x<a.length; x++)
			{
			System.out.println(a[x]);
			}
		}
}*/
/*class Main
	{
		public static void main(String[] args)
			{
			int[] a=new int[]{10,5,2,7,8,6,3,9,1};
			for(int x=0; x<=a.length-1; x++)
			{
				for(int y=x+1; y<=a.length-1; y++)
				{
				if(a[x]>a[y])
				{
				int temp=a[x];
				a[x]=a[y];
				a[y]=temp;
				}
			     }
			}
			for(int x=0; x<=a.length-1; x++)
			{
			System.out.println(a[x]);
			}
			int  l=a.length-1,f=0,search=3;
			for(;f<=l;)
			{
			   int m=(f+l)/2;
			    if(search==a[m])
			    {
				System.out.println("element found");
				break;
			    }
			   else if(search>a[m])
		       	   {
				f=m+1;	
			 
			    }
			   else if(search<a[m])
			   {
				l=m-1;
			    }
			   }
			if(f>l)
			{
			System.out.println("element not found");
			
			
                   }
		}
}*/
	/*class Main
	{
		public static void main(String[] args)
			{
			int[] a=new int[]{10,5,2,7,8,6,3,9,1};
			for(int x=0; x<=a.length-1; x++)
			{
				for(int y=x+1; y<=a.length-1; y++)
				{
				if(a[x]<a[y])
				{
				int temp=a[x];
				a[x]=a[y];
				a[y]=temp;
				}
			     }
			}
			for(int x=0; x<=a.length-1; x++)
			{
			System.out.println(a[x]);
			}
			int  l=a.length-1,f=0,search=3;
			for(;f<=l;)
			{
			   int m=(f+l)/2;
			    if(search==a[m])
			    {
				System.out.println("element found");
				break;
			    }
			   else if(search>a[m])
		       	   {
				l=m-1;;	
			 
			    }
			   else if(search<a[m])
			   {
				f=m+1;
			    }
			   }
			if(f>l)
			{
			System.out.println("element not found");
			}
			

			
		}
}*/	
/*class Main
	{	
		public static void main(String[] args)
			{
			int[] a=new int[]{10,20,30,40,50};
			Demo d=new Demo();
			int[] res=d.leftRotation(a);
			for(int x=0; x<a.length; x++)
			System.out.println(a[x]);
			}
}
   class Demo
	{
		int[] leftRotation(int[] a)
		{
		int temp=a[0];
		for(int x=0; x<a.length-1; x++)
		{
		a[x]=a[x+1];
		}
		a[a.length-1]=temp;
		return a;
	}
}*/
/*class Main
{
	public static void main(String[] args)
		{
		String[] a=new String[]{"hello", "all","good","morning"};
		Demo d=new Demo();
		String[] res=d.leftRotation(a);	
		for( int x=0; x<=a.length-1; x++)
		System.out.println(a[x]);	
		}
}
class Demo
	{
		String[] leftRotation(String[] a)
		{
	        String temp=a[0];
		for(int x=0; x<=a.length-2; x++)
		{
		a[x]=a[x+1];
		}
		a[a.length-1]=temp;
		return a;
	}
}*/
/*class Main
{
	public static void main(String[] args)
		{
			char[] a=new char[]{'a','k','s','h','a','y','a'};
			Demo d=new Demo();
			char[] res=d.leftRotation(a);
			for(int x=0; x<=a.length-1; x++)
			System.out.println(a[x]);
		}
}
class Demo
	{
		char[] leftRotation(char[] a)
		{
		char temp=a[0];
		for(int x=0; x<=a.length-2; x++)
		{	
		a[x]=a[x+1];
		}	
		a[a.length-1]=temp;
		return a;
	}
}*/
/*class Main
{
	public static void main(String[] args)
		{
		     
		     int[] a=new int[]{10,20,30,40,50};
		     int temp;
		     for(int r=1; r<=5; r++)
		     {
			 temp=a[0];
			 for(int x=0; x<=a.length-2; x++)
		         {
		            a[x]=a[x+1];
		         }
		         a[a.length-1]=temp;
			 System.out.println("\nrotations" + r);
		     for(int x=0; x<a.length; x++)
		     {
		        System.out.println(a[x]);
		     }
		}
               }
}*/
/*class Main
{
	public static void main(String[] args)
		{
			int[] a=new int[]{10,20,30,40,50};
			Demo d=new Demo();
			for(int r=1;r<=5;r++)
		        {
			int[] res=d.leftRotation(a);
			System.out.println("\nrotations" + r);
			for(int x=0; x<=a.length-1; x++)
			System.out.println(a[x]);
			}
		}
}
class Demo
{
	int[] leftRotation(int[] a)
	{
		int temp;
	
		temp=a[0];
		for(int x=0; x<=a.length-2; x++)
		{
			a[x]=a[x+1];
		}
		a[a.length-1]=temp;
		return a;
	}
}*/
	 
/*class Main
{
	public static void main(String[] args)
		{
			int [] a=new int[]{10,20,30,40,50,60,70,80,90,100};
			Demo d=new Demo();
			int[] res=d.rightRotation(a);
			for(int x=0; x<a.length; x++)
			System.out.println(a[x]);
		}
	}
class Demo
{
	int[] rightRotation(int[] a)
		{
			int temp=a[a.length-1];
			for(int x=a.length-1;x>0; x--)
			{
			a[x]=a[x-1];
			}
			a[0]=temp;
			return a;
			
		}
}*/
/*class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{10,20,30,40,50};
		Demo d=new Demo();
		for(int r=1; r<=5; r++)
		{
		int[] res=d.rightRotation(a);
		System.out.println("\nrotations" + r);
		for(int x=0; x<=a.length-1; x++)
		System.out.println(a[x]);
		}
	}
}
class Demo
{
	int[] rightRotation(int[] a)
		{
		int temp=a[a.length-1];
		for(int x=a.length-1; x>0; x--)
		{
		a[x]=a[x-1];
		}
		a[0]=temp;
		return a;
	}
}*/
/*class Main
{
	public static void main(String[] args)
	{
		int[] a=new int[]{10,50,40,80,30,70};
		Demo d=new Demo();
		int[] res=d.leftRotation(a);
		for(int x=0; x<=length-1; x++)
		System.out.println(a[x]);
	}
}
class Demo
{
	int[] binarySearch(int[] a)
        {
		for(int x=0; x<=a.length-1; x++)
         	 {
			for(int x=y+1; x<=a.length-1; y++)
			{
				if(a[x]>a[y])
				{
					int temp=a[x];
					a[x]=a[y];
					a[y]=temp;
				}
			}
		}
		int f=0,l=a.length-1,search=45;
		while(f<=l)
		{
			 m=(f+l)/2;
		 }
		     if(search==a[m])
		        {
			     System.out.println("element found");
				break;
			}
		     else if(search>a[m])
			{
			f=m+1;
			}
		     else if(search<a[m])
			{
			l=m-1;
			}
		     if(f>l)
		     System.out.println("\n element not found");
			return a;
		}
}*/
/*class Main
{
	public static void main(String[] args)
		{
		int[] a=new int[]{20,50,30,10,40};
		Demo d=new Demo();
		int[] res=d.sortingUsingSingleLoop(a);
		for(int temp:res)
		System.out.println(temp);

		}
}
class Demo
{
	int[] sortingUsingSingleLoop(int b[])
	 {
	  for(int x=0; x<=a.length-2; x++)
          {
		if(b[x]>b[x+1])
		{
		int t=b[x];
		b[x]=b[x+1];
		b[x+1]=t;
		x=-1;
	      }	
      }
	return b;
    }
}*/
/*class Myclass
{
	public static void main(String[] args)
	{
	  int[] a=new int[]{1,0,5,9,5,7,2};
	  Demo d=new Demo();
          d.missingElements(a);
	  }
}
class Demo
{
 void missingElements(int[] a)
 {
		for(int x=0; x<=9; x++)
		{
    			int count=0;
			for(int y=0; y<a.length; y++)
			{
				if(x==a[y])
				{
					count++;
					break;
				}
                        }
                if(count==0)
		{
		System.out.println(x);
		}
	
                }
					
	}
}*/


/*class Myclass
{
	public static void main(String[] args)
	{
	  int[] a=new int[]{1,0,5,9,5,7,2};
	  Demo d=new Demo();
          String res= d.missingElements(a);
	  System.out.println(res);
         }
}
class Demo
{
 String missingElements(int[] a)
 {
		String res=" ";
		{
		for(int x=0; x<=9; x++)
		{
    			int count=0;
			for(int y=0; y<a.length; y++)
			{
				if(x==a[y])
				{
					count++;
					break;
				}
                        }
                if(count==0)
		{
		res=res+x+" ";

		}
			
                }
		return res;
		
		}			
	}
}*/
/*class Myclass
{
	public static void main(String[] args)
	{
	int[] a=new int[]{1,0,3,0,4,5};
	Demo d=new Demo();
	d.zeroes(a);
}
}
class Demo
{
  void zeroes(int[] a)
  {
	int c1=0,c2=0;
		for(int x=0;x<=a.length-1; x++)
		{
			if(a[x]==0)
			{
				c1++;
			}
			else
			{
				a[c2]=a[x];
				c2++;
			}
		}
		for(int x=1; x<=c1; x++)
		{
			a[a.length-x]=0;
		}
			for(int t:a)
			{
				System.out.println(t);
			}
   }
 }*/
/*class Myclass
{
	public static void main(String[] args)
	{
	int[] a=new int[]{1,0,3,0,4,5};
	Demo d=new Demo();
	int[] res=d.zeroes(a);
	for(int temp:res)
	System.out.println(temp);
   }
}
class Demo
{
	int[] zeroes(int[] a)
	{
	int c1=0,c2=0;
	for(int x=0;x<=a.length-1; x++)
	{
		if(a[x]==0)
		{
		c1++;
		}
		else
		{
		a[c2]=a[x];
		c2++;
		}
	}
	for(int x=1; x<=c1; x++)
	{
		a[a.length-x]=0;
	}
	for(int t:a)
	{
	return a;
	}
   }
 }*/
	
		        

		

			
	
	
	

 


 

	

 


 
					








	

		
				

		
				


				
			