public class Pair {
    private int a = 0;
    private int b = 0;
    private String sign;

    public Pair(int a, int b, String sign) {
        this.a = a;
        this.b = b;
        this.sign = sign;
    }

    public String toString() {
        String a = "", b = "";
        if (this.a != 0) {
            a = String.valueOf(this.a);
        }

        if (this.b != 0) {
            b = String.valueOf(this.b);
        }

        return a + " " + b + " " + sign;
    }
}
