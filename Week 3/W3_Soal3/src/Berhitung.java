/**
 * @author Akmal Faqih
 * @since 20/02/2022
 */
import java.util.Scanner;
public class Berhitung {

    public static void main(String[] args) {
      //deklarasi variable
      int A,B,result;
      char operator;
      
      Scanner scan=new Scanner(System.in); 
      //input user
      A = scan.nextInt();                    
      operator = scan.next().charAt(0);      
      B = scan.nextInt();                     
      //selection, mengecek kondisi
      if((A>=1 && A<=1000)&&(B>=1 && B<=1000)){ 
          if(operator== '+'){                   
              result=A+B;
              System.out.println(result);
          }
          else if(operator=='-'){              
              result=A-B;
              System.out.println(result);
          }
          else if(operator=='*'){              
              result=A*B;
              System.out.println(result);
          }
          else if(operator=='/'){              
              result=A/B;
              System.out.println(result);
          }
          else if(operator=='%'){              
              result=A%B;
              System.out.println(result);
          }
          else{
             System.out.println("Operator Salah"); 
          }
    }
      else{
          System.out.println("Input salah");
      }
    }
}