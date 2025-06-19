public class Main2 {

    public static void main(String[] args) {
        CalcService service = new CalcService();
        int x = 5;
        int y = 7;
        int myMax = service.max(x,y);
        System.out.println(myMax);
    }
}
