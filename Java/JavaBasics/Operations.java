package JavaBasics;

public class Operations {
    public static void main(String[] args) {
        
        // arithmetic operations : 

        int a = 8;
        int b = 3;
       
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b)); // flushes out the neverending decimals
        System.out.println("a % b = " + (a % b));


        // unay operators

        int Ua = 10;
        int Ub = 10;
 
        // Using uniary operators
        System.out.println("Postincrement : " + (Ua++));
        System.out.println("Preincrement : " + (++Ua));
 
        System.out.println("Postdecrement : " + (Ub--));
        System.out.println("Predecrement : " + (--Ub));



        // assignment operators

        int f = 7;
        System.out.println("f += 3: " + (f += 3));
        System.out.println("f -= 2: " + (f -= 2));
        System.out.println("f *= 4: " + (f *= 4));
        System.out.println("f /= 3: " + (f /= 3));
        System.out.println("f %= 2: " + (f %= 2));

        // relationsal operators

        int ra = 10;
        int rb = 3;
        int rc = 5;
 
        System.out.println("a > b: " + (ra > rb));
        System.out.println("a < b: " + (ra < rb));
        System.out.println("a >= b: " + (ra >= rb));
        System.out.println("a <= b: " + (ra <= rb));
        System.out.println("a == c: " + (ra == rc));
        System.out.println("a != c: " + (ra != rc));

        // boolean 

        boolean x = true;
        boolean y = false;
       
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));


        

    }
}
