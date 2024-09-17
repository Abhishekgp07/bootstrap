package org.bootstrap.MutliThreading_concepts;

class MSword extends Thread {
    public void run() {
        if (getName().equals("Typing")) {
            Typing();
        } else if (getName().equals("Check Spell")) {
            CheckSpell();
        } else {
            Autosave();
        }
    }

    void Typing() {
        try {
            for (int i = 1; i <= 20; i++) {
                System.out.println("Typing");
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
    void CheckSpell(){
        try{
            for(;;){
                System.out.println("Check Spelling");
                Thread.sleep(2000);
            }
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
    void Autosave(){
        try{
            for(;;){
                System.out.println("Saving");
                Thread.sleep(2000);
            }
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
class DemonThread{
    public static void main(String[] args) {
        MSword m1 = new MSword();
        MSword m2 = new MSword();
        MSword m3 = new MSword();

        m1.setName("Typing");
        m2.setName("Check Spell");
        m2.setDaemon(true);
        m3.setName("Saving");
        m3.setDaemon(true);

        m1.start();
        m2.start();
        m3.start();
    }
}
