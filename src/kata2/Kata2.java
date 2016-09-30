package kata2;

public class Kata2 {

    public static void main(String[] args) {
        //Integer[] vector = {1,1,1,2,4,2,5,6,7,4,1,5,2,4,6,7,8,2,5,8,34,8};
        //Double[] vector = {1.1,1.2,1.1,2.3,4.1,2.4,5.2,6.4,7.4,4.4,1.1,5.4};
        String[] vector = {"Ana", "Elena", "Pedro", "Juan", "Elena", "Pedro", "Ana", "Ana"};
        
        Histogram<String> histogram = CaculateHistogram.computeHistogram(vector);

        for(Object key : histogram.keySet()) {
            System.out.println(key + " --> " + histogram.get(key));
        }
    }
}
