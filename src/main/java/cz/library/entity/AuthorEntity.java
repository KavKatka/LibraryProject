package cz.library.entity;

import jakarta.persistence.*;

import java.awt.print.Book;
import java.util.List;

@Entity
public class AuthorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String biography;


    private List<BookEntity> books;
}
