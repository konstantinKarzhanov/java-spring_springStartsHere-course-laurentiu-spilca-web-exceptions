package com.practice.service;

import com.practice.exception.CustomException;
import com.practice.model.Person;
import com.practice.repository.PersonRepositoryList;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    private final PersonRepositoryList personRepositoryList;

    public PersonService(PersonRepositoryList personRepositoryList) {
        this.personRepositoryList = personRepositoryList;
    }

    public List<Person> findAllPeople() throws CustomException {
        throw new CustomException("some custom exception: findAllPeople()");
//        return this.personRepositoryList.findAllPeople();
    }

    public Optional<Person> findPersonById(int id) throws CustomException {
        throw new CustomException("some custom exception: findPersonById()");
//        return this.personRepositoryList.findPersonById(id);
    }
}
