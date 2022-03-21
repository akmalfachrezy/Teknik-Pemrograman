package composition;

public class Main {
    public static void main(String args[]){
        
        //instansiasi
        Dompet tas = new Dompet(new Uang(500000),new Kartu("Kartu Tanda Penduduk"));
        
        System.out.println("Isi Dompet : " + tas.getMoney().getJumlah()+" Rupiah dan "+tas.getjenis(). getjnskartu());
    }
}