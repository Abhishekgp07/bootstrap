package org.bootstrap.Learning_Concpets;

class Movie{
    String title;
    int releaseYear;

    Movie(){
        this("Unknown title",2000);
        System.out.println("No argument consrtutor called");
    }
    Movie(String title ,int releaseYear){
        this.title=title;
        this.releaseYear=releaseYear;
        System.out.println("parametred constructor called");
    }
    void display(){
        System.out.println(title);
        System.out.println(releaseYear);
    }

}
public class LocalMain {
    public static void main(String[] args) {
        Movie m = new Movie();
        m.display();
    }
}
