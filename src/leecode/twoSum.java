package leecode;

import java.util.HashMap;

/**
 * ass we can!
 * created by shing
 * 2019-10-08 20:56
 */
public class twoSum {

    public int[] twoSum(int[] nums,int target){
        int[] res = new int[2];
         if(nums ==null || nums.length <= 1)return res;

         HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

         for(int i= 0;i<nums.length;i++){
             int num = nums[i];
             int val = target -num;
             if(map.containsKey(val)){

                 res[0] = i;
                 res[1] = map.get(val);
                 return res;
             }else map.put(num,i);



        }
        return res;

    }
}
