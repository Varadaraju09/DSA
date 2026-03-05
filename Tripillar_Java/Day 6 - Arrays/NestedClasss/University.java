
public class University {
    static class Admission {
        static boolean isEligible(int marks) {
            return marks >= 60;
        }
        
    }
    public static void main(String[] args) {
        boolean result1 = University.Admission.isEligible(45);
        System.out.println(result1);
        boolean result2 = University.Admission.isEligible(63);
        System.out.println(result2);
    }
}

/*
ℹ️Points To Remember
✅ No University object needed
✅ Logical grouping of data - imporves readability
✅ Similar to creating utility - helper classes
*/ 