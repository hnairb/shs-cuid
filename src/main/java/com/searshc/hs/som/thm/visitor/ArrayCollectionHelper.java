package com.searshc.hs.som.thm.visitor;

import java.util.Arrays;

/**
 * @author SHI
 * @param <T>
 */
public class ArrayCollectionHelper<T> extends CollectionHelper<T> {
	public T[] arrayT;

	@Override
	public int getSize() {
		return arrayT == null ? 0 : arrayT.length;
	}

	@Override
	public T getElement(int index) {
		return arrayT[index];
	}

	public ArrayCollectionHelper(T[] arrayT) {
		this.arrayT = Arrays.copyOf(arrayT, arrayT.length);
	}
}
