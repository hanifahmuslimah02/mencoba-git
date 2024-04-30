class Manager {
 
    String nama;
 
    void sayHello(String nama){
        System.out.println("Hi "+ nama + ", nama saya Manager "+ this.nama);
    }
}

class Karyawan extends Manager{
    void sayHello(String nama){
 
        /*method overriding, krn membuat method yang sama dengan yang ada
        di class parent, tapi kita tandai dengan mengganti kata manager (di class parent)
        dengan karyawan (di class child)
         */
        System.out.println("Hi "+ nama + ", nama saya karyawan "+ this.nama);
    }
}

public class ManagerApp {
    public static void main(String[] args) {
 
        var manager = new Manager(); //membuat objek bernama manager
        manager.nama = "Pauzan"; //memanggil field nama, diterapkan ke objek manager
        manager.sayHello("Aufa"); //memanggil method sayHello, ditujukan ke Aufa
 
        //membuat objek dari class child Karyawan
        var karyawan = new Karyawan();
        karyawan.nama= "Adi"; //menggunakan field yang ada di parent class
 
        //method overriding
        karyawan.sayHello("Budi"); //menggunakan method yang ada di class child
    }
}