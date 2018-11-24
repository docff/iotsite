package com.project.iotsite.controllers;

import com.project.iotsite.models.Device;
import com.project.iotsite.repositories.DeviceRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class DeviceController  {


    private DeviceRepository deviceRepository;

    public DeviceController(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    @GetMapping("/devices")
    public Collection<Device> getAllDevices() {
        return  deviceRepository.findAll();
    }



 }

