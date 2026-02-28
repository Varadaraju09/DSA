public class E3 {
    public static void main(String[] args) {
        // Types
        int[] arr = { 1, 2, 3, 4, 5 }; // 10

        // 2D Array -> Array of Arrays - Matrix
        int[][] matrix = { { 1, 2, 3 }, // row 0
                { 4, 5, 6 }, // row 1
                { 4, 1, 2, } }; // row 2 [3 x 3] Square Matrix
        System.out.println(arr.length);
        System.out.println(matrix.length);

        // Jagged Array
        // In a 2D Array if the row length is not same
        int[][] Jagged = {
                { 1, 2, 3, 4, 5, 5 },
                { 1, 2, 4, 4 },
                { 1, 2 }
        };
        System.out.println("Jagged Arrays");
        System.out.println(Jagged[0].length);
        System.out.println(Jagged[1].length);
        System.out.println(Jagged[2].length);

        // arr.length = rows | array[row].length = cols
        for (int r = 0; r < Jagged.length; r++) {
            for (int c = 0; c < Jagged[r].length; c++) {
                System.out.print(Jagged[r][c] + " ");
            }
            System.out.println();
        }

        // for each
        System.out.println("For each: ");
        for(int[] a : Jagged) {
            for(int x : a) {
                System.out.print(x+" ");
            }
            System.out.println();
        }
        
        System.out.println("Character Array");
        char[][] names = {
            {'S','H','I','N','E'},
            {'V','A','R','A','D','A'},
            {'Y','O','U'}
        };
        for(char[] c : names) {
            for(char x : c) {
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
