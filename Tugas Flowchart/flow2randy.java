public class flow2randy {
    public static void main(String[] args) {
        

        int totalBelanja = 300000;
        double diskon = 0.0;

        if (totalBelanja > 100000) {
            diskon = totalBelanja * 0.50;
        }else{
            diskon = 0.0;
        }
            double nilaiBelanjaSetelahDiskon = totalBelanja - diskon;

        System.out.println("Diskon: RP " + diskon);
        System.out.println("Nilai Belanja Setelah Diskon: RP " + nilaiBelanjaSetelahDiskon);
    }
}


