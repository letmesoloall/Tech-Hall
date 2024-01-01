package JavaBasics;

public class datatypes {
    public static void main(String[] args) {

        // -------------- Primitive data types -------------------------- //

        // int - 4 bytes (32 Bits)

        int IntVar = 3;
        System.out.print(IntVar);

        // short - 2 byte (16 bits)

        short shvar = 2;
        System.out.print(shvar);

        // long - 8 bytes (64 bits)

        long lngvar = 34;
        System.out.print(lngvar);

        // byte - 1 byte (8bits)

        byte bytvar = 12;
        System.out.print(bytvar);

        //Float - 4bytes (8 bits)
        
        float FlVar = 2.0f;
        System.out.print(FlVar);

        // double - 8bytes (64 bits)
        double dobvar = 3.4;
        System.out.print(dobvar);


        // ----------------------Non - primitive----------------------------------

        /*
         * strings 
         * 
         * two ways to create string
         * 
         *  - string literal :
         *      String str = "hello world"
         * 
         *  - new operator
         *      String str = new string("Hello world") // for seperate memory reference 
         * 
         */

         String str_1 = "Hello World";
         String str_2 = "Hello World";

         String str_3 = new String("Hello World");

         System.out.println(str_1 == str_2); // true (same memory reference)

         System.out.println(str_1 == str_3); // false (different memory reference)

         System.out.println("line 1" + str_1.equals(str_3));

         System.out.println(str_2);


         // array

         int arr[] = new int[3];
         arr[0] = 1;
         arr[1] = 2;
         arr[2] = 3;

         System.out.println(arr[2]);

         // mulitdimensional array

         int Marr[][] = new int[3][3];

         Marr[2][2] = 4;




    }
}
