import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class flow11randy {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        String tanggalPertamaStr = "17-05-2004";
        String tanggalKeduaStr = "31-05-2004";

        Date tanggalPertama = dateFormat.parse(tanggalPertamaStr);
        Date tanggalKedua = dateFormat.parse(tanggalKeduaStr);

        long durasi = hitungDurasiHari(tanggalPertama, tanggalKedua);

        System.out.println("Durasi antara kedua tanggal tersebut adalah " + durasi + " hari.");

    }

    public static long hitungDurasiHari(Date tanggalPertama, Date tanggalKedua) {
        long selisih = tanggalKedua.getTime() - tanggalPertama.getTime();
        long durasi = selisih / (24 * 60 * 60 * 1000); 
        return Math.abs(durasi); 
    }
}
