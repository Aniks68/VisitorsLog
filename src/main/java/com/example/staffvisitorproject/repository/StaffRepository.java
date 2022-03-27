package com.example.staffvisitorproject.repository;

import com.example.staffvisitorproject.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff, Long> {
}
