class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int a:nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int max=0;
        int ans=0;
        for(Integer key:map.keySet()){
            if(map.get(key)>max){
                max=map.get(key);
                ans=key;
        }
        }
        return ans  ;
    }
}