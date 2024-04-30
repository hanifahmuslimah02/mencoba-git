public class Biodata {
    //buat field nama dan hoby
    String nama;
    String hoby;
 
    //kita buat constructor dengan parameter nama hoby
    Biodata(String nama, String hoby){
        this.nama = nama; //this.nama mengacu pada field, sedangkan sebelah kanan sama dengan(=), yaitu nama mengacu ke parameter
        this.hoby = hoby; //this.hoby mengacu pada field, sedangkan sebelah kanan sama dengan(=), yaitu hoby mengacu ke parameter
    }
}