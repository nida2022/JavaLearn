package InnerClass.NormalInnerClass;

public class OuterClass {

    private int x = 10;
    /*Instantiating an Inner Class from Within the Outer Class
        we can directly create no need for outer.inner;
     */
   void getInnerObj(){
       Inner inner = new Inner();
       inner.sayInner();
   }

    class Inner{
        void sayInner(){
            System.out.println("i m inner");
        }
    }

    public static void main(String[] args) {
       /* accessing the inner class from static method we need to give Outer.inner*/
        OuterClass o = new OuterClass();
        OuterClass.Inner in = new OuterClass().new Inner();
        in.sayInner();

        o.getInnerObj();

    }
}
