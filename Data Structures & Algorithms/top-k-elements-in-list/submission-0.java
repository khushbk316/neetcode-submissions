class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> pm = new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
        for(int num:map.keySet())
        {
            pm.offer(num);
            if(pm.size()>k)
       {
        pm.poll();
       }
        }
       
       int[] result = new int[k];
       for(int i = 0; i<k;i++)
       {
        result[i] = pm.poll();
       }
       return result;
    }
}
