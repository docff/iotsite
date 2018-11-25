package com.project.iotsite.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Role {
    @Id
    @GeneratedValue
    private long id;
    private String name;

    @OneToMany(mappedBy = "id")
    private List<User> users;

}
