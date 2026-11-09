class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        int c=0;
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++){
            int x=i+1;
            int y=nums.length-1;
            while(x<y){
                List<Integer> l1=new ArrayList<>();
                
                    if(nums[x]+nums[y]<(-(nums[i]))){
                        x++;
                    }
                    else if(nums[x]+nums[y]>(-(nums[i]))){
                        y--;
                    }
                    else if(nums[x]+nums[y]==(-(nums[i]))){
                        if(x!=y && x!=i && y!=i){
                            l1.add(nums[i]);
                        l1.add(nums[x]);
                        l1.add(nums[y]);
                        if(list.contains(l1)){
                            x++;
                            y--;
                            continue;
                        }
                        else{list.add(l1);}
                        }
                        else{
                            continue;
                        }
                    }
                    else{
                        continue;
                    }
                
            }
            
        }
        return list;
    }
}