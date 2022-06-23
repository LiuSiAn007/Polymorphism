package entity;

public class PrintTest {
    public static void main(String[] args) {
        Print colorPrint = new ColorPrint();
        colorPrint.print();

        System.out.println("---------------------------------------------");

        Print balckAndWhitePrint = new BalckAndWhitePrint();
        balckAndWhitePrint.print();
    }
}
