package Lesson07.Task01;

public class Ac {
    private  boolean turn;

    public Ac (boolean turn){
        this.turn = turn;
    }

    public Ac (){
    }


    public synchronized void printText(String text, boolean threadMarker){
        for (;turn == threadMarker;){
            try {
                wait();
            }catch (InterruptedException e){

            }
        }
        System.out.println(text + " ");
        turn = ! turn;
        notifyAll();
    }
}
