class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer> li=new ArrayList<>();
        for(Integer i:nums)
        {
            if(i!=0)
            li.add(i);
        }
        int j=0;
        int i=0;
        while(j<li.size())
        {
            nums[i]=li.get(j);
            i++;
            j++;
        }
        while(j<nums.length)
        {
            nums[i]=0;
            i++;
            j++;
        }

    }
}