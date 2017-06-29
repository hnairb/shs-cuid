package com.searshc.hs.som.thm.visitor;

import java.util.List;

/**
 * @author SHI
 */
public final class CollectionHelperFactory {

	private CollectionHelperFactory() {}

	/**
	 * @param array
	 * @return
	 */
	public static <T> CollectionHelper<T> createCollectionHelper(T[] array) {
		return new ArrayCollectionHelper<T>(array);
	}

	/**
	 * @param list
	 * @return
	 */
	public static <T> CollectionHelper<T> createCollectionHelper(List<T> list) {
		return new ListCollectionHelper<T>(list);
	}
}
