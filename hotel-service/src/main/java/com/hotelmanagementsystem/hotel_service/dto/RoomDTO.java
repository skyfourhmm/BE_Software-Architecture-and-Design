package com.hotelmanagementsystem.hotel_service.dto;

import java.math.BigDecimal;
import java.util.List;

public class RoomDTO {
    private String number;
    private Integer floor;
    private String roomType;
    private BigDecimal price;
    private String status;
    private List<String> amenities;

    // Constructor mặc định
    public RoomDTO() {
    }

    // Getters và Setters
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getAmenities() {
        return amenities;
    }

    public void setAmenities(List<String> amenities) {
        this.amenities = amenities;
    }
}