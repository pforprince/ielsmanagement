package com.ielts.institute.service;

import com.ielts.institute.model.Institute;
import com.ielts.institute.repository.InstituteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class InstituteService {

    @Autowired
    private InstituteRepository repo;

    @Transactional
    public long saveOrUpdate(Institute institute) {
        return repo.save(institute).getId();
    }

    @Transactional
    public void delete(Institute institute) {
        repo.delete(institute);
    }

    @Transactional
    public List<Institute> findAll() {
        return repo.findAll();
    }

    @Transactional
    public List<Institute> findByContact(String contact) {
        return repo.findByContact(contact);
    }

    @Transactional
    public List<Institute> findByDateOfCreation(String date) {
        return repo.findByDateOfCreation(date);
    }

    @Transactional
    public Institute findById(long id) {
        return repo.findById(id).orElse(new Institute());
    }

    @Transactional
    public List<Institute> findByName(String name) {
        return repo.findByName(name);
    }
}
