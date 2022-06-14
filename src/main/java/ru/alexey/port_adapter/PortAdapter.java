package ru.alexey.port_adapter;
/* 
15.06.2022: Alexey created this file inside the package: ru.alexey 
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PortAdapter {

    public Integer[][] returnIntArr(String[] indexes) {
        Integer[][] tmp = new Integer[indexes.length][];

        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = returnIntArrayFromString(indexes[i]);
        }

        return tmp;
    }

    private Integer[] returnIntArrayFromString(String s) {
        List<String> values = Arrays.stream(s.split(",")).collect(Collectors.toList());
        List<Integer> tmp = new ArrayList<>();

        for (String str : values) {
            if (str.contains("-")) {
                int f = Integer.parseInt(str.split("-")[0]);
                int t = Integer.parseInt(str.split("-")[1]);

                for (int i = 0; i <= t - f; i++) {
                    tmp.add(i + f);
                }
            } else tmp.add(Integer.parseInt(str));
        }
        return tmp.toArray(Integer[]::new);
    }

    public Integer[][] returnCombinationOfIntegers(Integer[][] comb) {
        if (comb == null) return new Integer[][]{{}};
        Integer[][] temp = new Integer[][]{{}};
        for (Integer[] inner : comb) {
            if (inner == null || inner.length == 0) continue;
            Integer[][] next = new Integer[temp.length * inner.length][];
            for (int j = 0; j < temp.length; j++) {
                Integer[] row = temp[j];
                for (int k = 0; k < inner.length; k++) {
                    Integer elem = inner[k];
                    Integer[] nRow = Arrays.copyOf(row, row.length + 1);
                    nRow[row.length] = elem;
                    next[j * inner.length + k] = nRow;
                }
            }
            temp = next;
        }
        return temp;
    }
}
