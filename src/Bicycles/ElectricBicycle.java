/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bicycles;

/**
 *
 * @author rodol
 */
public class ElectricBicycle extends Bicycle{
    
    private String nivelBateria;

    public String getNivelBateria() {
        return nivelBateria;
    }
    
    public void setNivelBateria(String nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    public ElectricBicycle(int id, String brand) {
        super(id, brand);
        this.nivelBateria = "100%";
    }

    @Override
    public String toString() {
        return "\nElectric Bicycle: " + super.toString() +  "\nNivel Bateria: " + nivelBateria;
    }
    
    
    
}
