package com.example.staffvisitorproject.repository;

import com.example.staffvisitorproject.model.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitorRepository extends JpaRepository<Visitor, Long> {

}
