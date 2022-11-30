package InnerClass.StaticInnerClass;

import InnerClass.NormalInnerClass.OuterClass;

public class Outer {

    static  int x  =10;

    static class Inner{
        void dostuff(){
            System.out.println("Inside Inner");
        }
    }
    public static void main(String[] args) {
        System.out.println(Outer.x);
        Outer.Inner i = new Outer.Inner();
      
        i.dostuff();
    }
}
