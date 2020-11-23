package com.ielts.enquiry.repository;

import com.ielts.enquiry.model.Enquiry;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EnquiryRepository extends JpaRepository<Enquiry, Long> {
    List<Enquiry> findByContact(String contact);

    List<Enquiry> findByDate(String date);

    List<Enquiry> findByName(String name);

    @Query("select e from Enquiry e inner join Course c where c.name like :course")
    List<Enquiry> findByCourse(@Param("course") String course);

    List<Enquiry> findByMode(String mode);

    List<Enquiry> findByEnquiryStatus(String enquiryStatus);

    List<Enquiry> findByPriority(int priority);
}
