package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int vector[] = {1,1,1,2,4,2,5,6,7,4,1,5,2,4,6,7,8,2,5,8,34,8};
        Map<Integer,Integer> histogram = new HashMap();
        for(int key : vector){
            if(histogram.containsKey(key)){
                histogram.put(key, histogram.get(key)+1);
            }else{
                histogram.put(key,1);
            }
        }
        
        for(int key : histogram.keySet()){
            System.out.println(key + " --> " + histogram.get(key));
        }
    }
}
