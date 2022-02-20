/**
 * @author Akmal Faqih
 * @since 20/02/2022
 */
import java.util.Scanner;
public class BigNumber {

    public static void main(String[] args) {
       //deklarasi variable
       long x, y, result1, result2;
       Scanner scan = new Scanner(System.in);
       //input nilai ke dalam variable
       x = scan.nextLong();
       y = scan.nextLong();
       //nilai yang di input dimasukkan ke dalam variable result
       result1 = x + y;
       result2 = x * y;
       //mennampilkan hasil ke layar
       System.out.println(result1);
       System.out.println(result2);
    }
}
