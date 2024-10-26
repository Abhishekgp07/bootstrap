class Movie{
    String title;
    int releaseYear;

    Movie(){
        this("No title",200);
        System.out.println("No-argument constructor");
    }
    Movie(String title,int releaseYear){
        this.title=title;
        this.releaseYear=releaseYear;
        System.out.println("Parameterized Constructor called ");
    }
    public void displayInfo(){
        System.out.println("Movie title"+title);
        System.out.println("Movie Release date"+releaseYear);
    }
}

public class LcMain {
    public static void main(String[] args) {
        Movie m = new Movie("kiccha ",2022);
        m.displayInfo();
    }
}