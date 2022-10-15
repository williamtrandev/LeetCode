import java.util.ArrayList;
import java.util.List;

class Solution119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> preList = new ArrayList<>();
        preList.add(1);
        if(rowIndex == 0) {
            return preList;
        }
        preList.add(1);
        if(rowIndex == 1) {
            return preList;
        }
        // Th index > 1
        for(int i = 2; i <= rowIndex; i++) {
            List<Integer> currentList = new ArrayList<>();
            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i) {
                    currentList.add(1);
                } else {
                    currentList.add(preList.get(j-1) + preList.get(j));
                }
            }
            preList = currentList;
        }
        return preList;
    }
}