package com.ddd.shared.util;

import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;

import com.ddd.shared.ConstantsErrors;

public final class StringCheck {

    private StringCheck() {
        throw new AssertionError(ConstantsErrors.NOT_ALLOWED_INSTANTIATE);
    }

    public static boolean isBlankAnyArgument(String... strings) {
        return Arrays.stream(strings).anyMatch(StringUtils::isBlank);
    }
}
