package TEst;

/**
 * Created by Саша on 10.10.2016.
 */
public class goPARA {
    public static void main(String[] args) {
        int goPAra=0;
        int goHome=0;
        for (int i = 0; i <10000000 ; i++) {
            int q=(int)(Math.random()*100);
            if(q%2==0) goPAra++;
            else
                goHome++;
        }
        System.out.println(goHome+" "+goPAra);
    }
}
