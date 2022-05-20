import java.io.*;
import java.util.*;
class encryption 
{  
    int a , b,c,count=0;
     char C;
         
  public void encrypt(String x)
{     
    for( int i = 0; i <x.length(); i++)
     {  count += 1;
        a = x.charAt(i);

       
          if(a>109)
       {
            b = a-13;
            C = (char)b;
            System.out.print(C);
        }

        else if(a<=109)
         {
            c = (26+a)-13;
            C = (char)c;
            System.out.print(C);
          }
       
       else {

 	System.out.print(x.CharAt(i));
             }
    }


}


public static void main(String[] args) throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     encryption o = new encryption();   
    System.out.println("enter the encrypted code bruh, make sure everything is in smallcase only cause i dont want to complicate my code ");
     System.out.println();    
     System.out.println();
     System.out.println();
     String x = br.readLine();
           o.encrypt(x.toLowerCase());


}
}
