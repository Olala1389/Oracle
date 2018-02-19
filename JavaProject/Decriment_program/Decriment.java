public class Decriment{ 

 
 static int a = 2;
 static
  /* {  
    a = a-- - --a; //1111 - 1109

    }
 
*/
{
        a = a++ + ++a;
    }

 public static void main(String[] args)  {
 
       System.out.println(a);
 
    }
 
}
