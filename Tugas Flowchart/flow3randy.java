public class flow3randy {
    public static void main(String[] args) {
        
        int a = 4;
        int b = 2;
        int c = 1;

        int terkecil, tengah, terbesar;

        if (a <= b && a <= c) {
            terkecil = a;
            if (b <= c) {
                tengah = b;
                terbesar = c;
            } else {
                tengah = c;
                terbesar = b;
            }
        } else if (b <= a && b <= c) {
            terkecil = b;
            if (a <= c) {
                tengah = a;
                terbesar = c;
            } else {
                tengah = c;
                terbesar = a;
            }
        } else {
            terkecil = c;
            if (a <= b) {
                tengah = a;
                terbesar = b;
            } else {
                tengah = b;
                terbesar = a;
            }
        }

        // Menampilkan hasil pengurutan
        System.out.println("Bilangan terkecil: " + terkecil);
        System.out.println("Bilangan tengah: " + tengah);
        System.out.println("Bilangan terbesar: " + terbesar);   
        }
}
