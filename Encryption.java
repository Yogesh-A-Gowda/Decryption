import java.io.*;
import java.util.*;
class encryption 
{  
    int a , b,c,count=0;
     char C;
         
  public void encrypt(String y)
{     
    for( int i = 0; i <y.length(); i++)
     { 
        			a = y.charAt(i);

       
          			if(a>109)
       			{
            				b = a-13;
             				 C = (char)b;
            				System.out.print(C);
        			}
       			if ( y.charAt(i) > 122 || y.charAt(i) < 97) 
			{
				System.out.print(y.charAt(i));
             			}

        			else if(a<=109)
         			{
            				c = (26+a)-13;
            				C = (char)c;
            				System.out.print(C);
          			}
       

			
			
			
      }


}


public static void main(String[] args) throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     encryption o = new encryption();   
    System.out.println("enter the encrypted code bruh, make sure everything is in smallcase only cause i dont want to complicate my code ");
     System.out.println();    

     String Y = br.readLine();
           o.encrypt(Y.toLowerCase());


}
}
