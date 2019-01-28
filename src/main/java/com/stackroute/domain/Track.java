package com.stackroute.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;




@Document(collection = "Tracks")
//@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Track {

    @Id
    private int id;
    private String name;
    private String comment;


}
