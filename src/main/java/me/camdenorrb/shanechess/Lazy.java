package me.camdenorrb.shanechess;


import me.camdenorrb.shanechess.types.Producer;


// Lazily initialized
public final class Lazy<T> {

	private T value;

	private final Producer<T> producer;


	public Lazy(final Producer<T> producer) {
		this.producer = producer;
	}


	public T invoke() {

		if (value == null) {
			value = producer.invoke();
		}

		return value;
	}

}
