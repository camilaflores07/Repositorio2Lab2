/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorio2lab2;

import java.util.Calendar;

public class Empleado {
    int CodigoUnico;
    String Nombre;
    Calendar FechaContratacion;

    public Empleado(int CodigoUnico, String Nombre, Calendar FechaContratacion) {
        this.CodigoUnico = CodigoUnico;
        this.Nombre = Nombre;
        this.FechaContratacion = Calendar.getInstance();
    }
    
    public String FechaContratacion(){
        int dia = FechaContratacion.get(Calendar.DAY_OF_MONTH);
        int mes = FechaContratacion.get(Calendar.MONTH);
        int anio = FechaContratacion.get(Calendar.YEAR);
        
        return String.format("%02d/%02d/%04d",dia, mes, anio);
    }
        
    
}
