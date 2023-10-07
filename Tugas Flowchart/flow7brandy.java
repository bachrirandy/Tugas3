public class flow7brandy {
    public static void main(String[] args) {

        int x = 7;
        String inihari = "";

        if (x == 1){
            inihari = konversiKeRomawi(x);
        }else if(x == 2){
            inihari = konversiKeRomawi(x);
        }else if(x == 3){
            inihari = konversiKeRomawi(x);
        }else if (x == 4){
            inihari = konversiKeRomawi(x);
        }else if (x == 5){
            inihari = konversiKeRomawi(x);
        }else if (x == 6){
            inihari = konversiKeRomawi(x);
        }else if (x == 7){
            inihari = konversiKeRomawi(x);
        }else{
            System.out.println("Input tidak valid");
        }
        System.out.println("Hari: " + inihari);
    }
    public static String konversiKeRomawi(int x) {
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        return hari [x - 1];
            }
        }
        

