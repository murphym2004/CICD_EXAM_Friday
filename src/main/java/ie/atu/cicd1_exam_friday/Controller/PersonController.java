package ie.atu.cicd1_exam_friday.Controller;

import ie.atu.cicd1_exam_friday.Model.Person;
import ie.atu.cicd1_exam_friday.Service.PersonService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Event_Registraion_person")
public class PersonController {
    private final PersonService Service;
    public PersonController(PersonService Service) {
        this.Service = Service;
    }

    @GetMapping
    public ResponseEntity<List<Person>> GetAllPerson(){
        return ResponseEntity.ok(Service.findAll());
    }

    @GetMapping("/{Ticketcode}")
    public ResponseEntity<Person> Getone(@PathVariable String TicketCode){
        Optional<Person>maybe = Service.findById(TicketCode);
        if (maybe.isPresent()){
            return ResponseEntity.ok(maybe.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Person> AddPerson(@RequestBody Person person){
        Person created = Service.create(person);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @DeleteMapping("/Delete")
    public ResponseEntity<Person> DeletePerson(@PathVariable String TicketCode){
        Optional<Person>maybe = Service.findById(TicketCode);
        if (maybe.isPresent()){
            Service.delete(String.valueOf(maybe.get()));
            return ResponseEntity.ok(maybe.get());
        }
      return ResponseEntity.notFound().build();

    }
@PutMapping("/update Quantity")
   public ResponseEntity<Person> UpdateQuantity(@RequestBody Person person){
       Optional<Person>maybe = Service.findById(String Ticket);
        if (maybe.isPresent()){
            Person update = maybe.get();
            Service.update(update);
            return ResponseEntity.ok(update);
        }
        return ResponseEntity.notFound().build();

}


}

