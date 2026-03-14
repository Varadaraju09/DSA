public class BufferExample {
    public void stringInsert() {
        System.out.println("----------String Insert ---------");
        StringBuffer buffer = new StringBuffer("JA");
        System.out.println("Old String : "+buffer);
        buffer.insert(1, "AV");
        System.out.println("New String : "+buffer);
    }
    public void stringAppend() {
        System.out.println("---------String Append--------");
        StringBuffer buffer = new StringBuffer("SNPSU");
        System.out.println("Old String : "+buffer);
        buffer.append(" ISE");
        System.out.println("New String : "+buffer);
    }
    public void stringReverse() {
        System.out.println("--------String Reverse--------- ");
        StringBuffer buffer = new StringBuffer("PYTHON");
        System.out.println("Old String : "+buffer);
        buffer.reverse();
        System.out.println("New String : "+buffer);
    }
    public static void main(String[] args) {
        // BufferExample OBJ = new BufferExample();
        // OBJ.stringInsert();
        // OBJ.stringAppend();
        // OBJ.stringReverse();

        new BufferExample().stringAppend();
        new BufferExample().stringInsert();
        new BufferExample().stringReverse();
    }
}
