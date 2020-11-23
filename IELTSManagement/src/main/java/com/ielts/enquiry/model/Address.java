package com.ielts.enquiry.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String city;
    private String state;
    private String landmark;
    private String roadOrLane;
    private String country;
    private String pinCode;

    public Address() {
    }

    public Address(long id, String city, String state, String landmark, String roadOrLane, String country, String pinCode) {
        this.id = id;
        this.city = city;
        this.state = state;
        this.landmark = landmark;
        this.roadOrLane = roadOrLane;
        this.country = country;
        this.pinCode = pinCode;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getRoadOrLane() {
        return roadOrLane;
    }

    public void setRoadOrLane(String roadOrLane) {
        this.roadOrLane = roadOrLane;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", landmark='" + landmark + '\'' +
                ", roadOrLane='" + roadOrLane + '\'' +
                ", country='" + country + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }
}
