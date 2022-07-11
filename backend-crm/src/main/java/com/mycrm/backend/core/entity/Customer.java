package com.mycrm.backend.core.entity;


import com.mycrm.backend.core.state.CustomerState;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "company_name", length = 100)
    private String companyName;
    @Column(name = "first_name", length = 100)
    private String firstName;
    @Column(name = "last_name", length = 100)
    private String lastName;
    @Column(name = "email", length = 100)
    private String email;
    @Column(name = "phone", length = 20)
    private String phone;
    @Column(name = "address", nullable = false, length = 255)
    private String address;
    @Column(name = "zip_code", length = 12)
    private String zipCode;
    @Column(name = "city", nullable = false, length = 100)
    private String city;

    @Column(name = "country", length = 100)
    private String country;

    // attribut state de l'enum CustomerState
    @Column(name="state", nullable = false, columnDefinition = "INT(1) DEFAULT '0'") // => Sql type Integer valeur par default 0 == INACTIVE
    // ou @ColumnDefault("0")
    @Enumerated(EnumType.ORDINAL) // => Renvoie Integer
    private CustomerState state;

    @OneToMany(mappedBy = "customer") // => Au singulier car il mappe sur la propriété customer de l'intité Order
    private List<Order> orders;

    public Customer() {

    }

    public Customer(String address, String city, String companyName, String country, String email, String firstName, String lastName, String phone, String zipCode, List<Order> orders) {
        this.address = address;
        this.city = city;
        this.companyName = companyName;
        this.country = country;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.zipCode = zipCode;
        this.orders = orders;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public CustomerState getState() {
        return state;
    }

    public void setState(CustomerState state) {
        this.state = state;
    }
    public void setCustomerState(CustomerState state) {
        this.state = state;
    }

    public void setNotNullData(Customer newCustomer) {
        if (newCustomer.getAddress() != null) {
            this.setAddress(newCustomer.getAddress());
        }

        if (newCustomer.getCompanyName() != null) {
            this.setCompanyName(newCustomer.getCompanyName());
        }

        if (newCustomer.getCity() != null) {
            this.setCity(newCustomer.getCity());
        }

        if (newCustomer.getZipCode() != null) {
            this.setZipCode(newCustomer.getZipCode());
        }

        // l'avoir pour tous les champs qu'on veut modifier

    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", companyName='" + companyName + '\'' +
                ", country='" + country + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", state=" + state +
                '}';
    }
}