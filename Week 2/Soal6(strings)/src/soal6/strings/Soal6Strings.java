package soal6.strings;
import java.util.Scanner;

/**
 * @author Akmalf
 * @version 1.0
 * @since 2022-02-12
 */
public class Soal6Strings {
    public static void main(String[] args) {
      
    Scanner input = new Scanner(System.in);
    
    //deklarasi variable
    String kata1, kata2, hasil;
    int jmlstring;
    
    //input kata
    kata1 = input.next();
    kata2 = input.next();
       
    jmlstring = kata1.length() + kata2.length();
        System.out.println(jmlstring);
    
    if(kata1.compareTo(kata2) > 0){
        System.out.println("Yes");
    }else if(kata2.compareTo(kata1)>0){
        System.out.println("No");
    }else{
        System.out.println("Are Equals");
    }
    hasil = kata1.substring(0,1).toUpperCase()+ kata1.substring(1)+" " + kata2.substring(0,1).toUpperCase()+kata2.substring(1);
        System.out.println(hasil);
    }
    
}




















