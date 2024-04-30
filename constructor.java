public class Biodata {
    //buat field nama dan hoby
    String nama;
    String hoby;
 
    //kita buat constructor dengan parameter paramNama dan paramHoby
    Biodata(String paramNama, String paramHoby){
        nama = paramNama;
        hoby = paramHoby;
    }
 
    //kita buat method identitas, nanti akan digunakan di objek yang akan dibuat
    void identitas(){
        System.out.println("Halo " + nama + ", yang punya hoby " + hoby);
    }
}

public class BiodataApp {
    public static void main(String[] args) {
        //membuat objek bernama orang1, saat pertama kali dibuat yg dipanggil adalah constructor dari class Biodata
        var orang1 = new Biodata("Pauzan", "Elektronika");
 
        //buat objek orang2
        var orang2 = new Biodata("Aufa", "Menggambar");
 
        //terapkan method identitas pada objek orang1
        orang1.identitas();
 
        //terapkan method identitas pada objek orang2
        orang2.identitas();
    }
}