class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int[] result = new int[intervals.length];
        TreeMap<Integer,Integer> indexMap = new TreeMap<Integer,Integer>();
        for (int i=0; i<intervals.length; i++){
            indexMap.put(intervals[i][0],i);
        }
        for (int i = 0; i < intervals.length; ++i){
            Map.Entry<Integer,Integer> entry = indexMap.ceilingEntry(intervals[i][1]);
            if (entry==null){
                result[i] = -1;
            } else {
                result[i] = entry.getValue();
            }
        }
        return result;
    }
}