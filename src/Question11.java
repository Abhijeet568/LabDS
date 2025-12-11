public class Question11 {

    public static void main(String[] args) {

        int[] arr = {2, 4, 4, 4, 5, 7, 9};
        int x = 4;

        int first = -1, last = -1;

        // Find first and last occurrence
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                if (first == -1) {
                    first = i;      // first time we see x
                }
                last = i;           // update last every time
            }
        }

        System.out.println("First Occurrence = " + first);
        System.out.println("Last Occurrence = " + last);
    }
}
