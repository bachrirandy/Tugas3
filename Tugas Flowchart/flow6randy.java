public class flow6randy {
    public static void main(String[] args) {
        
        int nilaibelanja = 100890;
        int pecahanterkecil = 25;
        int nilai;

        int mod = nilaibelanja % pecahanterkecil;

        if(mod <= pecahanterkecil/2){
            nilai = nilaibelanja - mod;
        }else{
            nilai = nilaibelanja + (pecahanterkecil-mod);
        }
        System.out.println(nilai);
    }
    
}
