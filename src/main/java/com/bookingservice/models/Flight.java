package com.bookingservice.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Objects;

public class Flight {

    private static int countId;
    private int id;
    private int seatsCapacity;
    private int seatsLeft;
    private String cityFrom;
    private String cityTo;
    private LocalDate dateFrom;
    private LocalDate dateTo;
    private double price;

    public Flight(List<Object> params) {
        this.id = countId++;
        this.seatsCapacity = (int) params.get(0);
        this.seatsLeft = this.seatsCapacity;
        this.cityFrom = (String) params.get(1);
        this.cityTo = (String) params.get(2);
        this.dateFrom = LocalDate.parse((String)params.get(3), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        this.dateTo = LocalDate.parse((String)params.get(4), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        this.price = (double) params.get(5);
    }

    public int getId() {
        return id;
    }

    public int getSeatsCapacity() {
        return seatsCapacity;
    }

    public int getSeatsLeft() {
        return seatsLeft;
    }

    public String getCityFrom() {
        return cityFrom;
    }

    public String getCityTo() {
        return cityTo;
    }

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }

    public double getPrice() {
        return price;
    }

    public void setSeatsLeft(int seatsLeft) {
        this.seatsLeft = seatsLeft;
    }

    public void setCityFrom(String cityFrom) {
        this.cityFrom = cityFrom;
    }

    public void setCityTo(String cityTo) {
        this.cityTo = cityTo;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", seatsCapacity=" + seatsCapacity +
                ", seatsLeft=" + seatsLeft +
                ", cityFrom='" + cityFrom + '\'' +
                ", cityTo='" + cityTo + '\'' +
                ", dateFrom=" + dateFrom +
                ", dateTo=" + dateTo +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return id == flight.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}