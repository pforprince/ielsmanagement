package com.ielts.institute.repository;

import com.ielts.enquiry.model.Enquiry;
import com.ielts.institute.model.Institute;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface InstituteRepository extends JpaRepository<Institute, Long> {
    List<Institute> findByContact(String contact);

    List<Institute> findByDateOfCreation(String dateOfCreation);

    List<Institute> findByName(String name);
}
