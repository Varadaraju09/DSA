public class BufferBuilderPerformance {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer("Java");
        for (int i = 0; i < 10000; i++) {
            buffer.append(" DSA");
        }

        System.out.println("Buffer Time :"+(System.currentTimeMillis() - startTime) +" ms");

        startTime = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            builder.append(" DSA");   
        }
        System.out.println("Builder Time :"+(System.currentTimeMillis() - startTime) +" ms");
    }
}
