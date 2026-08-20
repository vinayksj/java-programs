public class autoMorphic {
    public static void main(String[] args) {

        int n = 76;
        int temp = n;
        int sq = n * n;

        while (n > 0) {
            if (n % 10 != sq % 10) {
                System.out.println("Not an Automorphic Number");
                return;
            }

            n = n / 10;
            sq = sq / 10;
        }

        System.out.println(temp + " is an Automorphic Number");
    }
}
