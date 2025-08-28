package Functional_Interface;

public class MyNumTest {


    public static void main(String[] args) {

        MyNumber mn = (x,y)-> x>y ? x:y;


//        {
//
//            if (x>y) return x;
//            else return y;
//
//
//
//        };

        System.out.println(mn.getMax(10,2));
    }
}
