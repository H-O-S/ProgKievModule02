package Lesson07.Task01;

public class Cat implements Runnable{
    private String text;
    private Ac ac;
    private boolean threadMarker;

    public Cat(String text, Ac ac, boolean threadMarker){
        this.text = text;
        this.ac = ac;
        this.threadMarker = threadMarker;
    }

    @Override
    public void run() {
        for (int i =0; i < 5; i++){
            ac.printText(text, threadMarker);
        }
    }
}
