package InnerClass.LocalInnerClass;

import InnerClass.NormalInnerClass.OuterClass;

public class Outer {

    private String x = "Outer 1";

    void doStuff(){
        //Local Variable
         String local = "Local Variable";
        class Inner{

            public void seeOuter(){
                System.out.println(x);
             /*
             Cannot access local variable
              */
            //    local = "changing";     //Compile Error
            }
        }
        /*A method-local inner class can be instantiated only within the
         method where the inner class is defined.

         */
        Inner in = new Inner();
        in.seeOuter();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.doStuff();

    }


}
