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
        SortableLinkedList.Node current = start;
        int z = 0;
        while (z < data.size()) {
            while (x < 1) {
                int b = current.getData();
                int y = length(current.getData());
                if (y > longest) {
                    longest = y;
                }
                int a = nth(b, x);
                SortableLinkedList[]buckets = new SortableLinkedList[0];
                buckets[x] = buckets[a].add(current.getData());
                merge(data, buckets);
                z++;
                current = current.getNext();
            }
            while (x < longest) {
                int b = current.getData();
                int y = length(current.getData());
                int a = nth(b, x);
                SortableLinkedList[]buckets = new SortableLinkedList[0];
                buckets[x] = buckets[a].add(current.getData());
                merge(data, buckets);
                z++;
                current = current.getNext();
            }
            x++;
        }
    }
    public static void radixSort(SortableLinkedList data) {

    }
}
