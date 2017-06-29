package com.searshc.hs.som.thm.visitor;

import java.util.List;

/**
 * @author SHI
 * @param <T>
 */
public class ListCollectionHelper<T> extends CollectionHelper<T> {
	private List<T> list;

	public ListCollectionHelper(List<T> list) {
		this.list = list;
	}

	@Override
	public T getElement(int index) {
		return list.get(index);
	}

	@Override
	public int getSize() {
		return list == null ? 0 : list.size();
	}
}
