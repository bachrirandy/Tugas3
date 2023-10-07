public class flow9randy {
    public static void main(String[] args) {
        
        double beratBadan = 89;
        double tinggiBadan = 170;
        

        double ideal = (tinggiBadan-100)-((tinggiBadan-100)*0.1);

        if(beratBadan >= ideal - 2 && beratBadan <= ideal + 2) {
            System.out.println("Berat Badan Ideal");
        }else{
            System.out.println("Berat badan Tidak Ideal");
        }
    }
}
