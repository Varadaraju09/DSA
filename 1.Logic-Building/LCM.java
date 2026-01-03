public class LCM 
{
    static int lcm(int a,int b) 
    {
        int max = Math.max(a,b);

        int min = Math.min(a,b);

        for(int i = max; i<= a*b; i += max) {
            if(i % min == 0) {
                return i;
            }
        }
         return a * b;
    }
    public static void main(String[] args) 
    {
        int a = 10, b = 5;
        System.out.println(lcm(a,b));
    }
}
