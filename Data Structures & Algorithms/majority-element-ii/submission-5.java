class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     int count=1;
        //     for(int j=0;j<nums.length;j++){
        //         if(i==j){
        //             continue;
        //         }
        //         else{
        //             if(nums[i]==nums[j]){
        //                 count++;
        //             }
        //         }
        //     }
        //     if(count > nums.length / 3){
        //         if(list.contains(nums[i])){
        //             continue;
        //         }
        //         else{list.add(nums[i]);}

        //     }
        // }
        // return list;
        int n = nums.length;
        for (int size = 1; size < n; size *= 2) {
            for (int left = 0; left < n - size; left += 2 * size) {
                int mid = left + size - 1;
                int right = Math.min(left + 2 * size - 1, n - 1);
                int[] temp = new int[right - left + 1];
                int i = left;
                int j = mid + 1;
                int k = 0;
                while (i <= mid && j <= right) {
                    if (nums[i] <= nums[j]) {
                        temp[k++] = nums[i++];
                    } else {
                        temp[k++] = nums[j++];
                    }
                }
                while (i <= mid) {
                    temp[k++] = nums[i++];
                }
                while (j <= right) {
                    temp[k++] = nums[j++];
                }
                for (int x = 0; x < temp.length; x++) {
                    nums[left + x] = temp[x];
                }
            }
        }
        if(n==1){
            list.add(nums[0]);
            return list;
        }
        else if(n==2){
            if(nums[0]==nums[1]){list.add(nums[0]);return list;}
            else{list.add(nums[0]);list.add(nums[1]);return list;}
        }    
        int count=1;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                count++;
            }
            else{
                count=1;
                continue;
            }
            if(list.contains(nums[i])){
                continue;
            }
            else{
                if(count>n/3){
                    list.add(nums[i]);
                }
            }
        }
        return list;
    }
}