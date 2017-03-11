package leetcode_27_remove_element;

/*
	Given an array and a value, remove all instances of that value in place and return the new length.
	Do not allocate extra space for another array, you must do this in place with constant memory.
	The order of elements can be changed. It doesn't matter what you leave beyond the new length.
	
	Example:
	Given input array nums = [3,2,2,3], val = 3
	Your function should return length = 2, with the first two elements of nums being 2.
 */

public class Question {
	public static void main(String args[]) {
		int nums[] = {3, 2, 3, 2};
		int val = 3;
		
		int result = Solution.removeElement(nums, val);
		
		System.out.print(result);
	}
}
