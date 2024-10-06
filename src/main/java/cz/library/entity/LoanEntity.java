package cz.library.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class LoanEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private LocalDate loanDate;

    @Column(nullable = false)
    private LocalDate returnDate;

    private BookEntity book;

    private ReaderEntity reader;
}
