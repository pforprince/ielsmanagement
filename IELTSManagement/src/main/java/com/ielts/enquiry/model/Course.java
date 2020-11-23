package com.ielts.enquiry.model;

import java.util.Arrays;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String duration;
    private byte[] syllabusPdf;
    private int noOfClasses;
    private double fees;

    public Course() {
    }

    public Course(long id, String name, String duration, byte[] syllabusPdf, int noOfClasses, double fees) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.syllabusPdf = syllabusPdf;
        this.noOfClasses = noOfClasses;
        this.fees = fees;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public byte[] getSyllabusPdf() {
        return syllabusPdf;
    }

    public void setSyllabusPdf(byte[] syllabusPdf) {
        this.syllabusPdf = syllabusPdf;
    }

    public int getNoOfClasses() {
        return noOfClasses;
    }

    public void setNoOfClasses(int noOfClasses) {
        this.noOfClasses = noOfClasses;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", duration='" + duration + '\'' +
                ", syllabusPdf=" + Arrays.toString(syllabusPdf) +
                ", noOfClasses=" + noOfClasses +
                ", fees=" + fees +
                '}';
    }
}
