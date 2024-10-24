package org.bootstrap.Learning_Concpets;


class Movie{
    String title;
    int releaseyear;
    Movie(){
        System.out.println("No Title",200);
        System.out.println("No-arguments constructor");
    }
    Movie(String name,int releaseyear){
        this.title=title;
        this.releaseyear=releaseyear;
    }
    public void display(){
        System.out.println("movie name"+title);
        System.out.println("movie release date"+releaseyear);
    }
}
public class LcMain {
    public static void main(String[] args) {
        Movie m = new movie();
        m.display();
    }
}
