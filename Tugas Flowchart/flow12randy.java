public class flow12randy {
    public static void main(String[] args) {
        
        int umur = 19;

        if (umur >= 0 && umur <= 5) {
            System.out.println("Balita");
        } else if (umur > 5 && umur <= 12) {
            System.out.println("Anak-anak");
        } else if (umur > 12 && umur <= 20) {
            System.out.println("Remaja");
        } else if (umur > 20 && umur <= 60) {
            System.out.println(" Dewasa");
        } else if (umur > 60) {
            System.out.println("Tua");
        } else {
            System.out.println("Umur tidak valid.");
        }
    }
}
