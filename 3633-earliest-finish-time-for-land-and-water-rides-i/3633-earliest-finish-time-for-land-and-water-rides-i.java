class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        //brute force method
        int ans1 = Integer.MAX_VALUE;

        for(int j=0;j<landStartTime.length;j++){
        int landFinish = landStartTime[j] + landDuration[j];
        for(int i=0;i<waterDuration.length;i++){
        int waterStart = Math.max(landFinish,waterStartTime[i]);
         int finish = waterStart + waterDuration[i];
         ans1 = Math.min(ans1,finish);
        }
        }
         
        int ans2 = Integer.MAX_VALUE;

        for(int j=0;j< waterStartTime.length;j++){
        int waterFinish = waterStartTime[j] + waterDuration[j];
        for(int i=0;i<landDuration.length;i++){
        int landStart = Math.max(waterFinish,landStartTime[i] );
        int finish = landStart + landDuration[i];
         ans2 = Math.min(ans2 , finish);
        }
       }
       return Math.min(ans1,ans2);
    }
}