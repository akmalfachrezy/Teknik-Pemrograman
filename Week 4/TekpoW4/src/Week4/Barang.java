
package Week4;

/**
 * @author akmal faqih
 */
public class Barang {
    String kode_barang;
    String nama_barang;
    private int stok;
    
    public Barang(String kode, String nama, int stk) { 
    kode_barang = kode;
    nama_barang = nama; 
    stok = stk;
    }
    public void setPenjumlahan(int stk){
        stok += stk;
    }
    public int getPenjumlahan(){
        return stok;
    }
}    
