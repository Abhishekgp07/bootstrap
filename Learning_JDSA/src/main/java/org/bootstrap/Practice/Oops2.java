package org.bootstrap.Practice;

class company {
    public void work() {
        System.out.println("Employees are working");
    }
}

class developer extends company {
    @Override
    public void work() {
        super.work();
        System.out.println("Developers are coding");
    }
}

class Tester extends company {
    @Override
    public void work() {
        super.work();
        System.out.println("Testers are testing");
    }
}

public class Oops2 {
    public static void main(String[] args) {
        company c = new company();
        c.work();

        developer d = new developer();
        d.work();

        Tester t = new Tester();
        t.work();
    }
}
