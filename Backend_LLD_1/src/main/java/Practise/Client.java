package Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

public class Client {
    public static List<List<String>> groupAnagrams(String[] strs) {
        //complete the code here
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        LinkedHashMap<String, List<String>> freqList = new LinkedHashMap<>();
        for (String s: strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String sortedString = new String(arr);
            System.out.println(sortedString);
            List<String> ls;
            if (freqList.containsKey(sortedString)) {
                ls = freqList.get(sortedString);
            } else {
                ls = new ArrayList<>();
            }
            ls.add(s);
            freqList.put(sortedString, ls);
        }
        List<List<String>> ans = new ArrayList<>();
        for (List<String> hm : freqList.values()) {
            ans.add(hm);
        }
        return ans;
    }

    public static void main(String[] args) {
        String strs[] = {"eat", "tea", "tan"};
        List<List<String>> result = groupAnagrams(strs);

        for(List<String> ans:result){
            System.out.println(ans);
        }
    }
}
