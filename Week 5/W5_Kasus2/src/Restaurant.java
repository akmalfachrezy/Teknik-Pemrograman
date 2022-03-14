/**
 *
 * @author Akmal Faqih
 */
public class Restaurant {
    private String[] nama_makanan;
    private double[] harga_makanan;
    private int[] stok;
    private static byte id=0;
    
    public Restaurant(){
        nama_makanan=new String[10];
        harga_makanan=new double[10];
        stok=new int[10];
    }
    
    public void tambahMenuMakanan(String nama,double harga,int stok){
        this.nama_makanan[id]=nama;
        this.harga_makanan[id]=harga;
        this.stok[id]=stok;
    }
    
    public void tampilMenuMakanan(){
        for (int i=0;i<=id;i++){
            if(!isOutOfStock(i)){
                System.out.println(nama_makanan[i]+"["+stok[i]+"]"+"\tRp. "+harga_makanan[i]);
            }
        }
    }
    
    public boolean isOutOfStock(int id){
        if(stok[id] == 0){
            return true;
        }
        else{
            return false;
        }
}
    public static void nextId(){
        id++;
    }
    
    public void pembelian(String nama, int jml) {
        for(int i=0; i<=id; i++) {
            if(nama_makanan[i].equalsIgnoreCase(nama)) {
                if(! isOutOfStock(i) && jml <= stok[i]) {
                    stok[i] = stok[i] - jml;
                    System.out.println(nama_makanan[i]+"(x"+jml+")\tRp. "+harga_makanan[i]*jml);
                }else {
                System.out.println(nama_makanan[i]+" \t\t Out of stock");
    }
   }
  }
 }
}


