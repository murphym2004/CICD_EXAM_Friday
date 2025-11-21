package ie.atu.cicd1_exam_friday.ExceptionHandler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ExceptionDetails {
    private String fieldName;
    private String fieldValue;

}
