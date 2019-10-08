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
            if(used[s.charAt(right)] == false){  //得到某个字符的位置，应为会返回收个该值得索引，第二次有重复值，会返回以第一次好到的索引，可以判断是否中饭，，然后将指针加1
                used[s.charAt(right)] = true;
                right++;
            }else {
                max = Math.max(max,right  - left);
                while (left<right && s.charAt(right)!=s.charAt(left)){//将left指向相同值得前一位
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
