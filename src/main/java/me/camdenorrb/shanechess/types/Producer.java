package me.camdenorrb.shanechess.types;

@FunctionalInterface
public interface Producer<T> {

	T invoke();

}
