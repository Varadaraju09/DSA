public class Nth_term_of_AP {
    public static int nthTermOfAp(int a1,int a2,int n) {
        int nthTerm = a1 ;
        int d1 = a2 - a1;
        for (int i = 1; i < n; i++) {
            nthTerm += d1;
        }
        return nthTerm;
    }
    public static void main(String[] args) {
        int a1 = 1;
        int a2 = 3;
        int n = 10;
        System.out.println(nthTermOfAp(a1,a2,n));
    }
}
