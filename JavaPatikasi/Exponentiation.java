public class Exponentiation {
    public static void main(String[] args) {
        System.out.println(pow(5,3));
    }

    static int pow(int base, int power) {
        if (power == 0) {
            return 1;
        }else {
            return base * pow(base,power - 1);
        }
    }
}