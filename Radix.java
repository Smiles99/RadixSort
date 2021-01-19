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
        final int RADIX = 10;
        SortableLinkedList[] bucket = new SortableLinkedList[RADIX];
        SortableLinkedList output = new SortableLinkedList();
        int maxValue = -1;
        for (int i =0; i<data.size(); i++) {
            if (data.get(i) > maxValue) {
                maxValue = data.get(i);
            }
        }
        for (int i = 0; i < bucket.length; i++)  {
            bucket[i] = new SortableLinkedList();
        }
        int place = 1;
        output.extend(data);
        while (maxValue > place) {
            // System.out.println("before place: " + place);
            // System.out.println(output);
            int digit;
            for (int i = 0; i<output.size(); i++) {
                int value = output.get(i);
                digit = value / place;
                bucket[digit % RADIX].add(value);
            }
            System.out.println("after place: " + place);
            output = new SortableLinkedList();
            for (int b = 0; b < RADIX; b++) {
                // System.out.println("bucket " + b + ": " + bucket[b]);
                output.extend(bucket[b]);
            }
            // System.out.println(output);
            place *= RADIX;
        }
        data.extend(output);
    }
    public static void radixSort(SortableLinkedList data) {
        // final int RADIX = 10;
        // SortableLinkedList[] bucket = new SortableLinkedList[RADIX];
        // SortableLinkedList output = new SortableLinkedList();
        // int maxValue = -1;
        // for (int i =0; i<data.size(); i++) {
        //     if (data.get(i) > maxValue) {
        //         maxValue = data.get(i);
        //     }
        // }
        // for (int i = 0; i < bucket.length; i++)  {
        //     bucket[i] = new SortableLinkedList();
        // }
        // int place = 1;
        // output.extend(data);
        // while (maxValue > place) {
        //     System.out.println("before place: " + place);
        //     System.out.println(output);
        //     int digit;
        //     for (int i = 0; i<output.size(); i++) {
        //         int value = output.get(i);
        //         digit = value / place;
        //         bucket[digit % RADIX].add(value);
        //     }
        //     System.out.println("after place: " + place);
        //     output = new SortableLinkedList();
        //     for (int b = 0; b < RADIX; b++) {
        //         System.out.println("bucket " + b + ": " + bucket[b]);
        //         output.extend(bucket[b]);
        //     }
        //     System.out.println(output);
        //     place *= RADIX;
        // }
        // data.extend(output);
    }
}
