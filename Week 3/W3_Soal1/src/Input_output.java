
import java.util.Scanner;
/**
 * @author Cojr
 * @since 20/02/2022
 */
public class Input_output {
    public static void main(String[] args){
        int jmlhTokens = 0;
        Scanner scan = new Scanner(System.in);
         
        String kata = scan.nextLine();             //input kalimat  
        String[] tokens = kata.split("[ !,?.'@]"); //memisahkan string menggunakan split()
        
        for (int i=0; i<tokens.length; ++i) 
            if (tokens[i].length() > 0) 
                jmlhTokens++;
             
        System.out.println(jmlhTokens);  
         
        for (int i=0; i<tokens.length;++i)   
            if (tokens[i].length() > 0)
                System.out.println(tokens[i]);
    }
}