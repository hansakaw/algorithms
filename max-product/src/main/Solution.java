/**
 * PROJECT NAME
 *    find-max-product
 *
 * FILE NAME
 *    Solution.java
 *
 * CREATED ON
 *    Apr 28, 2016 4:07:02 PM
 *
 * COPYRIGHT
 *    Copyright © attune Lanka (Private) Limited. All rights reserved.
 *    No part of this publication may be reproduced, transmitted, transcribed,
 *    stored in a retrieval system, or translated into any language,
 *    in any form or by any means, electronic, mechanical, photocopying,
 *    recording, or otherwise, without prior written permission from attune.
 *
 *    All copyright, confidential information, patents, design rights and
 *    all other intellectual property rights of whatsoever nature in and
 *    to any source code contained herein (including any header files and
 *    demonstration code that may be included), are and shall remain the sole and
 *    exclusive property of attune.
 *
 *    The information furnished herein is believed to be accurate and reliable.
 *    However, no responsibility is assumed by attune for its use, or for any
 *    infringements of patents or other rights of third parties resulting from its use.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * Takes a positive integer, N, and returns the maximal product of a set of
 * positive integers whose sum is N. Invalid inputs will return 0, that is
 * non-positive integers or any integer where no set of at least 2 positive
 * addends exists.
 *
 * For example:
 *
 * Given 8, the result is 18
 *
 * 8 can be written as 2+2+2+2 whose product is 16. However, it can also be
 * written as 3+3+2 whose product is 18.
 * </p>
 *
 * @author Hansaka Weerasingha
 *
 * @version $Id$
 */
public class Solution {
	private List<Integer[]> intList = new ArrayList<>();

	public int MaximalProduct(final int input) {
		// Your code goes here
		// Clear variables
		intList = new ArrayList<>();

		int ans = 0;
		if (input < 1) {
			ans = 0;
		}

		partition(input, input, new Integer[1]);
		for (final Integer[] ints : intList) {
			if (ans == 0) {
				ans = getProduct(ints);
			} else {
				final int product = getProduct(ints);
				if (product > ans) {
					ans = product;
				}
			}
		}
		System.out.println("Product : " + ans);
		return ans;
	}

	private void partition(final int n, final int max, final Integer[] parts) {
		if (n == 0) {
			System.out.println(Arrays.toString(parts));
			if (parts.length > 2) {
				intList.add(parts);
			}
			return;
		}

		for (int i = Math.min(max, n); i >= 1; i--) {
			parts[parts.length - 1] = i;
			final Integer[] partsCopy = Arrays.copyOf(parts, parts.length + 1);
			partition(n - i, i, partsCopy);
		}
	}

	private int getProduct(final Integer[] ints) {
		int ans = 0;
		for (final Integer i : ints) {
			if (i != null && i > 0) {
				if (ans == 0) {
					ans = i;
				} else {
					ans *= i;
				}
			}
		}
		return ans;
	}
}
