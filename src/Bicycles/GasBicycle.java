/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bicycles;
/**
 *
 * @author rodol
 */
public class GasBicycle extends Bicycle{
    
    private String nivelCombustible;

    public String getNivelCombustible() {
        return nivelCombustible;
    }

    public void setNivelCombustible(String nivelCombustible) {
        this.nivelCombustible = nivelCombustible;
    }

    public GasBicycle(int id, String brand) {
        super(id, brand);
        this.nivelCombustible = "50";
    }

    @Override
    public String toString() {
        return "\nGas Bicycle: " + super.toString() + "\nNivel Combustible: " + nivelCombustible;
    }
    
    
    
}
