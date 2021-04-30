package com.dicodes.demo.dao;

import com.dicodes.demo.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {
    public int insertPerson(UUID id, Person person); // define method to insert person by id

    // define a default method that adds/inserts/creates a person
    // with random UUID id to the db
    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person); // calls the insertPerson() method passing args: id, person
    }

    List<Person> selectAllPeople();

    Optional<Person> selectPersonById(UUID id);

    int updatePersonById(UUID id, Person person);

    int deletePersonById(UUID id);

}
