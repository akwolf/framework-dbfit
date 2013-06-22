package com.justsy.dbfit.dao;

import java.util.List;

/**
 * @author zhangh
 * @createTime 2013-5-31 下午4:12:26
 */
public interface MapperOperation<T> {

	void insert(T t);

	void update(T t);

	void delete(T t);

	T searchById(int id);

	List<T> search(T t);

	int searchCount(T t);
}
