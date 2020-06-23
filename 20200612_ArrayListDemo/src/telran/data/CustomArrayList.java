package telran.data;

import java.lang.ref.SoftReference;

public class CustomArrayList<E> implements CustomList<E> {

    private Object[] source;
    private int size;
    private static final int DEFAULT_CAPACITY = 16;

    public CustomArrayList() {
        source = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(E o) {
        if (size == source.length) {
            Object[] newSource = new Object[size + DEFAULT_CAPACITY];
            System.arraycopy(source, 0, newSource, 0, source.length);
            source = newSource;
        }
        source[size] = o;
        size++;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (E) source[index];
    }

    @Override
    public E removeByIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Object o = (E) source[index];
        System.arraycopy(source, index + 1, source, index, size - index - 1);
        size--;
        return (E) o;
    }

    @Override
    public boolean remove(E o) {
        for (int i = 0; i < size; i++) {
            if (source[i].equals(o)) {
                removeByIndex(i);
                return true;
            }
        }
        return false;
    }


    public boolean remove1(E o) {
        for (int i = 0; i < size; i++) {
            if (source[i].equals(o)) {
                System.arraycopy(source, i+1, source, i,size - (i-1));
                size--;
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int indexOf(E o){
        for (int i = 0; i < size; i++) {
            if(source[i].equals(o)){
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(E o){
        for (int i = size-1; i >= 0; i--){
                if (o.equals(source[i]))
                    return i;
        }
        return -1;
    }
}
