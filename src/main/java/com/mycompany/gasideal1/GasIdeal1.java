/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gasideal1;

/**
 *
 * @author ALUMNO
 */
public class GasIdeal1 {
    
    public double temperatura;
    public double numeroDeMoles;
    private double R = 8.314 ;
    public double volumen;
    

    public static void main(String[] args) {
        GasIdeal1 gas = new GasIdeal1 (100,20 ,5);
        System.out.println("La presion del gas es: " + gas.CalcularPresion() + "atm" );
    }
    
    public GasIdeal1 (double temperatura, double numeroDeMoles, 
            double volumen) 
    {
        this.temperatura = temperatura;
        this.numeroDeMoles = numeroDeMoles;
        this.volumen = volumen;
    }
    
    public double CalcularPresion()
            { 
                return (numeroDeMoles * R * temperatura) / volumen; 
            }

    /**
     * @return the temperatura
     */
    public double getTemperatura() {
        return temperatura;
    }

    /**
     * @param temperatura the temperatura to set
     */
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    /**
     * @return the numeroDeMoles
     */
    public double getNumeroDeMoles() {
        return numeroDeMoles;
    }

    /**
     * @param numeroDeMoles the numeroDeMoles to set
     */
    public void setNumeroDeMoles(double numeroDeMoles) {
        this.numeroDeMoles = numeroDeMoles;
    }

    /**
     * @return the volumen
     */
    public double getVolumen() {
        return volumen;
    }

    /**
     * @param volumen the volumen to set
     */
    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    /**
     * @return the R
     */
    public double getR() {
        return R;
    }

    /**
     * @param R the R to set
     */
    public void setR(double R) {
        this.R = R;
    }
}
