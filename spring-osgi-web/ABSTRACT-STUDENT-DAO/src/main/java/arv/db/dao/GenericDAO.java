package arv.db.dao;

import java.util.Collection;

public interface GenericDAO<T> {
   /* T save(T object);
    T update(T object);
	void delete(T object);
    T get(String id);*/
    Collection<T> getAll();
}