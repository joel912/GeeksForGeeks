class Solution {
    public long pairAndSum(int[] arr) {
        // code here
        long sum =0;
        for(int bit = 0;bit<32;bit++){
            long count =0;
            for(int num: arr){
                if( (num & (1<<bit)) !=0){
                    count++;
                }
                
            }
            long pair = count*(count-1)/2;
            long val = pair * (1L << bit);
            sum+= val;
        }
        return sum;
    }
}