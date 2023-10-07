public class flow8randy {
    public static void main(String[] args) {
        
        int hasilOperasi = 256;
        int hasil;

        if(hasilOperasi > 255){
            hasil = 255;
        }else if(hasilOperasi<0){
            hasil = 0;
        }else{
            hasil = hasilOperasi;
        }
        System.out.println(hasil);
    }
}
