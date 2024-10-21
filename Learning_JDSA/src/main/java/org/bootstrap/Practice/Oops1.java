package org.bootstrap.Practice;
class school{
    private String name;
    private int id;


    public school(String name, int id){
        this.name=name;
        this.id=id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String name() {
        return name;
    }

    public int id() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void display(){
        System.out.println("The name is"+name);
        System.out.println("The id is"+id);


    }
}

public class Oops1 {
    public static void main(String[] args) {
        school sc = new school("abhi",22);
        sc.display();

        sc.setName("Manoj");
        sc.setId(22);

        sc.display(); 

    }
}
