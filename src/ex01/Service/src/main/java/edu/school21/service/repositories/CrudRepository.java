package edu.school21.service.repositories;

import java.sql.SQLException;
import java.util.Optional;
import java.util.List;

public interface CrudRepository<T> {
    Optional<T> findById(Long id) throws SQLException;
    List<T> findAll() throws SQLException;
    void save(T entity) throws SQLException;
    void update(T entity) throws SQLException;
    void delete(Long id) throws SQLException;
}
