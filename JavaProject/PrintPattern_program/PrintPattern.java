/* Print each of the followings patterns using nested loops. */
/* //A
public class PrintPattern {

    public static void main(String[] args) {
        for(int row=1; row<=8; ++row) {
            for(int col=1; col <=row; ++col) {
            System.out.print(" # ");
            }
        System.out.println();
        }
    }
}
*/

/* //B
public class PrintPattern {

    public static void main(String[] args) {
        for(int row=8; row>=1; --row) {
            for(int col=1; col <=row; ++col) {
            System.out.print(" # ");
            }
        System.out.println();
        }
    }
}
*/ 

 /*     C

public class PrintPattern {

public static void main(String[] args){
int k = 1;
  for(int row=8; row>=1; --row) {
     
         for(int col =1; col <=row;++col) {
         System.out.print(" #");
         }
         System.out.println(); 
        
         for(int emptyspace = 0; emptyspace<=k- 1; ++emptyspace){
         System.out.print("  ");
         }
         ++k;
    }
    System.out.println();
  }
}
*/

/*        D

public class PrintPattern {

public static void main(String[] args) {
int k = 8;

for(int row = 1; row <=8; ++row) {
    
    for(int emptyspace=0; emptyspace<=k*2-2; ++emptyspace) {
    System.out.print(" ");
    }
    --k;

    for(int col = 1; col<=row; ++col) {
    System.out.print("# ");
    }
    System.out.println();
 }
}
}

*/

/*         E

public class PrintPattern {

public static void main(String [] args) {

for (int row = 7; row >=1; --row) { 

for(int col = 1; col <=7; ++col) {


    if(row<2 || row>6 || (row < 7 & row>1 & (col<=1 || col >=7)))
    {

        System.out.print("#   ");
    }   

    if(row < 7 & row >1 &  col>=2 & col <=6){ 

        System.out.print("    ");
    }      
    
}
        System.out.println();
}
}
}
*/

/* F

public class PrintPattern {
public static void main(String[] args){

for(double row = 1; row <=7; ++row) {
    for(double col = 1; col<=7; ++col) {
    if(row >=7 || row <=1) {
    System.out.print("# ");
    }
    if(row<7 & row>1 & row/col==1)
    {
    System.out.print("# ");
    }

    if(row<7 & row>1 & row/col!=1) {
    System.out.print("  ");
    }
    }
    System.out.println();
}
}
}
*/

/*      G
public class PrintPattern {
public static void main(String [] args) {
for(double row = 7; row >=1; --row) {
    for(double col = 1; col<=7; ++col) {
        if(row>=7 || row <=1) {
        System.out.print("# ");
        }
        if(row<7 & row >1 & row/col==1) {
        System.out.print("# ");
        }
        if(row<7 & row >1 & row/col!=1){ 
        System.out.print("  ");
        }
        }
        System.out.println();
        }
    }   
}
*/ 

/*      H
public class PrintPattern{
public static void main(String [] args) {
    for(double row = 7; row >=1; --row) {
        for(double col = 7; col >=1; --col){
        if(row>=7 || row<=1) {
        System.out.print("# ");
        }
        if(row<7 & row>1 & (row/col==1 || row+col==8)){
        System.out.print("# ");
        }
        if(row<7 & row>1 & row/col!=1 & row+col!=8) {
        System.out.print("  ");
        }
        }
        System.out.println();
        }
    }
}
*/

//      I











































