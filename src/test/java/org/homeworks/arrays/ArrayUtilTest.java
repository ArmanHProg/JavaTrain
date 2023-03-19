package org.homeworks.arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;




class ArrayUtilTest {


    @Test
    void testGetPositiveMembers() {

        int[] input = {5, -10, 6, -1, 95, 48, 35, -15};
        int[] expected = {5, 6, 95, 48, 35};
        int[] actual = ArrayUtil.getPositiveMembers(input);
        assertArrayEquals(expected, actual);


    }

    @Test

    void  testMinValue(){
        float[] f = new float[]{-4.1f, 5, 68.8f, 98, 4.9f, 0, 69};
        float min = -4.1f;
        float answer = ArrayUtil.minValue(f);

        assertEquals(min, answer);

    }


}