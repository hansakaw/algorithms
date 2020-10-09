
/**
 * PROJECT NAME
 *    max-product
 *
 * FILE NAME
 *    Tests.java
 *
 * CREATED ON
 *    Apr 28, 2016 4:08:16 PM
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
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * <p>
 * Test Solution.
 * </p>
 *
 * @author Hansaka Weerasingha
 *
 * @version $Id$
 */
@RunWith(JUnit4.class)
public class Tests {

	private Solution solution;

	/**
	 * Set up test environment.
	 */
	@Before
	public void setUp() {
		solution = new Solution();
	}

	/**
	 * Test method for {@link Solution#MaximalProduct(int)}.
	 */
	@Test
	public final void testMaximalProduct() {
		assertEquals(18, solution.MaximalProduct(8));
		assertEquals(9, solution.MaximalProduct(6));
		assertEquals(36, solution.MaximalProduct(10));
	}

	/**
	 * Test method for {@link Solution#MaximalProduct(int)}.
	 */
	@Test
	public final void testForInvalidInputs() {
		assertEquals(0, solution.MaximalProduct(0));
		assertEquals(0, solution.MaximalProduct(-1));
		assertEquals(0, solution.MaximalProduct(1));
	}

}
