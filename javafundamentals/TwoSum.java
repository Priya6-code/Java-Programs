package javafundamentals;
import java.util.*;
public class TwoSum {
	
	public int[]  TwoSumBruteForce(int[] nums,int target) {
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]+nums[j]==target) {
					return new int[] {i,j};
				}
			}
		}
		return new int[] {};
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoSum obj=new TwoSum();
		int[] nums= {10,4,8,2};
		int target=6;
		int[] res=obj.TwoSumBruteForce(nums, target);
		System.out.println("Two Sum"+Arrays.toString(res));

	}

}
