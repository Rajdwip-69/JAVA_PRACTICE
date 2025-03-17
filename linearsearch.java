class lineasearch {
    public static void main(String[] args) {
        int nums[] = {12, 34, 56, 89, 90};
        int target = 56;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;  // Return -1 if the target is not found
    }
}
