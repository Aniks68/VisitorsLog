package com.example.staffvisitorproject.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class VisitLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "visitor_id", referencedColumnName = "id", nullable = false)
    private Visitor visitor;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "staff_id", referencedColumnName = "id", nullable = false)
    private Staff staff;

    @Column(name = "reason_for_visit", length = 10485760)
    private String reason;

    @Column(name = "date_of_visit", nullable = false)
    private Date dateOfVisit;
}
