package com.project.iotsite.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Type {
    @Id
    @GeneratedValue
    private long id;
    private String name;

    @OneToMany(mappedBy = "type")
    private List<Device> devices;

    public Type() {
    }

    public Type(String name, List<Device> devices) {
        this.name = name;
        this.devices = devices;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }
}
