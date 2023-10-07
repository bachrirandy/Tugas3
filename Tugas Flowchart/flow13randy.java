import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class flow13randy {

    public static void main(String[] args) throws ParseException {
        
        String kotaKeberangkatan = "Ambon";
        String kotaTujuan = "Perth";    
        String namaPenumpang = "Randy";
        String tanggalLahirStr = "17-05-2023";
        String tanggalKeberangkatanStr = "17-11-2023";
        double hargaTiketNormal = 2000000;
        
        // Parsing tanggal lahir dan tanggal keberangkatan ke dalam objek Date
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date tanggalLahir = dateFormat.parse(tanggalLahirStr);
        Date tanggalKeberangkatan = dateFormat.parse(tanggalKeberangkatanStr);
        
        // Menghitung usia penumpang berdasarkan tanggal lahir dan tanggal keberangkatan
        long selisihHari = (tanggalKeberangkatan.getTime() - tanggalLahir.getTime()) / (24 * 60 * 60 * 1000);
        int usiaTahun = (int) (selisihHari / 365);
        
        // Harga Tiket Anak-anak
        double hargaTiketDiskon = hargaTiketNormal;
        if (usiaTahun <= 12) {
            hargaTiketDiskon = hargaTiketNormal * 0.75; // Diskon 25%
        }
        
        // Hasil
        System.out.println("Detail Pemesanan Tiket:");
        System.out.println("Nama Penumpang: " + namaPenumpang);
        System.out.println("Kota Keberangkatan: " + kotaKeberangkatan);
        System.out.println("Kota Tujuan: " + kotaTujuan);
        System.out.println("Usia Penumpang: " + usiaTahun + " tahun");
        System.out.println("Harga Tiket Normal: Rp " + hargaTiketNormal);
        System.out.println("Harga Tiket dengan Diskon: Rp " + hargaTiketDiskon);
        
       
    }
}


