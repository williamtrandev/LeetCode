import java.util.ArrayList;
import java.util.List;

class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalList = new ArrayList<>();
        List<Integer> subList = new ArrayList<>();
        subList.add(1);
        pascalList.add(subList);
        if(numRows == 1) {
            return pascalList;
        }
        List<Integer> preList = new ArrayList<>();
        preList.add(1);
        preList.add(1);
        pascalList.add(preList);
        if(numRows == 2) {
            return pascalList;
        }
        // TH từ 3 hàng trở lên
        for(int i = 3; i <= numRows; i++) {
            List<Integer> currentList = new ArrayList<>();
            for(int j = 0; j < i; j++) {
                if(j == 0 || j == i - 1) {
                    currentList.add(1);
                } else {
                    currentList.add(preList.get(j-1) + preList.get(j));
                }
            }
            pascalList.add(currentList);
            preList = currentList;
        }
        return pascalList;
    }
}

