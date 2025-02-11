class Main {
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 55, 22, 772, 99992, 292};
     
        System.out.println(MaxNumber(arr));
    }
    
    public static int MaxNumber(int[] arr) {  
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {  
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
