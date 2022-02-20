/**
 * @author Akmal Faqih
 * @since 20/02/2022
 */
import java.util.Scanner;

public class Gajiagent {
    public static void main(String[] args) {
       //deklarasi variable
        int agent;
        int item,result,x;
        int gaji = 500000;
        int harga = 50000;
        
    Scanner scan = new Scanner(System.in);
    //input user
    item = scan.nextInt();
    
    //selection untuk menentukan besaran gaji
    if(item>80){                            //item diatas 80
        agent =(int) (harga * item * 0.35); //bonus total penjualan
        result = agent + gaji;              //total gaji + bonus
    }
    else if(item>=40){                      //item diatas 40
        agent =(int) (harga * item * 0.25); //bonus total penjualan
        result = agent + gaji;              //total gaji + bonus
    }
    else if(item<15){                       //item dibawah 15
        x = 15 - item;                      //total minus penjualan
        agent = (int)(0.15 * harga *x);     //total denda pemotongan gaji
        result = (int) (gaji - agent);      //total gaji keseluruhan
        
    }else{                                  //item selain di atas
        agent = (int)(harga * 0.10);        //total bonus per item
        result = agent * item + gaji;       //total gaji keseluruhan
    }
        System.out.println(result);
    }
    
}
