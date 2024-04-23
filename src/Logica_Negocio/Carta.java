/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author ASUS
 */
public class Carta {
   
    private int Valor;
    private String Palo;

    public Carta() {
    }

    public Carta(int Valor, String Palo) {
        this.Valor = Valor;
        this.Palo = Palo;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }

    public String getPalo() {
        return Palo;
    }

    public void setPalo(String Palo) {
        this.Palo = Palo;
    }
    
    @Override
    public String toString() {
        return Valor + " de " + Palo;
    }
    
}
