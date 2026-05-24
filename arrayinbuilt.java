public class arrayinbuilt {
    public static void main (String args[]) {
        int arr[] = {30,10,50,20,40};
        System.out.println("Array elements : ");
        for (int i =0; i < arr.length;i++) {
            System.out.println(arr[i]+ " ");
        }
        int sum=0;
        System.out.println("Array Sum : ");
        for (int i =0;i<arr.length;i++) {
            sum=sum+arr[i];
        }
        System.out.println(sum);
        int max=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>max) {
                max=arr[i];
            }
        }
        System.out.println("Max : " +max);
    }
}
