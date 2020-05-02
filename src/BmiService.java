public class BmiService {
    public long calculate(long height, long weight) {
        long index = weight / (height * height);
        return index;
    }
}
