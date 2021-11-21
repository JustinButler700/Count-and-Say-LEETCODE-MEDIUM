//Justin Butler
// 11/21/2021
//This problem is not good. It is really about realizing the pattern in a sequence of strings. :(
class Solution {
    public String countAndSay(int n) {
        if(n <= 0) return "";
        //Start case.
        String res = "1";
        while(n > 1)
        {
            StringBuilder bld = new StringBuilder();
            for(int i = 0; i < res.length(); i++)
            {
                int count = 1;
                //append the count of the current element.
                while(i +1  < res.length() && res.charAt(i)==res.charAt(i+1))
                {
                    count++;
                    i++;
                }
                bld.append(count).append(res.charAt(i));
            }
            res = bld.toString();
            n--;
        }
        return res;
    }
}
