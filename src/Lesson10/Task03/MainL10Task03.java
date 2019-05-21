package Lesson10.Task03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainL10Task03 {
    public static void main(String[] args) {
        int n = 3;
        int [] seg = { 1, 1, 0, 0, 0, 2, 2, 2 };
        String[] fragmentData = { "+", "+", "A", "A", "B", "#", "#", "#" };
    }

    public static String getMessage(int n, int[]seg, String[] fragmentData){
        String result = "";
        Map<Integer, Map<String, Integer>> decode = new HashMap<>();
        for (int i = 0; i < fragmentData.length; i++){
            Map<String, Integer> onePartMessage = decode.get(seg[i]);
            if (onePartMessage == null){
                onePartMessage = new HashMap<>();
                onePartMessage.put(fragmentData[i], 1);
            } else {
                Integer count = onePartMessage.get(fragmentData[i]);
                if (count == null){
                    onePartMessage.put(fragmentData[i], 1);
                } else {
                    onePartMessage.put(fragmentData[i], count + 1);
                }
            }
            decode.put(seg[i], onePartMessage);
        }
        Set<Integer> partNumber = decode.keySet();
        for (Integer number : partNumber){
            Map<String, Integer> onePartMessage = decode.get(number);
//            Set<String> partMessage = onePartMessage
        }

        return result;
    }
}
