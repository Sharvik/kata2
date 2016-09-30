package kata2;

public class CaculateHistogram {
    
    public static <T> Histogram <T> computeHistogram(T [] vector) {
        Histogram<T> histo = new Histogram<>();
        for(T key : vector) {
            histo.increment(key);
        }
        return histo;
    }
    
}
