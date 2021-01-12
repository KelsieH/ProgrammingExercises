import java.util.Random;

public class ComparisonSort {
    public static Random random = new Random();
    public static final int num_tests = 10000;
    public static final int test_data_size = 10;
    public static final int random_range = 100;

    public static void main(String[] args)  {
        testSort("selection", num_tests);
        testSort("insertion", num_tests);
        testSort("bubble", num_tests);
    }

    public static void testSort(String method, int times) {
        for (int test = 0; test < times; test++) {
            int[] data = createTestData(test_data_size);
            int[] orig = duplicate(data);

            sortUsing(data, method);
            if(!isSortedAsc(data)) {
                printSortErrorMessage(method, data, orig);
                return;
            }
        }
        System.out.println("All tests sorted correctly for " + method + "\n");
    }

    public static void sortUsing(int[] data, String method) {
        if (method.toLowerCase().equals("selection")) {
            selectionSort(data);
        } else if (method.toLowerCase().equals("insertion")) {
            insertionSort(data);
        } else {
            bubbleSort(data);
        }
    }

    public static void printSortErrorMessage(String method, int[] data, int[] orig) {
        System.out.println("error during " + method);
        System.out.println("original data: ");
        print(orig);
        System.out.println("After sorting: ");
        print(data);
        System.outprintln();
    }

    public static int[] createTestData(int amount) {
        int[] data = new int[amount];
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(random_range);

        }
        return data;
    }

    public static int[] duplicate(int[] data) {
        int[] dup = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            dup[i] = data[i];
        }
        return dup;
    }

    public static void print(int[] data) {
        System.out.print("[");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
            if (i < data.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]\n");
    }

    public static boolean isSortedAsc(int[] data) {
        for (int i = 0; i < data.length - 1; i++ ) {
            if (data[i+1] < data[i]) {
                return false;
            }
        }

        return true;
    }

    public static void sortUsing(int[] data, String method) {
        if (method.toLowerCase().equals("insertion")) {
            insertionSort(data);
        } else {
            bubbleSort(data);
        }
    }




    public static void selectionSort (int[] data) {
        for (int i = 0; i<data.length - 1; i++) {
            int thing = i;

            for (int j = i + 1; j<data.length; j++) {
                if (data[j] < data[thing]) {
                    int keep = data[j];
                    data[j] = data[i];
                    data[i] = keep;
                }
            }
        }
    }

    public static void insertionSort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int keep = data[i];
            int j = i - 1;

            while (j >=0 && data[j] > n) {

                data[j+1] = data[j];
                j--;

            }

            data[j+1] = keep;
        }
    }

    public static void bubbleSort(int[] data) {
        for (int i = 0; i<data.length - 1; i++) {
            for (int j = 0; j < data.length - 2; j++) {
                if (data[j+1] < data[j]) {
                    int keep = data[j];
                    data[j] = data[j+1];
                    data[j+1] = keep;
                }
            }
        }
    }
}
