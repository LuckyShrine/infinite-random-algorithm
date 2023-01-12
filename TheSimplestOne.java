import java.util.Random;

public class TheSimplestOne {
    public static void main(String[] args) {
        int luckNum = 1;
        Random random = new Random();
        while (true){
            if(random.nextDouble()<0.5){
                luckNum++;
            }else {
                break;
            }
        }
        System.out.println(luckNum);
    }
}
