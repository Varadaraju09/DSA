public class IsSparseMatrix {
    public static void main(String[] args) {
        int[][] arr = { { 1, 0, 1, 0 },
                { 0, 0, 0, 1 },
                { 1, 1, 0, 0 } };
        int count = 0;
        ;

        int size = arr.length * arr[0].length;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    count++;
                }
            }
        }
        System.out.println("Size: " + size);
        System.out.println("Zero Count: " + count);
        if (count > (size / 2)) {
            System.out.println("IsSparse : True");
        } else {
            System.out.println("IsSparse : False");

        }
    }
}
