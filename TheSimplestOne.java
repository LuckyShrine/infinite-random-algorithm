import java.util.Random;

public class TheSimplestOne {
    public static void main(String[] args) {
        double ran = 1.0;
        Random random = new Random();
        while (true){
            if(random.nextDouble()<0.5){
                ran++;
            }else {
                break;
            }
        }
        System.out.println(ran);
    }
}
