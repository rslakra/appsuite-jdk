package com.devamatre.appsuite.jdk8.utils;

import java.util.Set;

/**
 * @author Rohtash Lakra (work.lakra@gmail.com)
 * @version 1.0.0
 * @since 05/20/2024 5:46 PM
 */
public interface Multiset<E> extends Set<E> {

    /**
     * Returns the frequency of provided key (E) in this set.  If this
     * set contains more than {@code Integer.MAX_VALUE} elements, returns
     * {@code Integer.MAX_VALUE}.
     *
     * @param key
     * @return the number of elements in this set (its cardinality)
     * @return
     */
    int count(E key);


}
