package com.project.iotsite.controller;

import com.project.iotsite.entity.Room;
import com.project.iotsite.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class RoomController {

    @Autowired
    private RoomService roomService;

    @GetMapping("/rooms")
    public Collection<Room> getAllRooms() {

        return roomService.findAll();
    }
}