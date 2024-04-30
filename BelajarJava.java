class Kendaraan {
    public String tipe;

    public void maju() {
        System.out.println("Whoooosh");
    }
}

class Mobil extends Kendaraan {
    public String model;
    public String platNomor;
    public int harga;

    Mobil() {
        model = "Pajero";
        platNomor = "B 1234 DEF";
        harga = 6000000;
    }

    Mobil(String model, String platNomor, int harga) {
        this.model = model;
        this.platNomor = platNomor;
        this.harga = harga;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void informasi() {
        System.out.println("Model: " + model);
        System.out.println("Plat: " + platNomor);
        System.out.println("Harga: Rp" + harga);
    }

    public void maju() {
        System.out.println("Broom broom whoooooosh!");
    }

}

public class BelajarJava {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Lamborghini", "D 1234 DEF", 6000000);
        mobil.tipe = "Darat";
        mobil.informasi();
        mobil.maju();
    }
}