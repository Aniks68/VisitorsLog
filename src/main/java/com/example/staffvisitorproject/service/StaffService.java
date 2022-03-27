package com.example.staffvisitorproject.service;

import com.example.staffvisitorproject.dto.StaffRegDTO;
import com.example.staffvisitorproject.model.Staff;

import java.util.List;

public interface StaffService {
    String loginUser(String username, String password);
    Staff getStaff(Long id);
    List<Staff> getStaffList();
    Staff addStaff(StaffRegDTO staffDetails);
}
