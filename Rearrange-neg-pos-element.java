class Main {
    static void rearrangeArray(int arr[], int n) {
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                for(int j = i;j >0;j--){
                    if(arr[j-1] > 0){
                        int temp= arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j]= temp;
                    }
                    else{
                        break;
                    }
                    
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {-1, 2, -8, -2, -3, 4, -5, 3, 6, -7 };
        int n = arr.length;

        rearrangeArray(arr, n);

        // Print the rearranged array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


