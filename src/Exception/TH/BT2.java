package Exception.TH;

import java.io.*;

class GFG1 {
    //        public static void main(String[] args) {
//            String ptr = null;
//
//            if (ptr.equals("gfg"))
//                System.out.print("Same");
//            else
//                System.out.print("Not Same");
//        }

//        public static void main(String[] args) {
//            // Initializing String variable with null value
//            String ptr = null;
//
//            // Checking if ptr.equals null or works fine.
//            try {
//                // This line of code throws NullPointerException
//                // because ptr is null
//                if (ptr.equals("gfg"))
//                    System.out.print("Same");
//                else
//                    System.out.print("Not Same");
//            } catch (NullPointerException e) {
//                System.out.print("NullPointerException Caught");
//            }
//        }
//    }


    public static void main(String[] args) {
        // Initializing String variable with null value
        String ptr = null;

        // Checking if ptr is null using try catch.
        try {
            if ("gfg".equals(ptr))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        } catch (NullPointerException e) {
            System.out.print("Caught NullPointerException");
        }
    }
}

