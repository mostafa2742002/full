package com.book_store.full.dto.bookdto;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.io.Serializable;
import lombok.Data;

@Data
@Document(collection = "books")
public class Book implements Serializable{
    
    @Id
    private String  id;
    private String  title;
    private String  author;
    private String  category;
    private String  translator;
    private String  publisher;
    private String  price;
    private String  book_information;
    private String  author_information;
    private String  image;
    private int     buyed;
}