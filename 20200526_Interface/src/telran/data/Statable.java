package telran.data;

public interface Statable {

    int OPEN = 1;
    int CLOSED = 0;

    void printState(int n);
}
