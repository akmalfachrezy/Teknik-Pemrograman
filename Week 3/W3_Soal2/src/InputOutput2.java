
import java.util.Scanner;
/**
 * @author Cojr
 * @since 20/02/2022
 */
public class InputOutput2 {

    public static void main(String[] args) {
        //deklarasi variable
        int x;
        String kata;
        String[]S = new String[3];
        int[]Integer=new int[3];
        
        //membuat scanner
        Scanner scan=new Scanner(System.in);
            
            for(int i=0;i<3;i++){
                kata = scan.next();
                S[i] = kata;
                x = scan.nextInt();
                Integer[i] = x;
            }
            System.out.println("================================");
            for(int i=0;i<3;i++){
                System.out.printf("%-15s%03d%n",S[i],Integer[i]);
            }
            System.out.println("================================");
    }
}
    
     