package com.mingyuchoo.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@Entity
public class MyEntity {
    @Id @GeneratedValue private int id;
    private String firstName;
    private String lastName;
}
