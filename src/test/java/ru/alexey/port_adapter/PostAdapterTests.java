package ru.alexey.port_adapter;
/* 
15.06.2022: Alexey created this file inside the package: ru.alexey.port_adapter 
*/

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class PostAdapterTests {
    PortAdapter portAdapter = new PortAdapter();

    @Test
    public void shouldReturnTrueWhenArraysEquals() {
        Integer[][] toTest = new Integer[][]{
                new Integer[]{1, 1, 1}
        };
        Integer[][] toTest2 = new Integer[][]{
                new Integer[]{1, 1, 1}
                , new Integer[]{2, 1, 1}
                , new Integer[]{3, 1, 1}
        };
        Assert.assertTrue(Arrays.deepEquals(portAdapter
                .returnCombinationOfIntegers(
                        portAdapter
                                .returnIntArr(new String[]{"1", "1", "1"})), toTest));
        Assert.assertTrue(Arrays.deepEquals(portAdapter
                .returnCombinationOfIntegers(
                        portAdapter
                                .returnIntArr(new String[]{"1-3", "1", "1"})), toTest2));
    }

    @Test
    public void shouldReturnTrueWhenStringArrayAreZeroLength() {
        Integer[][] result = portAdapter
                .returnCombinationOfIntegers(
                        portAdapter
                                .returnIntArr(new String[]{}));

        Assert.assertTrue(Arrays.deepEquals(result, new Integer[][]{new Integer[]{}}));
    }
}
