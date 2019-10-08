package leecode;

/**
 * ass we can!
 * created by shing
 * 2019-10-08 21:59
 */
public class longStringWithoutRepeat {
    public int lengthOfLongestString(String s){

        if(s == null || s.length()==0)return 0;
        int left = 0,right = 0;
        boolean[] used = new boolean[128];
        int max  = 0;
        int n = s.length();
        while(right < n){
            if(used[s.charAt(right)] == false){
                used[s.charAt(right)] = true;
                right++;
            }else {
                max = Math.max(max,right  - left);
                while (left<right && s.charAt(right)!=s.charAt(left)){
                    used[s.charAt(left)] = false;
                    left++;
                }
                left++;
                right++;
            }
        }

        max = Math.max(max,right - left);
        return max;
    }
}
