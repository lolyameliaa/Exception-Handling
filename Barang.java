// File: Barang.java
public class Barang {
    protected String kodeBarang;
    protected String namaBarang;
    protected double hargaBarang;

    // Constructor Barang
    public Barang(String kodeBarang, String namaBarang, double hargaBarang) throws IllegalArgumentException {
        if (hargaBarang < 0) {
            throw new IllegalArgumentException("Harga barang tidak boleh negatif!");
        }
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
    }
}