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
    double SalarioBase;
    int HorasTrabajadas;

    public Empleado(int CodigoUnico, String Nombre, Calendar FechaContratacion, double SalarioBase, int HorasTrabajadas) {
        this.CodigoUnico = CodigoUnico;
        this.Nombre = Nombre;
        this.FechaContratacion = Calendar.getInstance();
        this.SalarioBase = SalarioBase;
        this.HorasTrabajadas = 0;
    }
    
    public String FechaContratacion(){
        int dia = FechaContratacion.get(Calendar.DAY_OF_MONTH);
        int mes = FechaContratacion.get(Calendar.MONTH);
        int anio = FechaContratacion.get(Calendar.YEAR);
        
        return String.format("%02d/%02d/%04d",dia, mes, anio);
    }
    
    public void RegistroHorasTrabajadas(int horas){
        if (horas<0) {
            System.out.println("No existen horas negativas");
            return;
        }
        this.HorasTrabajadas += horas;
        System.out.println("El numero de horas trabajados son: "+ horas);
    }
    
    public double CalculoDePago(){
        int HorasDelMes = 160;
        double SalarioProporcional = (SalarioBase/HorasDelMes)*HorasTrabajadas;
        double SalarioFinal = SalarioProporcional * 0.035;
        return SalarioFinal;
        
    }
    
    public void MostrarInformacion(){
        System.out.println("El nombre del empleado es: " +Nombre);
        System.out.println("El salario base del empleado "+Nombre+" es de: " + SalarioBase);
        System.out.println("El empleado "+ Nombre+ "Trabajo "+HorasTrabajadas+" horas");
        System.out.println("Su salario final es de: "+ CalculoDePago());
                
        
    }
        
    
}
