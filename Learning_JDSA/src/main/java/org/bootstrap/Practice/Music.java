package org.bootstrap.Practice;

public interface Music {
    void play();
    void tune();
}
class melody implements Music{
    @Override
    public void play() {
        System.out.println("Playing the melody music play");
    }

    @Override
    public void tune() {
        System.out.println("Playing the melody music tune ");
    }
}

class pop implements Music{
    @Override
    public void play() {
        System.out.println("Playing the pop music play");
    }

    @Override
    public void tune() {
        System.out.println("Playing the pop music tune");
    }
}

