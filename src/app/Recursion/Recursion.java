package app.Recursion;

import java.math.BigInteger;

/**
 * Recursion
 */
public class Recursion {
  private static int max = 0;
  private static int counter = -1, _counter = 0, __counter = 0;

  /**
   * find the factorial of a number
   * 
   * @param number
   * @return
   */
  public static int factorial(int number) {
    if(number == 1)
      return 1;
    return number * factorial(number - 1);
  }

  /**
   * BigInteger version of factorial for arbitrarily large number
   * 
   * @param arr
   * @return
   */
  public static BigInteger factorial(BigInteger n) {
    if(n.equals(BigInteger.ONE))
      return BigInteger.ONE;
    return n.multiply(factorial(n.subtract(BigInteger.ONE)));
  }

  /**
   * find the sum of a given array
   * 
   * @param arr
   * @return
   */
  public static int getSum(int[] arr) {
    if(counter == arr.length - 1)
      return 0;
    counter++;
    return arr[counter] + getSum(arr);
  }


  /**
   * find total count of items in an array
   * 
   * @param arr
   * @return
   */
  public static int getCount(int[] arr) {
    if(_counter == arr.length) {
      return 0;
    }
    _counter++;
    return 1 + getCount(arr);
  }

  /**
   * find the maximum number in an array
   * 
   * @param arr
   * @return
   */
  public static int getMaxNumber(int[] arr) {
    if(__counter == arr.length)
      return 0;
    if(arr[__counter] > max)
      max = arr[__counter];
    __counter++;
    getMaxNumber(arr);
    
    return max;
  }
}