public class Person {
    //deklarasi method di class Person
    void ucapHalo(String namaOrang){
        System.out.println("Halo " + namaOrang + ", Selamat Datang di blog pauzan.com");
    }
}

public class PersonApp {
    public static void main(String[] args) { //fungsi utama di class
 
        var person1 = new Person(); //kita buat objek bernama person1, semua atributnya diambil dari class Person
 
        Person person2 = new Person(); //buat objek person2, semua atributnya diambil dari class Person
 
        person1.ucapHalo("Aufa");
        person2.ucapHalo("Hasan");
 
    }
}