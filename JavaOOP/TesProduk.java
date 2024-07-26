package JavaOOP;

public class TesProduk {
    public static void main(String[] args) {
        // 2 produk menggunakan default konstruktor
        Produk produk1 = new Produk();
        Produk produk2 = new Produk();

        produk1.setNomor(1);
        produk1.setNama("Buku");
        produk1.setJumlah(10);
        produk1.setHarga(5000);
        
        produk2.setNomor(2);
        produk2.setNama("Spidol");
        produk2.setJumlah(30);
        produk2.setHarga(5000);


        // 4 produk menggunakan Konstruktor dengan Parameter.
        Produk produk3 = new Produk(3, "Meja", 10, 10000);
        Produk produk4 = new Produk(4, "Pensil", 20, 2000);
        Produk produk5 = new Produk(5, "Penggaris", 15, 3000);
        Produk produk6 = new Produk(6, "Bolpen", 30, 7000);
        
        // menampilkan produk
        produk1.tampilProduk();
        System.out.println();
        produk2.tampilProduk();
        System.out.println();
        produk3.tampilProduk();
        System.out.println();
        produk4.tampilProduk();
        System.out.println();
        produk5.tampilProduk();
        System.out.println();
        produk6.tampilProduk();
    }
}
