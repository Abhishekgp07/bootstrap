package org.bootstrap.Learning_Concpets;

public interface Zoo {
     void eat() ;

        default void sleep () {
            System.out.println("It is sleeping");
        }
}

class Lion implements Zoo{
    @Override
    public void eat() {
        System.out.println("Eating the flesh!!!!!");
    }
}

class Tiger implements Zoo{
    @Override
    public void eat(){
        System.out.println("Eating the meat");
    }
}

