public class BmiService<height> {
    public long calculate(long height, long weight) {
        long index = weight / (height * height);
        return index;
    }
}
