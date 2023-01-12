import java.util.Random;

public class Infinity {
    public static void main(String[] args) {
        Random random = new Random();

        double sum = 0;
        double num = 0;
        double ran = 0;
        double avg = 0;
        double cnt = 0;
        while (true){
            ran = 1.0;
            while (true){
                if(random.nextDouble()<0.5){
                    ran++;
                }else {
                    break;
                }
            }
            cnt++;
            sum+=Math.pow(2,ran);
            num++;
            avg=sum/num;
            if(cnt%1000000.0==0){
                System.out.println(avg);
            }
        }
    }
}
