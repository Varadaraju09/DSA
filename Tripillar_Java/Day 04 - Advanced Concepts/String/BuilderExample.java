public class BuilderExample {
    public void stringInsert() {
        System.out.println("----------String Insert ---------");
        StringBuilder builder = new StringBuilder("JA");
        System.out.println("Old String : "+builder);
        builder.insert(1, "AV");
        System.out.println("New String : "+builder);
    }
    public void stringAppend() {
        System.out.println("---------String Append--------");
        StringBuilder builder = new StringBuilder("SNPSU");
        System.out.println("Old String : "+builder);
        builder.append(" ISE");
        System.out.println("New String : "+builder);
    }
    public void stringReverse() {
        System.out.println("--------String Reverse--------- ");
        StringBuilder builder = new StringBuilder("PYTHON");
        System.out.println("Old String : "+builder);
        builder.reverse();
        System.out.println("New String : "+builder);
    }
    public static void main(String[] args) {
        // BufferExample OBJ = new BufferExample();
        // OBJ.stringInsert();
        // OBJ.stringAppend();
        // OBJ.stringReverse();

        new BuilderExample().stringAppend();
        new BuilderExample().stringInsert();
        new BufferExample().stringReverse();
    }
}
