public class DataMhs {
    //deklarasi field
    String nama;
    String kelamin;
 
    //buat constructor DataMhs tanpa parameter
    DataMhs(){
 
    }
 
    //buat constructor DataMhs dgn parameter paramNama
    DataMhs(String paramNama){
        nama = paramNama;
 
    }
 
    //buat method infoLengkap
    void infoLengkap(String alamat){
        System.out.println("Berikut adalah data mahasiswa:");
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
    }
}

public class DataMhsApp {
    public static void main(String[] args) {
        //buat objek mahasiswa1 dari constructor DataMhs()
        var mahasiswa1 = new DataMhs();
        //buat objek mahasiswa2 dari constructor DataMhs(String paramNama)
        var mahasiswa2 = new DataMhs("Pauzan");
 
        //menerapkan field nama di objek mahasiswa1
        mahasiswa1.nama = "Pauzan";
        System.out.println(mahasiswa1.nama);
 
        //menarpkan method infoLengkap ke objek mahasiswa2
        mahasiswa2.infoLengkap("Indramayu");
 
    }
}