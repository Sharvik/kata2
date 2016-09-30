package kata2;

import java.util.HashMap;

public class Kata2 {

    public static void main(String[] args) {
        int[] vector = {1,1,1,2,4,2,5,6,7,4,1,5,2,4,6,7,8,2,5,8,34,8};
        
        Histogram histo = new Histogram(vector);
        
        HashMap<Integer,Integer> histogram = histo.getHistogram();
        
        for(int key : histogram.keySet()){
            System.out.println(key + " --> " + histogram.get(key));
        }
    }
}
