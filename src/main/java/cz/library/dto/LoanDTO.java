package cz.library.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoanDTO {

    @JsonProperty("_id")
    private long id;

    private LocalDate loanDate;

    private LocalDate returnDate;
}
