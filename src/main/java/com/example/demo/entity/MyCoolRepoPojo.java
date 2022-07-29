package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "HELLO")
public class MyCoolRepoPojo implements Serializable {
    @Id private int id;
    private String name;
}
