package com.ddd.unit.util;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import com.ddd.shared.util.StringCheck;

@RunWith(MockitoJUnitRunner.class)
public class StringCheckTest {

    @Test
    public void testValidatorString() {
	assertTrue(StringCheck.isBlankAnyArgument(""));
	assertTrue(StringCheck.isBlankAnyArgument(" "));
	assertTrue(StringCheck.isBlankAnyArgument(null, null));
	assertTrue(StringCheck.isBlankAnyArgument("test", "", "x", null));
	assertFalse(StringCheck.isBlankAnyArgument("h"));
	assertFalse(StringCheck.isBlankAnyArgument("h", "hola"));
    }

}
