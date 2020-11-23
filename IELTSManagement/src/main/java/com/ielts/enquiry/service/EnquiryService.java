package com.ielts.enquiry.service;

import com.ielts.enquiry.model.Enquiry;
import com.ielts.enquiry.repository.EnquiryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EnquiryService {
    @Autowired
    private EnquiryRepository repo;

    @Transactional
    public long saveOrUpdate(Enquiry enquiry) {
        return repo.save(enquiry).getId();
    }

    @Transactional
    public void delete(Enquiry enquiry) {
        repo.delete(enquiry);
    }

    @Transactional
    public List<Enquiry> findAll() {
        return repo.findAll();
    }

    @Transactional
    public List<Enquiry> findByContact(String contact) {
        return repo.findByContact(contact);
    }

    @Transactional
    public List<Enquiry> findByDate(String date) {
        return repo.findByDate(date);
    }

    @Transactional
    public Enquiry findById(long id) {
        return repo.findById(id).orElse(new Enquiry());
    }

    @Transactional
    public List<Enquiry> findByName(String name) {
        return repo.findByName(name);
    }

    @Transactional
    public List<Enquiry> findByCourse(String course) {
        return repo.findByCourse(course);
    }

    @Transactional
    public List<Enquiry> findByMode(String mode) {
        return repo.findByMode(mode);
    }

    @Transactional
    public List<Enquiry> findByEnquiryStatus(String enquiryStatus) {
        return repo.findByEnquiryStatus(enquiryStatus);
    }

    @Transactional
    public List<Enquiry> findByPriority(int priority) {
        return repo.findByPriority(priority);
    }

    @Transactional
    public List<Enquiry> findByInstitute(String institute) {
        return repo.findByInstitute(institute);
    }
}
