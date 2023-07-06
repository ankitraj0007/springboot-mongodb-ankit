package com.learnwithankit.springbootmongodbankit.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collation = "Book")
public class Book {

    @Id
    private int id;
    private String bookName;
    private String authorName;

}
