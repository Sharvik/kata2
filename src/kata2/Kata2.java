package kata2;

import java.util.HashMap;

public class Kata2 {

    public static void main(String[] args) {
        //Integer[] vector = {1,1,1,2,4,2,5,6,7,4,1,5,2,4,6,7,8,2,5,8,34,8};
        Double[] vector = 
        {1.1,1.2,1.1,2.3,4.1,2.4,5.2,6.4,7.4,4.4,1.1,5.4,2.2,4.4,6.4,7.3,8.4,2.3,5.0,8.1,34.0,8.0};
        
        Histogram histo = new Histogram(vector);
        
        HashMap<Double,Integer> histogram = histo.getHistogram();
        
        for(double key : histogram.keySet()){
            System.out.println(key + " --> " + histogram.get(key));
        }
    }
}
