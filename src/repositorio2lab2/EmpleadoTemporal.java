/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorio2lab2;

import java.util.Calendar;

/**
 *
 * @author river
 */
public class EmpleadoTemporal extends Empleado {

    protected Calendar fin_contrato;

    public EmpleadoTemporal(int CodigoUnico, String Nombre, Calendar FechaContratacion, double SalarioBase, int HorasTrabajadas, Calendar fin_contrato) {
        super(CodigoUnico, Nombre, FechaContratacion, SalarioBase, HorasTrabajadas);
        this.fin_contrato = fin_contrato;
    }

    @Override
    public double CalculoDePago() {
        Calendar fecha_actual = Calendar.getInstance();
        if (fecha_actual.before(fin_contrato) || fecha_actual.equals(fin_contrato)) {
            return super.CalculoDePago() * HorasTrabajadas;
        }
        return 0;
    }

    public Calendar getFin_contrato() {
        return fin_contrato;
    }

    public void setFin_contrato(Calendar nuevoFin_contrato) {
        this.fin_contrato = nuevoFin_contrato;
    }

    @Override
    public void MostrarInformacion() {
        super.MostrarInformacion();
        System.out.println("\nFin de contrato: " + fin_contrato.getTime());
    }
}
