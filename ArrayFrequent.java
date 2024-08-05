public class ArrayFrequent {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] checkedList = new int[list.length];
        int checkIndex = 0;

        for (int i = 0; i < list.length; i++) {

            if (!isFind(checkedList, list[i])) {
                int sum = 0;
                int frequent = 0;
                for (int j = 0; j < list.length; j++) {
                    if (list[i] == list[j]) {
                        sum += list[i];
                        frequent = sum / list[i];


                    }
                }
                checkedList[checkIndex++] = list[i];
                System.out.println(list[i] + " sayısı " + frequent + " kere tekrar etti.");
            }

        }
    }
}
