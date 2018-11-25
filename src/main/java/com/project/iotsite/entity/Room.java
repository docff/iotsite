package com.project.iotsite.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Room {
    @Id
    @GeneratedValue
    private long id;
    private long name;

    @OneToMany(mappedBy = "room")
    private List<Device> devices;
}
