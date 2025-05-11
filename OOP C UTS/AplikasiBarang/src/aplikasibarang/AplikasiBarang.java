package aplikasibarang;
import java.util.Scanner;
/**
 *
 * @author Yulita Lendriana Dalian
 * TGL 11 Mei 2025
 */
public class AplikasiBarang {
    static Scanner scanner = new Scanner(System.in);
    static Barang[] daftarBarang = new Barang[100];
    static int jumlahBarang = 0;

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\nMenu Aplikasi Data Barang:");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Tampilkan Data Barang");
            System.out.println("3. Ubah Data Barang");
            System.out.println("4. Hapus Data Barang");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    tambahBarang();
                    break;
                case 2:
                    tampilBarang();
                    break;
                case 3:
                    ubahBarang();
                    break;
                case 4:
                    hapusBarang();
                    break;
                case 5:
                    System.out.println("Keluar dari aplikasi...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }

    public static void tambahBarang() {
        System.out.print("Masukkan ID Barang: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Masukkan Nama Barang: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Stok Barang: ");
        int stok = scanner.nextInt();

        daftarBarang[jumlahBarang] = new Barang(id, nama, stok);
        jumlahBarang++;
        System.out.println("Data barang berhasil ditambahkan.");
    }

    public static void tampilBarang() {
        if (jumlahBarang == 0) {
            System.out.println("Belum ada data barang.");
        } else {
            for (int i = 0; i < jumlahBarang; i++) {
                System.out.println(daftarBarang[i]);
            }
        }
    }

    public static void ubahBarang() {
        System.out.print("Masukkan ID barang yang ingin diubah: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < jumlahBarang; i++) {
            if (daftarBarang[i].getId() == id) {
                System.out.print("Masukkan Nama Barang Baru: ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan Stok Barang Baru: ");
                int stok = scanner.nextInt();
                daftarBarang[i].setNama(nama);
                daftarBarang[i].setStok(stok);
                System.out.println("Data barang berhasil diubah.");
                return;
            }
        }
        System.out.println("Barang dengan ID tersebut tidak ditemukan.");
    }

    public static void hapusBarang() {
        System.out.print("Masukkan ID barang yang ingin dihapus: ");
        int id = scanner.nextInt();

        for (int i = 0; i < jumlahBarang; i++) {
            if (daftarBarang[i].getId() == id) {
                for (int j = i; j < jumlahBarang - 1; j++) {
                    daftarBarang[j] = daftarBarang[j + 1];
                }
                jumlahBarang--;
                System.out.println("Data barang berhasil dihapus.");
                return;
            }
        }
        System.out.println("Barang dengan ID tersebut tidak ditemukan.");
    }
}
