package org.bootstrap.Learning_Concpets;

public class Film{
    private int heroid;
    private String heroname;

    public Film(int heroid,String heroname) {
        this.heroid = heroid;
        this.heroname=heroname;
    }

    public int heroid() {
        return heroid;
    }

    public void setHeroid(int heroid) {
        this.heroid = heroid;
    }

    public String heroname() {
        return heroname;
    }

    public void setHeroname(String heroname) {
        this.heroname = heroname;
    }
    public void display(){
        System.out.println("Heroname is"+heroname);
        System.out.println("Heroid"+heroid);
    }
}




