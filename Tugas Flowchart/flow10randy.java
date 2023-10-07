public class flow10randy {
    public static void main(String[] args) {
        
        int hariPertama = 1;
        int hariKedua = 5;

        String[] namaHari = {"Rabu","Kamis", "Jumat", "Sabtu", "Minggu", "Senin", "Selasa"};

        if (hariPertama >= 0 && hariPertama <= 6 && hariKedua >= 0 && hariKedua <= 6) {
            int durasi = (hariKedua - hariPertama + 7) % 7; 
            System.out.println("Durasi antara " + namaHari[hariPertama] + " dan " + namaHari[hariKedua] + " adalah " + durasi + " hari.");
        } else {
            System.out.println("Input tidak valid. Masukkan angka antara 0 dan 6.");
        }

    }
}
