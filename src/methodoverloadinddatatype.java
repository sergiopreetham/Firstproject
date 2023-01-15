//Method overloading data type
       public class methodoverloadinddatatype {
         static   int add(int a, int b) {
            return a+b;
        }

        static double add(double a,double b)
        {
           return a+b;
        }

         static char add(char a, char b)
         {
          return (a>b)?a:b;
        }



        public static void main(String[] args) {

            System.out.println("the int + is :"+add(5,6) );
            System.out.println("the double value is :" + add(4.5,5));

            System.out.println("the char value is : " +(add('m','n')));


        }
}

