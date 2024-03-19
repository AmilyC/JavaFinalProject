import javax.lang.model.util.ElementScanner6;

public class chooseend {
    public static int a = 0;
    public static int b = 0;

    public static int getend(Integer str) {
        a = str;
        if (a < 3000) {
            b = 1;
        } else if (a >= 3000 && a < 6000) {
            b = 2;
        } else if (a >= 6000 && a < 9000) {
            b = 3;
        } else if (a >= 9000 && a < 13000) {
            b = 4;
        } else if (a >= 13000) {
            b = 5;
        }
        System.out.println("b=" + b);
        return b;
    }
}
