public class Printer<T> {

    T data;
    Printer(T data) {
        this.data = data;
    }

    void pritnValue() {
        System.out.println("Data: "+data);
    }
    public static void main(String[] args) {
        Printer<String> str = new Printer<>("Java");
        Printer<Integer> integer = new Printer<>(2);
        Printer<Boolean> bool = new Printer<>(true);
        Printer<Float> floatPrinter = new Printer<>(1.2f);
        Printer<Double> doublePrinter = new Printer<>(0.2);

        integer.pritnValue();
        str.pritnValue();
        bool.pritnValue();
        floatPrinter.pritnValue();
        doublePrinter.pritnValue();
    }
}
