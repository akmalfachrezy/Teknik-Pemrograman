package datatypes;
import java.util.*;
/**
 *@author Akmalf
 * @version 1.0
 * @since 2022-02-09
 */
public class Datatypes{
     public static void main(String []argh) {
         //kamusdata
          int totalInput;
          
          Scanner scan = new Scanner(System.in);
         
          totalInput=scan.nextInt();
          String[]angka = new String[totalInput];
          
          //input sebanyak totalInput
          for(int i=0;i<totalInput;i++){
              angka[i]= scan.next();
              }
          for(int i=0;i<totalInput;i++) {
               try {
                    long x=Long.parseLong(angka[i]);
                    System.out.println(x+" can be fitted in:");
                    if(x>=-9223372036854775808L &&x<=9223372036854775807L){
                        System.out.println("*long");
                             if(x>=-2147483648 && x<=2147483647){
                                System.out.println("*int");
                                  if(x>=-32768 && x<=32767){
                                    System.out.println("*short");
                                }
                            }
                    }                 
                   
               }catch(Exception e) {
                    System.out.println(angka[i]+" can’t be fitted anywhere.");
               }
          }
     }
}









