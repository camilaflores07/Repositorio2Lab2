/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorio2lab2;

import java.util.Calendar;
import javax.swing.JOptionPane;

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
            JOptionPane.showMessageDialog(null, "No existen horas negativas");
            return;
        }
        this.HorasTrabajadas += horas;
        JOptionPane.showMessageDialog(null, "El numero de horas trabajados son: "+ horas);
    }
    
    public double CalculoDePago(){
        int HorasDelMes = 160;
        double SalarioProporcional = (SalarioBase/HorasDelMes)*HorasTrabajadas;
        double SalarioFinal = SalarioProporcional * 0.035;
        return SalarioFinal;
        
    }
    
    public void MostrarInformacion(){
        JOptionPane.showMessageDialog(null,"El nombre del empleado es: " +Nombre);
        JOptionPane.showMessageDialog(null,"El salario base del empleado "+Nombre+" es de: " + SalarioBase);
        JOptionPane.showMessageDialog(null,"El empleado "+ Nombre+ "Trabajo "+HorasTrabajadas+" horas");
        JOptionPane.showMessageDialog(null,"Su salario final es de: "+ CalculoDePago());  
    }
        
    
}
