package chapter_17.demo.d3;



import chapter_17.c_17_2.c_17_2_3.Countries;

import java.util.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/10
 * \* Time: 10:22
 * \* Description:
 * \
 */
public class Alphats {

    public static final String[][] ALPS = {

            {"A","1"},
            {"B","2"},
            {"C","3"},
            {"D","4"},
            {"E","5"},
            {"F","6"},
            {"G","7"},


    };



    private static class FlyweightMap
            extends AbstractMap<String,String> {

        private static class Entry
                implements Map.Entry<String,String> {

            int index;

            Entry(int index) {

                this.index = index;
            }

            public boolean equals(Object o) {

                return ALPS[index][0].equals(o);
            }

            public String getKey() {

                return ALPS[index][0];
            }

            public String getValue() {

                return ALPS[index][1];
            }


            public String setValue(String value) {

                throw new UnsupportedOperationException();

            }

            public int hashCode() {

                return ALPS[index][0].hashCode();

            }
        }


        // Use AbstractSet by implementing size() & iterator()
        static class EntrySet
                extends AbstractSet<Map.Entry<String,String>> {


            private int size;

            EntrySet(int size) {

                if(size < 0)
                    this.size = 0;

// Can’t be any bigger than the array:
                else if(size > ALPS.length)

                    this.size = ALPS.length;

                else
                    this.size = size;
            }

            public int size() {

                return size;

            }


            private class Iter
                    implements Iterator<Map.Entry<String,String>> {

                // Only one Entry object per Iterator:
                private Alphats.FlyweightMap.Entry entry = new Alphats.FlyweightMap.Entry(-1);

                public boolean hasNext() {

                    return entry.index < size - 1;

                }

                public Map.Entry<String,String> next() {

                    entry.index++;
                    return entry;

                }

                public void remove() {

                    throw new UnsupportedOperationException();
                }
            }


            public
            Iterator<Map.Entry<String,String>> iterator() {

                return new Alphats.FlyweightMap.EntrySet.Iter();

            }
        }


        private static Set<Map.Entry<String,String>> entries =
                new EntrySet(ALPS.length);


        public Set<Map.Entry<String,String>> entrySet() {

            return entries;

        }

    }


    // Create a partial map of ‘size’ countries:
    static Map<String,String> select(final int size) {

        return new FlyweightMap() {
            public Set<Map.Entry<String,String>> entrySet() {
                return new EntrySet(size);
            }
        };

    }


    static Map<String,String> map = new FlyweightMap();


    public static Map<String,String> alphat_s() {
        return map; // The entire map
    }


    public static Map<String,String> alphat_s(int size) {
        return select(size); // A partial map
    }


    static List<String> names =

            new ArrayList<String>(map.keySet());


    // All the names:
    public static List<String> names() {

        return names;

    }


    // A partial list:
    public static List<String> names(int size) {

        return new ArrayList<String>(select(size).keySet());

    }

    public static void main(String[] args) {


        System.out.println(alphat_s(10));

        System.out.println("_______________________");

        System.out.println(names(10));

        System.out.println("_______________________");

        System.out.println(new HashMap<String,String>(alphat_s(3)));

        System.out.println("_______________________");

        System.out.println(new LinkedHashMap<String,String>(alphat_s(3)));

    }

}
