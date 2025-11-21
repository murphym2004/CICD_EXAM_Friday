package ie.atu.cicd1_exam_friday.Controller;

import ie.atu.cicd1_exam_friday.Model.Person;
import ie.atu.cicd1_exam_friday.Service.PersonService;
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
        if
    }
}
