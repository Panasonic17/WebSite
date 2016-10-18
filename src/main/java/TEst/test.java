package TEst;

import java.util.ArrayList;

/**
 * Created by Саша on 17.10.2016.
 */
public class test {
    public static void main(String[] args) {
        ArrayList<Double> d=new ArrayList();
        add(d);
        System.out.println(d.get(0));
    }
    public static void add(ArrayList list){
        list.add("qwe");
    }
}
