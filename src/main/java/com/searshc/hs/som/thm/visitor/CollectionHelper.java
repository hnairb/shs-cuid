package com.searshc.hs.som.thm.visitor;


/**
 * @author SHI
 * @param <T>
 */
public abstract class CollectionHelper<T> {
	public abstract int getSize();

	public abstract T getElement(int index);

	/**
	 * @param visitor
	 */
	public void visitCollection(Visitor<T> visitor) {
		for (int i = 0; i < getSize(); i++) {
			visitor.visit(getElement(i));
		}
	}
}
