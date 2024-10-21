package org.bootstrap.Practice;

abstract class Company{
    abstract void developer();
    public void Tester(){
        System.out.println("Testing the software");
    }
}
class Pcompany extends Company{
    public void developer(){
        System.out.println("Developing  the software in Pcompany");
    }
}
class Scompany extends Company{
    public void developer(){
        System.out.println("Developing  the software in Scompany");
    }
}


public class oops3A {
    public static void main(String[] args) {
        Company c = new Pcompany();
        c.developer();
        c.Tester();

        Company C = new Scompany();
        C.developer();
        C.Tester();

    }
}
