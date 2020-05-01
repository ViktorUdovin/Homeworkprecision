public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        long height = 17;
        long weight = 5500;
        long index = service.calculate(height, weight);
        System.out.println(index);
    }
}
