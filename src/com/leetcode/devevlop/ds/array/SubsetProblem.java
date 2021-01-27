package com.leetcode.devevlop.ds.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubsetProblem {

	public List<List<Integer>> subsets(int[] nums) {

		List<List<Integer>> endPairList = new ArrayList<List<Integer>>();
		Set<Integer> powerList = new HashSet<>();
		subsetsHelper(endPairList, new ArrayList<>(), nums, 0);

		return endPairList;

	}

	private void subsetsHelper(List<List<Integer>> list, List<Integer> resultList, int[] nums, int start) {
		list.add(new ArrayList<>(resultList));
		System.out.println("MASTER BRANCH CODE");
		for (int i = start; i < nums.length; i++) {
			// add element
			resultList.add(nums[i]);
			// Explore
			subsetsHelper(list, resultList, nums, i + 1);
			// remove
			resultList.remove(resultList.size() - 1);
		}

	}

	public static void main(String[] args) {

		SubsetProblem problem = new SubsetProblem();
		int[] tCase1 = { 1, 2, 3 };
		List<List<Integer>> outValue = problem.subsets(tCase1);
		System.out.println(outValue);

	}

}
