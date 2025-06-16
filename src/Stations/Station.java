/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stations;

import Bicycles.Bicycle;

/**
 *
 * @author rodol
 */
public class Station {
    
    private int id;
    private String location;
    private int maxCapacity;
    private Bicycle[] bicycles;

    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public Bicycle[] getBicycleList() {
        return bicycles;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    public void addBicycle(Bicycle bicycle) {
        for (int i = 0; i < maxCapacity; i++) {
            if(bicycles[i] == null) {
                bicycles[i] = bicycle;
                break;
            }
        }
    }

    public Station(int id, String location, int maxCapacity) {
        this.id = id;
        this.location = location;
        this.maxCapacity = maxCapacity;
        this.bicycles = new Bicycle[maxCapacity];
    }

    @Override
    public String toString() {
        return "Station: " + " Id: " + id + " Location: " + location + " Max Capacity: " + maxCapacity;
    }
}
