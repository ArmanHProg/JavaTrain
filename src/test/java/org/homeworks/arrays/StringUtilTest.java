package org.homeworks.arrays;

import org.homeworks.strings.StringUtil;
import org.homeworks.strings.StringUtil_2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilTest {

   @Test
    void concatenationTest(){
       String expected = "helloworld3hello12hello";
       StringUtil stringUtil = new StringUtil();
       String actual = stringUtil.concatenation();
      Assertions.assertEquals(expected,actual);

   }


   @Test
   void reverseTest(){
       String expected = "olleh";
       StringUtil stringUtil = new StringUtil();
        String actual = stringUtil.reverse();
        Assertions.assertEquals(expected,actual);
   }

   @Test
    void countSubStringTest(){
       String line = "We are living in a yellow submarine. We don't  have anything";
       String token = "in";
       StringUtil stringUtil = new StringUtil();
       int expected = stringUtil.countSubString(line,token);
       int actual = 4;

       Assertions.assertEquals(expected,actual);
   }

   @Test
    void LongestWordTest(){
       String expected = "submarine.";
       StringUtil stringUtil = new StringUtil();
       String actual = stringUtil.longestWord();
       Assertions.assertEquals(expected,actual);

   }

   @Test
    void  cesarTest(){
       String expected = "mjqqc";
       String input = "hellx";
       StringUtil_2 st = new StringUtil_2();
       String actual = st.Cesar(input);
       Assertions.assertEquals(expected,actual);

   }

   @Test
    void subSequenceTest(){
        String str1 = "does not compiles because static methods are not allowed ";
        String str2 = "does nt compiles beca static mhods are not allwed ";
        int expected = 8;
       StringUtil_2 st = new StringUtil_2();
       int actual = st.subSequence(str1,str2);
        Assertions.assertEquals(expected,actual);
   }

}
