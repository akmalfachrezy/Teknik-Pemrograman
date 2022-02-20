/**
 * @author Akmal Faqih
 * @since 20/02/2022
 */
import java.util.Arrays;
import java.util.Scanner;
public class Bukatutupjalan {

    public static void main(String[] args) {
        //deklarasi varible
        int[] plat= new int[4];
        String x;
        long combine;
        //membuat Scanner
        Scanner scan = new Scanner(System.in);
        //perulangan untuk menginput plat
        for(int i =0; i<plat.length; i++){
            plat[i] = scan.nextInt();
        }
        //megubah array ke string
        x = Arrays.toString(plat).replaceAll("\\[|\\]|,|\\s", "");
        //mengubah strign ke long
        combine = Long.parseLong(x);
        
        //mengecek kondisi
        if((combine - 999999)% 5 ==0){
            System.out.println("berhenti");
        }else{
            System.out.println("jalan");
        }

    }
}
