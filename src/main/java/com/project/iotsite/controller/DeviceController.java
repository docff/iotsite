package com.project.iotsite.controller;

import com.project.iotsite.entity.Device;
import com.project.iotsite.repository.DeviceRepository;
import com.project.iotsite.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class DeviceController  {
    @Autowired
    private DeviceService deviceService;

    @GetMapping("/devices")
    public Collection<Device> getAllDevices() {

        return  deviceService.findAll();
    }
}