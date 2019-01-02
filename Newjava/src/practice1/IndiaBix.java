package practice1;

import java.io.FileOutputStream;
import java.io.IOException;

import net.bytebuddy.dynamic.TypeResolutionStrategy.Passive;

public class IndiaBix {
	
	
	 public static void throwit() 
	    {
	        throw new RuntimeException();
	    }
	public static void main(String args[]) throws IOException 
	{
		
		 try 
	        {
	            System.out.println("Hello world ");
	            throwit();
	            System.out.println("Done with try block ");
	        }

	        finally 
	        {
	            System.out.println("Finally executing ");
	        }
	}
	
}

/*public static void leftshift(int i, int j) 
{
    i <<= j; 
} 
public static void main(String args[]) 
{
    int i = 4, j = 2; 
    leftshift(i, j); 
    System.out.println(i); 
} */

/*boolean [] b = new boolean[3];
int count = 0;

void set(boolean [] x, int i) 
{
    x[i] = true;
    ++count;
}

public static void main(String [] args) 
{
	IndiaBix ba = new IndiaBix();
    ba.set(ba.b, 0);
    ba.set(ba.b, 2);
    ba.test();
}

void test() 
{
    if ( b[0] && b[1] | b[2] )
        count++;
    if ( b[1] && b[(++count - 2)] )
        count += 7;
    System.out.println("count = " + count);
}*/



/*IndiaBix p = new IndiaBix();
p.start();
//  System.out.println(p);

}
void start() 
{
Two t = new Two();
System.out.print(t.x + " ");
Two t2 = fix(t);
System.out.println(t.x + " " + t2.x);
}

Two fix(Two tt) 
{
tt.x = 42;
return tt;
}	*/
/*int x= 0;
int y= 0;
for (int z = 0; z < 5; z++) 
{
    if (( ++x > 2 ) || (++y > 2)) 
    {
        x++;
    }
}
System.out.println(x + " " + y);*/

	/*	 IndiaBix p = new IndiaBix();
	        p.start();
	  }
	 
	 void start() 
	    {
	        long [] a1 = {3,4,5};
	        long [] a2 = fix(a1);
	        System.out.print(a1[0] + a1[1] + a1[2] + " ");
	        System.out.println(a2[0] + a2[1] + a2[2]);
	    }

	    long [] fix(long [] a3) 
	    {
	        a3[1] = 7;
	        return a3;
	    }

	*/

//TODO Auto-generated method stub


		/*String [][] argCopy = new String[2][2];
     int x;
     argCopy[0] = args;
     x = argCopy[0].length;
     for (int y = 0; y < x; y++) 
     {
         System.out.print(" " + argCopy[0][y]);
     }
*/

		/*int [] [] [] x = new int [3] [] [];
	    int i, j;
	    x[0] = new int[4][];
	    x[1] = new int[2][];
	    x[2] = new int[5][];
	    for (i = 0; i < x.length; i++)
	    {
	        for (j = 0; j < x[i].length; j++) 
	        {
	            x[i][j] = new int [i + j + 1];
	            System.out.println("size = " + x[i][j].length);
	        }
	    }
	}
*/