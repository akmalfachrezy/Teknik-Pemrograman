package association;

public class main {

    public static void main(String[] args) {
        // TODO code application logic here
        Basket basket = new Basket ("Basket Lakers");
        
        // inisialisasi nama pegawai //
        Pemain e1 = new Pemain ("Akmal");
        Pemain e2 = new Pemain ("Sultan");
        Pemain e3 = new Pemain ("Gian");
        Pemain e4 = new Pemain ("Raka");
        
        // tampil //
        System.out.println(e1.getNamePemain() + " adalah Pemain Club " + basket.getBasketName());
        System.out.println(e2.getNamePemain() + " adalah Pemain Club " + basket.getBasketName());
        System.out.println(e3.getNamePemain() + " adalah Pemain Club " + basket.getBasketName());
        System.out.println(e4.getNamePemain() + " adalah Pemain Club " + basket.getBasketName());
    }
    
}
