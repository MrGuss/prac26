package upr3;

import java.util.*;

class MyList<T> implements Iterable<T> {
    private int curSize=0;
    private Object elems[];
    private int minCap = 1;

    public MyList(){
        this.elems = new Object[this.minCap];
    }
    public void add(T obj){
        if (this.curSize == elems.length){
            this.expand();
        }
        this.elems[this.curSize++] = obj;
    }

    public T get(int pos){
        if (pos>=this.curSize || pos<0){
            throw new IndexOutOfBoundsException("Index: " + pos + ", Size " + pos);
        }
        return (T) this.elems[pos];
    }

    public T pop(){
        Object last = this.elems[this.curSize-1];
        this.elems[curSize-1] = null;
        this.curSize-=1;
        return (T) last;
    }

    public int size(){
        return this.curSize;
    }

    @Override
    public String toString() {
        String buf = " ";
        for (int i=0; i<this.curSize; i++){
            buf += this.elems[i]+ " ";
        }
        return "MyList{" +
                "elems=" + buf +
                '}';
    }

    private void expand() {
        this.elems = Arrays.copyOf(this.elems, this.elems.length*2);
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int cursor = 0;

            @Override
            public boolean hasNext() {
                return cursor<curSize;
            }

            @Override
            public T next() {
                return (T) elems[cursor++];
            }
        };
    }
}
