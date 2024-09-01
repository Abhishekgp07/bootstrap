package org.bootstrap.Learning_Concpets;

public class OrderOfException {
    public static void main(String[] args) {
        int a[]={1,2,3};

        try{
            System.out.println(1/0);
            System.out.println(a[3]);

        }
        catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("ABExecption handeled");
        }catch(ArithmeticException e){
            System.out.println("ArithmeticExecption Handled");

        }
    }
}
