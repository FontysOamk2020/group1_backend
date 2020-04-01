package com.BoozeBuddies.Bar.Model;

import javax.persistence.*;
import java.util.List;

@Entity()
@Table(name = "bar")
public class Bar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, updatable = false)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "adress", nullable = false)
    private String adress;

    @Column(name = "zipcode", nullable = false)
    private String zipcode;

    @Column(name = "telephone_number")
    private int telephoneNumber;

    @Column(name = "Longitude")
    private int Longitude;

    @Column(name = "latitude")
    private int latitude;

    @ManyToMany()
    @JoinTable(name = "bar_beer", joinColumns = @JoinColumn(name = "bar_id"), inverseJoinColumns = @JoinColumn(name = "beer_id"))
    private List<Beer> beers;

    public Bar() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public int getLongitude() {
        return Longitude;
    }

    public void setLongitude(int longitude) {
        Longitude = longitude;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }
}
