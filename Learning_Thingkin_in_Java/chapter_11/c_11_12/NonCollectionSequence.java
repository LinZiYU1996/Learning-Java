package chapter_11.c_11_12;

import chapter_11.c_11_5.model.Pet;

import java.util.Iterator;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 17:47 2020/1/2
 */
public class NonCollectionSequence extends PetSequence{

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
        NonCollectionSequence nc = new NonCollectionSequence();
        InterfaceVsIterator.display(nc.iterator());
    }
}
