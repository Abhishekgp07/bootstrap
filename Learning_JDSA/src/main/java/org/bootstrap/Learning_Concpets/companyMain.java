package org.bootstrap.Learning_Concpets;
 class company {
     public void startWork() {
         System.out.println("The workers start working in morning");
     }

     public void takeBreak() {
         System.out.println("The workers will take break at noon time");
     }

     public void endWork() {
         System.out.println("The worker will end their work at evening");

     }
 }
    class Developers extends company{

    }
    class Tester extends company{

    }

public class companyMain {
    public static void main(String[] args) {
        company developers = new Developers();
        developers.startWork();
        developers.takeBreak();
        developers.endWork();

        company tester = new Tester();
        tester.startWork();
        tester.takeBreak();
        tester.endWork();

    }
}
