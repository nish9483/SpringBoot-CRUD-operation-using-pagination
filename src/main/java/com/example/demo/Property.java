package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Property {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String place;
    private int area;
    private int bedrooms;
    private int bathrooms;
    private String nearbyAmenities;
    private Long sellerId;
	public Property(int id, String place, int area, int bedrooms, int bathrooms, String nearbyAmenities,
			Long sellerId) {
		super();
		this.id = id;
		this.place = place;
		this.area = area;
		this.bedrooms = bedrooms;
		this.bathrooms = bathrooms;
		this.nearbyAmenities = nearbyAmenities;
		this.sellerId = sellerId;
	}
	@Override
	public String toString() {
		return "Property [id=" + id + ", place=" + place + ", area=" + area + ", bedrooms=" + bedrooms + ", bathrooms="
				+ bathrooms + ", nearbyAmenities=" + nearbyAmenities + ", sellerId=" + sellerId + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public int getBedrooms() {
		return bedrooms;
	}
	public void setBedrooms(int bedrooms) {
		this.bedrooms = bedrooms;
	}
	public int getBathrooms() {
		return bathrooms;
	}
	public void setBathrooms(int bathrooms) {
		this.bathrooms = bathrooms;
	}
	public String getNearbyAmenities() {
		return nearbyAmenities;
	}
	public void setNearbyAmenities(String nearbyAmenities) {
		this.nearbyAmenities = nearbyAmenities;
	}
	public Long getSellerId() {
		return sellerId;
	}
	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

    

}


