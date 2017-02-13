package com.manoj.designpatterns.monad;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

public class Validator<T> {

	T type;

	/**
	 * List of exception thrown during validation.
	 */
	private final List<Throwable> exceptions = new ArrayList<>();

	public Validator(T type) {
		super();
		this.type = type;
	}

	public static <T> Validator<T> of(T t) {
		return new Validator<T>(Objects.requireNonNull(t));

	}

	public Validator<T> validate(Predicate<T> function, String exceptionMessage) {
		if (!function.test(type)) {

			exceptions.add(new IllegalStateException(exceptionMessage));
		}
		return this;
	}

	public <U> Validator<T> validate(Function<T, U> projection,
			Predicate<U> validation, String message) {
		return validate(projection.andThen(validation::test)::apply, message);
	}

	public T get() throws IllegalStateException {
		if (exceptions.isEmpty()) {
			return type;
		}
		IllegalStateException e = new IllegalStateException();
		exceptions.forEach(e::addSuppressed);
		throw e;
	}
}
