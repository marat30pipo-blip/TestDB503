package oop.repositories;

import oop.entities.User;

import java.sql.SQLException;
import java.util.List;

public interface UserRepository extends CrudRepository<User> {
    List<User> findAllByAge(Integer age);
    void saveSixSeven() throws SQLException;
    List<User> findByAgeNumberN(Integer n) throws SQLException;

}
