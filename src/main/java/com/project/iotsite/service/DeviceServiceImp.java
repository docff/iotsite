package com.project.iotsite.service;

        import com.project.iotsite.entity.Device;
        import com.project.iotsite.repository.DeviceRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

        import java.util.List;

@Service
public class DeviceServiceImp implements DeviceService {
    @Autowired
    private DeviceRepository divRep;

    @Override
    public List<Device> findByname(String name) {
        return divRep.findByname(name);
    }

    @Override
    public List<Device> findAll() {
        return divRep.findAll();
    }

    @Override
    public Device save(Device d) {
        return divRep.save(d);
    }

    @Override
    public void delete(Long id) {
        divRep.deleteById(id);
    }

    @Override
    public void delete(Device d) {
        divRep.delete(d);
    }

    @Override
    public Device findById(long id) {
        return divRep.findById(id);
    }

    @Override
    public List<Device> findAllByRoomId(long id) {return divRep.findAllByRoomId(id); }
}