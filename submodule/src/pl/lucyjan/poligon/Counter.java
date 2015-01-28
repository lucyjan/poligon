package pl.lucyjan.poligon;

public class Counter {
    private int counter = 0;

    synchronized public int getNext()
    {
        return counter++;
    }
}
