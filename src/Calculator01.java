public class Calculator01 {

        static Calculator01 calculator01= new Calculator01();// formula for instance to static
        static int a = 10; // declaration and initialization
        static double b = 25.768; // declaration and initialization
        static double ans; //declaration

        static void multiplication (int a, int b){ //with parameters
            ans = a * b;
            System.out.println("Multiplication of " + a + " and " + b + " is " + ans);
        }

        static void division (int a,double b ){ //with parameter
            ans = a / b;
            System.out.println("Division of " + a + " and " + b + " is " + ans);

        }

        void addition (){ // without parameter and with instance
            ans = a + b;
            System.out.println("Additions of " + a + " and " + b + " is " + ans);

        }

        void subtraction(){ //without parameter and with instance
            ans = a - b;
            System.out.println("Subtraction of " + a + " and " + b + " is " + ans);

        }
        public static void main (String[] args){
            multiplication(25,32);
            division(45,56.56);
            calculator01.addition();
            calculator01.subtraction();

        }
}
