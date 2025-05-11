package aplikasibarang;

/**
 *
 * @author Yulita Lendriana Dalian
 * TGL 11 Mei 2025
 */
public class Barang {
    private int id;
    private String nama;
    private int stok;

    public Barang() {
        this.id = 0;
        this.nama = "";
        this.stok = 0;
    }

    public Barang(int id, String nama, int stok) {
        this.id = id;
        this.nama = nama;
        this.stok = stok;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nama: " + nama + ", Stok: " + stok;
    }
}

    


