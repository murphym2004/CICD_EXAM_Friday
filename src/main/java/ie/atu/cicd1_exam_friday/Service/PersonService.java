package ie.atu.cicd1_exam_friday.Service;

import ie.atu.cicd1_exam_friday.Model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    private final List<Person> store = new ArrayList<Person>();
    public List<Person> findAll() {
        return new ArrayList<>(store);
    }
    public Optional<Person> findById(String Ticket) {
        for (Person person : store){
            if (person.getClass().equals(Person.class)){
                return Optional.of(person);
            }

        }
        return Optional.empty();
    }
    public Person create(Person person) {
        if(findById(String.valueOf(person.getClass())).isPresent()){
            throw new IllegalArgumentException("Person already exists");
        }
        store.add(person);return  person;
    }

    public Person delete(String Ticket) {
        Optional<Person> person = findById(Ticket);
        if(person.isPresent()){
            store.remove(person.get());
            return person.get();
        }
        throw new IllegalArgumentException("Person does not exist");

    }
    public Optional<Person> update(Person person) {
        if(findById(String.valueOf(person.getClass())).isPresent()){
            throw new IllegalArgumentException("Person already exists");
        }
        store.add(person);
        return Optional.of(person);
    }

}
