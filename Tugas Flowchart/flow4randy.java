public class flow4randy {
    public static void main(String[] args) {
        
        int a, b, c;
        int x = 1;
        int y = 2;
        int z = 3;


        if (x >= y && x >= z) {
            c = x;
            b = y;
            a = z;
        } else if (y <= x && y <= z) {
            c = y;
            b = x;
            a = z;
        } else {
            c = z;
            b = x;
            a = y;
        }

        System.out.println();
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

        if (c * c == a * a + b * b) {
            System.out.println("Segitiga siku-siku");
        } else if (c * c > a * a + b * b) {
            System.out.println("Segitiga tumpul");
        } else {
            System.out.println("Segitiga lancip");
        }

        

    }
}
