class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0;
        int result = 0;
        int total = 0;
        
        for (int i = 0; i < gas.length; i++) {
            sum += gas[i] - cost[i];
            if (sum < 0) {
                total += sum;
                sum = 0;
                result = i + 1;
            }
        }
        
        total += sum;
        
        return total < 0 ? -1 : result;
    }
    
    // reference : https://ifuwanna.tistory.com/361
    public int canCompleteCircuit_bruteforce(int[] gas, int[] cost) {
        int tank = 0;
        for (int i=0; i<gas.length; i++) {
            int distance = gas.length;
            int j = i;
            while (distance > 0) {
                tank += gas[j];
                if (tank < cost[j]) {
                    break;
                }
                tank -= cost[j];
                j = j == gas.length-1 ? 0 : j+1;
                distance--;
            }

            if (distance == 0) {
                return i;
            } else {
                tank = 0;
            }
        }
        
        return -1;
    }
}
