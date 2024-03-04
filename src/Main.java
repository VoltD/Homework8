public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Task 1");
        int[] arr1 = new int[]{1,2,3};
        double[] arr2 = {1.57, 7.654, 9.986};
        boolean[] arr3 = new boolean[]{true,false,true};
        System.out.println();

        // Task 2
        System.out.println("Task 2");
        for (int i = 0; i < arr1.length; i++) {
            if (i == arr1.length - 1) {
                System.out.print(arr1[i]);
            } else {
                System.out.print(arr1[i] + ", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            if (i == arr2.length - 1) {
                System.out.print(arr2[i]);
            } else {
                System.out.print(arr2[i] + ", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arr3.length; i++) {
            if (i == arr3.length - 1) {
                System.out.print(arr3[i]);
            } else {
                System.out.print(arr3[i] + ", ");
            }
        }
        System.out.println();
    }
}