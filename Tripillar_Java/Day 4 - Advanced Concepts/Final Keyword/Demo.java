public final class Demo {
    
}

// class A extends Demo {
// A final class cannot be inherited
    
// }

class B {
    final void college() {
        System.out.println("SNPSU");
    }
}

class C extends B {
//     void college() {
//         // Cannot Override
//     }

    final int x = 200;
    // x = 100; // Not allowed , x is constant(final)

    void show(final int x) {
        // x = 20; //  Not Allowed 
    }
}