package edu.grinnell.csc207.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


import org.junit.jupiter.api.Test;

/**
 * Tests of the sample methods.
 *
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 */
public class TestSampleMethods {
  /**
   * A test that should succeed.
   */
  @Test
  void sampleSuccesfulTest() {
    assertEquals(2, 2);
  } // sampleSuccessfulTest()

  /**
   * A test that should fail.
   */
  void sampleFailingTest() {
    assertEquals(2, 3);
  } // sampleFailingTest()

  @Test
  public void test2() {
    assertEquals(10, 3*5, "stupid test");
  } // test2()
  
  @Test
  public void testCels() {
    assertEquals(32, SampleMethods.c2f(0), "c2f test");
  }

  @Test
  public void testCels2() {
    assertEquals(212, SampleMethods.c2f(100), "c2f test");
  }

  @Test
  public void testCels3() {
    assertEquals(-40, SampleMethods.c2f(-40), "c2f test");
  }

  int[] values = { 1, 2, 3 };
  @Test
  public void testSum() {
    assertEquals(6, SampleMethods.sum(values), "values summation");
  }

  int[] values2 = { 1, 2, 3, 4, 5 };
  @Test
  public void testSum2() {
    assertEquals(15, SampleMethods.sum(values2), "values summation 2");
  }

  int[] values3 = { 5, 5, 0 };
  @Test
  public void testSum3() {
    assertEquals(10, SampleMethods.sum(values3), "values summation 3");
  }

  @Test  
  public void testExtremes() {
    int tmp = Integer.MAX_VALUE - 10;
    int[] values = { tmp, tmp, -tmp, -tmp };
    assertEquals(0, SampleMethods.sum(values), "extreme values");
 } // testExtremes


 @Test
 public void MultiTest() {
  for (int i = 1; i < 5; i ++){
    assertEquals(SampleMethods.expt(2, i), SampleMethods.expt(2, (i-1))*2, "Multi Tests");
  } 
}

@Test
public void MultiTestBase3() {
 for (int i = 1; i < 5; i ++){
   assertEquals(SampleMethods.expt(3, i), SampleMethods.expt(2, (i-1))*3, "Multi Tests");
 } 
}

@Test
public void MultiTestNegative() {
 for (int i = 1; i < 5; i ++){
   assertEquals(SampleMethods.expt(-5, i), SampleMethods.expt(2, (i-1))*-5, "Multi Tests");
 } 
}

/**
   * Check that removeAs works as expected.
   */
  @Test
  public void testRemoveAs() {
    assertEquals("", 
                 SampleMethods.removeAs(""),
                 "empty string");
    assertEquals("hello", 
                 SampleMethods.removeAs("hello"),
                 "no as");
    assertEquals("", 
                 SampleMethods.removeAs("a"),
                 "eliminate one a");
    assertEquals("", 
                 SampleMethods.removeAs("aaaa"),
                 "eliminate many as");
    assertEquals("pin", 
                 SampleMethods.removeAs("pain"),
                 "eliminate one a, short string");
    assertEquals("lphbet", 
                 SampleMethods.removeAs("alphabet"),
                 "eliminate many as, medium string");
    assertEquals("BCDEFGHIJKLMNOPQ",
                 SampleMethods.removeAs("aBaaCDaaaEFGaaaaHIJKaaaaLMNaaaOPaaQa"),
                 "eliminate many as, silly string");
    assertEquals("bbb",
                 SampleMethods.removeAs("aaabbbaaa"),
                 "eliminate prefix and suffix as");
  } // testRemoveAs
} // class TestSampleMethods
