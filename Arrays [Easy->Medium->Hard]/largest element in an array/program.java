class Compute {
    
    public int largest(int arr[], int n)
    {
        int max=Integer.MIN_VALUE;
        for(int i:arr){
            if(max<i)max=i;
        }return max;
    }
}
