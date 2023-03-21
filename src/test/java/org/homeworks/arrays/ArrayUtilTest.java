package org.homeworks.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;




class ArrayUtilTest {

    /**
     * testing positive members of array
     */
    @Test
    void testGetPositiveMembers() {

        int[] input = {5, -10, 6, -1, 95, 48, 35, -15};
        int[] expected = {5, 6, 95, 48, 35};
        int[] actual = ArrayUtil.getPositiveMembers(input);
        assertArrayEquals(expected, actual);


    }

    /**
     * testing min value of array
     */
    @Test
    void  testMinValue(){
        float[] f = new float[]{-4.1f, 5, 68.8f, 98, 4.9f, 0, 69};
        float min = -4.1f;
        float answer = ArrayUtil.minValue(f);

        assertEquals(min, answer);

    }

    /**
     * mirror replace
     */
    @Test
    void  testMatrix(){
        int a[][] = {{1, 2, 3}, {4, 5, 6},{7, 8, 9}};
        int[][] expected = {{1,4,7},{2,5,8},{3,6,9}};
        int[][] actual = ArrayUtil.matrix2(a);
        Assertions.assertArrayEquals(expected, actual);


    }




}