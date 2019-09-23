public class MaxSumNoAdjacent {
    public static void main(String[] args) {
        int[] arr = {5, 5, 10, 110, 5, 4};

        findMax(arr);
    }

    private static void findMax(int[] arr) {
        int incl = arr[0];
        int excl = 0;


        for (int i = 1; i < arr.length - 1; i++) {
            int newExcl = (incl > excl) ? incl : excl;

            incl = excl + arr[i];
            excl = newExcl;
        }

        System.out.println(Math.max(incl, excl));
    }
}

