/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorio2lab2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;

public class GUIFRAME extends JFrame {
    public GUIFRAME() {
        
       
       setTitle("Pantalla Principal");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel main1Panel = new JPanel(new BorderLayout());
        main1Panel.setBackground(new Color(255, 192, 203));
        main1Panel.setBorder(new EmptyBorder(20, 20, 20, 20));
        
        JLabel titleLabel1 = new JLabel("Pantalla Principal", SwingConstants.CENTER);
        titleLabel1.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel1.setForeground(Color.WHITE);
        main1Panel.add(titleLabel1, BorderLayout.NORTH);
        
        JButton btnRegistrarEmpleado = createButton("Registrar Empleado");
        JButton btnGenerarReporte = createButton("Generar Reporte");
        JButton btnBuscarEmpleadosporCodigo = createButton("Buscar Empleados por Codigo");
        
        JPanel buttonPanel1 = new JPanel(new GridLayout(5, 1, 10, 10));
        buttonPanel1.setBackground(new Color(255, 192, 203));
        
        buttonPanel1.add(btnRegistrarEmpleado);
        buttonPanel1.add(btnGenerarReporte);
        buttonPanel1.add(btnBuscarEmpleadosporCodigo);
        
        main1Panel.add(buttonPanel1, BorderLayout.CENTER);
        add(main1Panel);
        
        btnRegistrarEmpleado.addActionListener(e -> registrarEmpleado());
        btnGenerarReporte.addActionListener(e -> generarReporte());
        btnBuscarEmpleadosporCodigo.addActionListener(e -> BuscarEmpleadosporCodigo());
        
        setTitle("Gestión de Empresa");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(new Color(255, 192, 203));
        mainPanel.setBorder(new EmptyBorder(20, 20, 20, 20));

        JLabel titleLabel = new JLabel("Gestion de Empleados", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(Color.WHITE);
        mainPanel.add(titleLabel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(5, 1, 10, 10));
        buttonPanel.setBackground(new Color(255, 192, 203));

        JButton btnRegistrarHoras = createButton("Registrar Horas Trabajadas");
        JButton btnRegistrarVentas = createButton("Registrar Ventas");
        JButton btnActualizarFechaFinContrato = createButton("Actualizar Fechas de Fin de Contrato");
        JButton btnCalcularPago = createButton("Calcular Pago Mensual");
        JButton btnSalir = createButton("Salir");

        buttonPanel.add(btnRegistrarHoras);
        buttonPanel.add(btnRegistrarVentas);
        buttonPanel.add(btnActualizarFechaFinContrato);
        buttonPanel.add(btnCalcularPago);
        buttonPanel.add(btnSalir);

        mainPanel.add(buttonPanel, BorderLayout.CENTER);
        add(mainPanel);

        btnRegistrarHoras.addActionListener(e -> RegistrarHoras.registrar(this));
        btnRegistrarVentas.addActionListener(e -> RegistrarVenta());
        btnActualizarFechaFinContrato.addActionListener(e -> ActualizarFechaFinContrato());
        btnCalcularPago.addActionListener(e -> calcularPagoMensual());
        btnSalir.addActionListener(e -> System.exit(0));
    }

    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.PLAIN, 16));
        button.setBackground(Color.WHITE);
        button.setForeground(Color.BLACK);
        button.setFocusPainted(false);
        return button;
    }

    private void registrarEmpleado() {}
    private void RegistrarVenta() {}
    private void ActualizarFechaFinContrato() {}
    private void calcularPagoMensual() {}
    private void generarReporte() {}
    private void BuscarEmpleadosporCodigo() {}
}
