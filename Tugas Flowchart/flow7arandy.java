public class flow7arandy {
    public static void main(String[] args) {
        
        int x = 7;
        String angkaRomawi = "";

        if (x == 1){
            angkaRomawi = konversiKeRomawi(x);
        }else if(x == 2){
            angkaRomawi = konversiKeRomawi(x);
        }else if(x == 3){
            angkaRomawi = konversiKeRomawi(x);
        }else if (x == 4){
            angkaRomawi = konversiKeRomawi(x);
        }else if (x == 5){
            angkaRomawi = konversiKeRomawi(x);
        }else if (x == 6){
            angkaRomawi = konversiKeRomawi(x);
        }else if (x == 7){
            angkaRomawi = konversiKeRomawi(x);
        }else if (x == 8){
            angkaRomawi = konversiKeRomawi(x);
        }else if (x == 9){
            angkaRomawi = konversiKeRomawi(x);
        }else if (x == 10){
            angkaRomawi = konversiKeRomawi(x);
        }else{
            System.out.println("Input tidak valid");
        }
        System.out.println("Angka Romawi: " + angkaRomawi);
    }
    public static String konversiKeRomawi(int x) {
        String[] romawi = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        return romawi[x - 1];
    }

}
