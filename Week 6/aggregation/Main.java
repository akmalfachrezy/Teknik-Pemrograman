package aggregation;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mahasiswa = new Mahasiswa("211524035", "Akmal Faqih");
        Jurusan jurusan = new Jurusan ("Ilmu Kelautan");
        
        jurusan.setMahasiswa(mahasiswa);
        
        // output //
        System.out.println ("Nama Mahasiswa     : " + jurusan.getMahasiswa().getNama());
        System.out.println ("NIM Mahasiswa      : " + jurusan.getMahasiswa().getNim());
        System.out.println ("Jurusan            : " + jurusan.getNamaJurusan());
        System.out.println (jurusan.getMahasiswa().getNama() + " adalah mahasiswa "+ jurusan.getNamaJurusan() + " dengan NIM : " + jurusan.getMahasiswa().getNim());
    }
    
}