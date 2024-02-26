// import java.util.*;
public class patten {
    public static void hollw_rectangle(int totRow, int totCols){

            for(int i =1; i<= totRow; i++){

                for(int j = 1; j <= totCols; j++){
                    if(i == 1 || i == totRow || j == 1 || j == totCols){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
        }
    }   
    public static void rotatade_half_pyramid(int n){
        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inveted_half_phramid_with_number(int n){

        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= n-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    public static void floyds_triangle(int n){
        int counter = 1;
        for(int i =1; i <= n; i++){

            for(int j = 1; j <=i; j++){
                   System.out.print(counter + " ");
                   counter++;
            }
            System.out.println();
        }
    }

    public static void zero_one_traiangle(int n){
        
        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= i; j++){
                if( (i+j)% 2== 0 ){
                    System.out.print("1"+ " ");
                }else{
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n){
        for(int i = 1; i <= n;  i++){

            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            
            for(int j = 1; j <= 2*(n-i); j++){
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int i = n; i >= 1;  i--){

            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            
            for(int j = 1; j <= 2*(n-i); j++){
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solid_rhombus(int n){

        for(int i = 1; i<=n; i++){

            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollw_rhombus(int n){
        

        for(int i = 1; i<=n; i++){

            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            
            for(int j =1; j<=n; j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int n){

        for(int i=1; i<=n; i++){

            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }

            System.out.println();
        }
        
        for(int i=n; i>=1; i--){

            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void main (String args[]){
        hollw_rectangle(9,9);
        rotatade_half_pyramid(12);
        inveted_half_phramid_with_number(4);
        floyds_triangle(6);
        zero_one_traiangle(5);
        butterfly(4);
        solid_rhombus(7);
        hollw_rhombus(5);
        diamond(4);
     }
      
}
