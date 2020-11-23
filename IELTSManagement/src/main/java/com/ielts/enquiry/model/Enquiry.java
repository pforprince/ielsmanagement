package com.ielts.enquiry.model;

import com.ielts.course.model.Course;
import com.ielts.institute.model.Institute;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "enquiry")
public class Enquiry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String contact;
    private String emailid;
    private String date;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(unique = true)
    private Address address;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(unique = true)
    private Course course;
    private String sourceOfInfo;
    private String mode;
    private String interestStatus;
    private String enquiryStatus;
    private int priority;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(unique = true)
    private Institute institute;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(unique = true)
    private List<FollowUp> followUps;

    public Enquiry() {
    }

    public Enquiry(long id, String name, String contact, String emailid, String date, Address address, Course course, String sourceOfInfo, String mode, String interestStatus, String enquiryStatus, int priority, Institute institute, List<FollowUp> followUps) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.emailid = emailid;
        this.date = date;
        this.address = address;
        this.course = course;
        this.sourceOfInfo = sourceOfInfo;
        this.mode = mode;
        this.interestStatus = interestStatus;
        this.enquiryStatus = enquiryStatus;
        this.priority = priority;
        this.institute = institute;
        this.followUps = followUps;
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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getSourceOfInfo() {
        return sourceOfInfo;
    }

    public void setSourceOfInfo(String sourceOfInfo) {
        this.sourceOfInfo = sourceOfInfo;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getInterestStatus() {
        return interestStatus;
    }

    public void setInterestStatus(String interestStatus) {
        this.interestStatus = interestStatus;
    }

    public String getEnquiryStatus() {
        return enquiryStatus;
    }

    public void setEnquiryStatus(String enquiryStatus) {
        this.enquiryStatus = enquiryStatus;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Institute getInstitute() {
        return institute;
    }

    public void setInstitute(Institute institute) {
        this.institute = institute;
    }

    public List<FollowUp> getFollowUps() {
        return followUps;
    }

    public void setFollowUps(List<FollowUp> followUps) {
        this.followUps = followUps;
    }

    @Override
    public String toString() {
        return "Enquiry{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                ", emailid='" + emailid + '\'' +
                ", date='" + date + '\'' +
                ", address=" + address +
                ", course=" + course +
                ", sourceOfInfo='" + sourceOfInfo + '\'' +
                ", mode='" + mode + '\'' +
                ", interestStatus='" + interestStatus + '\'' +
                ", enquiryStatus='" + enquiryStatus + '\'' +
                ", priority=" + priority +
                ", institute=" + institute +
                ", followUps=" + followUps +
                '}';
    }
}