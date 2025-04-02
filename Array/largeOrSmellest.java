public class largeOrSmellest {
    public static int largestValue(int num[]){
        int largest=Integer.MIN_VALUE;
        for(int i =0; i<num.length; i++){
            if(largest < num[i]){
                largest = num[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int num[]={2,3,4,5,6,7,82,1,77} ;
        System.out.println(largestValue(num));

    }
    
}
