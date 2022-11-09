public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int m = 62, h = 170;
        int imt = service.calculate(m,h);
        System.out.println("Индекс массы тела" + imt);
    }
}
