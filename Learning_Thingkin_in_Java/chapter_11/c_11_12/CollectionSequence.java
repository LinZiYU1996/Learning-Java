package chapter_11.c_11_12;

import chapter_11.c_11_5.model.Pet;
import chapter_11.c_11_5.model.Pets;

import java.util.AbstractCollection;
import java.util.Iterator;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 17:45 2020/1/2
 */
public class CollectionSequence extends AbstractCollection<Pet> {

    private Pet[] pets = Pets.createArray(8);

    public int size() { return pets.length; }
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;
            public boolean hasNext() {
                return index < pets.length;
            }
            public Pet next() { return pets[index++]; }
            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }


    public static void main(String[] args) {
        CollectionSequence c = new CollectionSequence();
        InterfaceVsIterator.display(c);
        InterfaceVsIterator.display(c.iterator());
    }
}
