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
        setTitle("Gestión de Empresa");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(new Color(255, 192, 203));
        mainPanel.setBorder(new EmptyBorder(20, 20, 20, 20));

        JLabel titleLabel = new JLabel("Gestion de Empleados", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(Color.BLACK);
        mainPanel.add(titleLabel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(5, 1, 10, 10));
        buttonPanel.setBackground(new Color(255, 192, 203));

        JButton btnRegistrarEmpleado = createButton("Registrar Empleado");
        JButton btnRegistrarHoras = createButton("Registrar Horas Trabajadas");
        JButton btnRegistrarVentas = createButton("Registrar Ventas");
        JButton btnCalcularPago = createButton("Calcular Pago Mensual");
        JButton btnGenerarReporte = createButton("Generar Reporte");

        buttonPanel.add(btnRegistrarEmpleado);
        buttonPanel.add(btnRegistrarHoras);
        buttonPanel.add(btnRegistrarVentas);
        buttonPanel.add(btnCalcularPago);
        buttonPanel.add(btnGenerarReporte);

        mainPanel.add(buttonPanel, BorderLayout.CENTER);
        add(mainPanel);

       
        btnRegistrarEmpleado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarEmpleado();  
            }
        });

        btnRegistrarHoras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });

        btnRegistrarVentas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarVentas();
            }
        });

        btnCalcularPago.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularPagoMensual();
            }
        });

        btnGenerarReporte.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generarReporte();
            }
        });
    }

    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.PLAIN, 16));
        button.setBackground(Color.WHITE);
        button.setForeground(Color.BLACK);
        button.setFocusPainted(false);
        return button;
    }

   
    private void registrarEmpleado() {
        String Nombre = JOptionPane.showInputDialog("El nombre del empleado es: ");
    }

    private void registrarHorasTrabajadas() {
        JOptionPane.showMessageDialog(this, "Función de Registrar Horas Trabajadas en desarrollo.");
    }

    private void registrarVentas() {
        JOptionPane.showMessageDialog(this, "Función de Registrar Ventas en desarrollo.");
    }

    private void calcularPagoMensual() {
        JOptionPane.showMessageDialog(this, "Función de Calcular Pago Mensual en desarrollo.");
    }

    private void generarReporte() {
        JOptionPane.showMessageDialog(this, "Función de Generar Reporte en desarrollo.");
    }

   
}
