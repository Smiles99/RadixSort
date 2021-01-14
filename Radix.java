import static java.lang.Character.getNumericValue;

public class Radix {
    public static int nth(int n, int col) {
        int x = 0;
        while (x < col) {
            n = n/10;
            x++;
        }
        int numAtCol = n%10;
        return numAtCol;
    }
    public static int length(int n) {
        String hold = "" + n;
        int x = hold.length() - 1;
        return x;
    }
    /*public static void merge(MyLinkedList original,MyLinkedList[]buckets) {
        int x = 0;
        while (x < buckets.length) {
            original.extend(buckets[x]);
            x++;
        }
    }*/
    public static void merge( SortableLinkedList original, SortableLinkedList[]buckets) {
        int x = 0;
        while (x < buckets.length) {
            original.extend(buckets[x]);
            x++;
        }
    }
    public static void radixSortSimple(SortableLinkedList data) {
        int longest = 0;
        int x = 0;
        SortableLinkedList.Node current = SortableLinkedList.start;
        int z = 0;
        while (z < data.size()) {
            while (x < 1) {
                int y = length(getData(current));
                if (y > longest) {
                    longest = y;
                }
            }
        }
    }
}
