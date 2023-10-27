/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ENTIDADES;

/**
 *
 * @author Administrador
 */
public class Camisa extends Ropa{
    int precio;
    public Camisa(int precio){
        this.precio= precio;
    } 

    @Override
    public String Texto() {
        String texto = this.tipo +"                ";
        texto = texto.substring(0,10) + " | S/" + this.precio;
        return texto;
    }
}
