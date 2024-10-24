package org.bootstrap.Learning_Concpets;

class  movie{
    movie(){
        System.out.println("Movie constructor is called");
    }
}
class Horror extends movie{
    Horror(){
        super();
        System.out.println("Horror constructor is called");
    }
}
public class ConsMain {
    public static void main(String[] args) {
        Horror hor = new Horror();
    }
}
