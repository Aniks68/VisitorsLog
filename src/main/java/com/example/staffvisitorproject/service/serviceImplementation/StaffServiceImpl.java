package com.example.staffvisitorproject.service.serviceImplementation;

import com.example.staffvisitorproject.dto.StaffRegDTO;
import com.example.staffvisitorproject.model.Staff;
import com.example.staffvisitorproject.repository.StaffRepository;
import com.example.staffvisitorproject.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {
    private final StaffRepository staffRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public StaffServiceImpl(StaffRepository staffRepository, ModelMapper modelMapper) {
        this.staffRepository = staffRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public String loginUser(LoginRequest request) {
        staffRepository.findByUsernameAndPassword()
        return null;
    }

    @Override
    public Staff getStaff(Long id) {
        return staffRepository.getById(id);
    }

    @Override
    public List<Staff> getStaffList() {
        return staffRepository.findAll();
    }

    @Override
    public Staff addStaff(StaffRegDTO staffDetails) {
        final Staff staff = staffRepository.findByEmailAddress(staffDetails.getEmail()).orElse(null);

        if (staff.equals(null)) {
            final Staff newStaff = staffRepository.save(modelMapper.map(staffDetails, Staff.class));
            return newStaff;
        }
        return null;
    }
}
