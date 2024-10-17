package org.bootstrap.Serlization_Deserlization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Cricket implements Serializable {
    String name;
    int run;
    float average;


    public Cricket(String name,int run,float average) {
        this.name=name;
        this.run=run;
        this.average=average;
    }
    void display(){
        System.out.println(name);
        System.out.println(run);
        System.out.println(average);
    }

}

public class LaunchCricket {
    public static void main(String[] args) throws Exception {
        Cricket c = new Cricket("Dhoni",20000,89.9f);
        c.display();
        String path="C:/Project/input.txt";
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream obs= new ObjectOutputStream(fos);
        obs.writeObject(c);

    }
}
