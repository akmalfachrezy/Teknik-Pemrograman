package aggregation;

public class Mahasiswa{
    // state //
    private String nim;
    private String nama ;
    
    // constructor //
    public Mahasiswa (String Nama, String Nim){
        this.nim = Nama;
        this.nama = Nim;
    }
    
    public String getNim (){
        return nim;
    }
    public String getNama(){
        return nama;
    }
}