/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorio2lab2;

import java.util.Calendar;

/**
 *
 * @author Maria Gabriela
 */
public class EmpleadosVentas extends Empleado{
     private int[] ventasmen;
    private double tasacomision;

    public EmpleadosVentas(int CodigoUnico, String Nombre, double SalarioBase, int HorasTrabajadas, double tasaComision) {
        super(CodigoUnico, Nombre, SalarioBase,FechaContratacion, HorasTrabajadas);
        this.tasacomision = tasacomision;
        this.ventasmen = new int[12];
    }

    public void RegistrarVenta(int mes, double monto) {
        if (mes >= 0 && mes < 12) {
            ventasmen[mes] += monto;
        }
    }

    private double calcularComision() {
        int mesActual = Calendar.getInstance().get(Calendar.MONTH);
        return ventasmen[mesActual] * tasacomision;
    }

    public double calcularPago() {
        return (SalarioBase / 160) * HorasTrabajadas + calcularComision();
    }

    public double calcularVentasAnuales() {
        double total = 0;
        for (double venta : ventasmen) {
            total += venta;
        }
        return total;
    }

    @Override
    public void MostrarInformacion() {
        return super.MostrarInformacion() + ", Ventas anuales: " + calcularVentasAnuales();
    }

}
