public class Main3 {
    public static void main(String[] args) {
        CalcService service = new CalcService();

        System.out.println();
        System.out.println("5 / 6");
        System.out.println(service.max(5,6));

        System.out.println();
        System.out.println("10 / 10");
        System.out.println(service.max(10,10));

        System.out.println();
        System.out.println(" -10 / -20");
        System.out.println(service.max(-10,-20));
    }
}
