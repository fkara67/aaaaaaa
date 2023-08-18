public class Test {

    public static void main(String[] args) {
        Fighter marc = new Fighter("A1" , 50 , 100, 90, 0);
        Fighter alex = new Fighter("B2" , 50 , 100, 100, 0);
        Match r = new Match(marc,alex , 90 , 100);
        r.run();
    }
}