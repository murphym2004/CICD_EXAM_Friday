package ie.atu.cicd1_exam_friday.Model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Person {
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PersonData {
        @NotBlank
       private  String AttendeeName;
        @NotBlank@Email
       private  String AttendeeEmail;
        @Pattern(regexp = "TK-[0-9]{4}")
        private  String TicketCode;
        @Positive
        private Integer Quantity;
    }
}
