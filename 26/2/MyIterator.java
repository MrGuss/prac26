package upr2;

import java.util.Iterator;
import java.util.List;

class MyIterator<T> implements Iterator<T> {

    private int cursor = 0;
    private List<T> list = null;

    public MyIterator(List<T> list){
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return this.cursor < this.list.size();
    }

    @Override
    public T next() {
        return this.list.get(this.cursor++);
    }
}
