package aggregation;

public class Jurusan {
    // state //
    private String namaJurusan;
    private Mahasiswa mahasiswa;
    
    // constructor //
    public Jurusan (String namaJurusan){
        this.namaJurusan = namaJurusan;
    }
    
    // getter setter //
    public void setMahasiswa (Mahasiswa mahasiswa){
        this.mahasiswa = mahasiswa;
    }
    
    public Mahasiswa getMahasiswa(){
        return mahasiswa;
    }
    
    public String getNamaJurusan(){
        return namaJurusan;
    }
}