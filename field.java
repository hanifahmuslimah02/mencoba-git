public class Person {
    String nama; //ini field1, berupa nama
    String alamat; //ini field2 berupa alamat
    final String negara = "indonesia"; //ini field yang ketiga, kata kunci final dipakai karena negara tidak berubah
 
}

public class PersonApp {
    public static void main(String[] args) { //fungsi utama di class
 
        var person1 = new Person(); //kita buat objek bernama person1, semua atributnya diambil dari class Person
 
        person1.nama = "Pauzan"; //modifikasi field nama, untuk objek person1
        person1.alamat = "Indramayu"; //modifikasi field alamat, untuk objek person1
 
        //person1.negara = "Yaman"; ,, ERROR karena field negara tidak dapat dimodifikasi krn pakai kata kunci final
 
        System.out.println(person1.nama); 
        System.out.println(person1.alamat);
        System.out.println(person1.negara);
 
    }
}

