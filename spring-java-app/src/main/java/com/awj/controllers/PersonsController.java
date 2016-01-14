package com.awj.controllers;

import com.awj.dal.Repository;
import com.awj.models.Person;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Radu on 14/01/16.
 */
@RestController
@CrossOrigin
public class PersonsController {
    private Repository<Person> personRepository;

    public PersonsController(){
        personRepository = new Repository<Person>();

        personRepository.add(new Person(1, "Gica", "Hagi", "Romania", "Bucharest", "Lia Manoliu", 46));
        personRepository.add(new Person(2, "Zinedide", "Zidane", "France", "Paris", "Charles de Gaulle", 20));
    }

    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public List<Person> getAll(){
        return personRepository.getAll();
    }

    @RequestMapping(value = "/person/create", method = RequestMethod.POST)
    public void createPerson(@RequestBody Person person){
        personRepository.add(person);
    }

    @RequestMapping(value = "person/delete", method = RequestMethod.DELETE)
    public void deletePerson(@RequestBody Integer id){
        personRepository.delete(id);
    }

    @RequestMapping(value = "person/update", method = RequestMethod.PUT)
    public void updatePerson(@RequestBody Person person){
        personRepository.update(person);
    }
}