class Solution {
    public ArrayList<ArrayList<Integer>> levelSort(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int index = 0;
        int val = 1;
        while(index < arr.length){
            ArrayList<Integer> num = new ArrayList<>();
            for(int i =0;i< val && index < arr.length ;i++){
                num.add(arr[index]);
                index++;
            }
            Collections.sort(num);
            res.add(num);
            val *=2;
            
        }
        return res;
        
    }
}