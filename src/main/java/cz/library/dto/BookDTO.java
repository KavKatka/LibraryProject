package cz.library.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import cz.library.entity.AuthorEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {

    @JsonProperty("_id")
    private long id;

    private String title;

    private String genre;

    private Boolean available;

    private AuthorEntity author;
}
