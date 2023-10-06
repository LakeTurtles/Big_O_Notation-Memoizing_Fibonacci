package org.example;

public class BigO {


    public void foo(int[] array) {
//          linear time
//           O(2n) -> O(n)
        for (int i = 0; i < array.length; i++) {
            // ...
        }

        for (int i = 0; i < array.length; i++) {
            // ...
        }

    }

    public void bar(int[] array1, int[] array2) {

//        O(n * m)
//       it is not quadratic because they are different arrays
        for (int i = 0; i < array1.length; i++) {
            // ...
            for (int j = 0; j < array2.length; j++) {
                // ...
            }
        }

    }

    public void baz(int[] array) {
//        Running thru the same array
//         Quadratic O(n^2)
        //       or since the second part is linear it can be called
        //       semi Quadratic :  O(n * m)

        for (int i = 0; i < array.length; i++) {
            // ...
            for (int j = 0; j < array.length; j++) {
                // ...


                if (array[i] < array[j]) {
                    // Launch!
                }
            }
        }

    }

    public void beep(int[] array) {

//        The first part is O(n^2)
//        the last part is constant O(1) because of the loop
//        so it can be called semi Quadratic O (n *m)

        for (int i = 0; i < array.length; i++) {
            // ...
            for (int j = 0; j < array.length; j++) {
                // ...
                for (int k = 0; k < 9999999; k++) {
                    // Jump!
                }
            }
        }

    }

}