package com.minderest.shared.util;

import java.util.Optional;
import java.util.function.Supplier;

import com.minderest.shared.core.InstantiateForbidden;

public final class NestedNullCheck extends InstantiateForbidden {

    public static final <T> Optional<T> resolve(Supplier<T> resolver) {
	try {
	    T result = resolver.get();
	    return Optional.ofNullable(result);
	} catch (NullPointerException e) {
	    return Optional.empty();
	}
    }

}