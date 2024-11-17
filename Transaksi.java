// File: Transaksi.java
public class Transaksi extends Barang {
    private String noFaktur;
    private int jumlahBeli;
    private double total;

    // Constructor Transaksi
    public Transaksi(String noFaktur, String kodeBarang, String namaBarang, double hargaBarang, int jumlahBeli)
            throws IllegalArgumentException {
        super(kodeBarang, namaBarang, hargaBarang); // Memanggil constructor Barang
        if (jumlahBeli < 0) {
            throw new IllegalArgumentException("Jumlah beli tidak boleh negatif!");
        }
        this.noFaktur = noFaktur;
        this.jumlahBeli = jumlahBeli;
        this.total = calculateTotal();
    }

    // Metode untuk menghitung total harga
    private double calculateTotal() {
        return hargaBarang * jumlahBeli;
    }

    // Metode untuk menampilkan detail transaksi
    public void printDetail() {
        System.out.println("No Faktur    : " + noFaktur);
        System.out.println("Kode Barang  : " + kodeBarang);
        System.out.println("Nama Barang  : " + namaBarang);
        System.out.println("Harga Barang : " + hargaBarang);
        System.out.println("Jumlah Beli  : " + jumlahBeli);
        System.out.println("Total Harga  : " + total);
    }
}
