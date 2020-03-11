package app;

import app.Queue.Queue;
import app.Recursion.Recursion;
import app.Stack.GenericStack;

import java.math.BigInteger;
import java.util.Arrays;

import app.BinarySearch.BinarySearch;
import app.SelectionSort.SelectionSort;

public class App {
    public static void main(String[] args) throws Exception {
        /**
         * Stack
         */
        // GenericStack<Integer> stack = new GenericStack<>();
        // the following int values will be autoboxed to Integer(2)
        // stack.push(2);
        // stack.push(4);
        // stack.push(6);
        // stack.push(8);

        // System.out.println(stack.pop());

        /**
         * Queue
         */
        // Queue queue = new Queue();
        // queue.enqueue(1);
        // queue.enqueue(2);
        // queue.enqueue(3);

        // System.out.println(queue.dequeue());
        // System.out.println(queue.dequeue());
        // queue.dequeue();
        // queue.dequeue();

        // queue.showQueue();

        /**
         * Binary search
         */
        // int result = BinarySearch.binarySearch(new int[]{1, 3, 4, 7, 8, 10}, 8);
        // System.out.println(result);

        /**
         * Selection Sort
         */
        // int[] smallestValue = SelectionSort.findSmallest(new int[]{5, 3, 6, 2, 10});
        // System.out.println(Arrays.toString(smallestValue));

        /**
         * Recursion
         */
        // int factorial = Recursion.factorial(30);
        // System.out.println(factorial);

        // BigInteger factorial = Recursion.factorial(BigInteger.valueOf(50));
        // System.out.println(factorial);

        // int sum = Recursion.getSum(new int[]{1, 2, 3, 4, 5, 15});
        // System.out.println(sum);

        // int count = Recursion.getCount(new int[]{1, 2, 3});
        // System.out.println(count);

        // int max = Recursion.getMaxNumber(new int[]{1, 3, 4, 7, 8, 10});
        // System.out.println(max);
    }
}