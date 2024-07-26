package JavaOOP;

// deklarasi class Produk
public class Produk {
    private int Nomor;
    private String Nama;
    private int Jumlah;
    private double Harga;

    // konstruktor tanpa parameter
    public Produk() {
        this.Nomor = 0;
        this.Nama = "";
        this.Jumlah = 0;
        this.Harga = 0;
    }

    // konstruktor dengan parameter
    public Produk(int nomor, String nama, int jumlah, double harga) {
        this.Nomor = nomor;
        this.Nama = nama;
        this.Jumlah = jumlah;
        this.Harga = harga;
    }

    // diberikan modifier public, karena method ini akan diakses dari luar class
    public int getNomor() {
        return Nomor;
    }

    public void setNomor(int nomor) {
        this.Nomor = nomor;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        this.Nama = nama;
    }

    public int getJumlah() {
        return Jumlah;
    }

    public void setJumlah(int jumlah) {
        this.Jumlah = jumlah;
    }

    public double getHarga() {
        return Harga;
    }

    public void setHarga(double harga) {
        this.Harga = harga;
    }
    
    // method untuk menampilkan produk
    public void tampilProduk() {
        System.out.println("Nomor: " + Nomor);
        System.out.println("Nama: " + Nama);
        System.out.println("Jumlah: " + Jumlah);
        System.out.println("Harga: RP " + Harga);
    }
}