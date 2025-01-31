/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorio2lab2;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author river
 */
public class RegistrarEmpleados extends JFrame {

    private JTextField txtCodigo, txtNombre, txtSalario;
    private JComboBox<String> cbTipoEmpleado;
    private JButton btnRegistrar;
    private ArrayList<Empleado> empleados;

    public RegistrarEmpleados() {
        setTitle("Registro de Empleados");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        empleados = new ArrayList<>();

        add(new JLabel("Código:"));
        txtCodigo = new JTextField();
        add(txtCodigo);

        add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        add(txtNombre);

        add(new JLabel("Salario:"));
        txtSalario = new JTextField();
        add(txtSalario);

        add(new JLabel("Tipo de Empleado:"));
        cbTipoEmpleado = new JComboBox<>(new String[]{"Estándar", "Temporal", "Ventas"});
        add(cbTipoEmpleado);

        btnRegistrar = new JButton("Registrar");
        add(btnRegistrar);

        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });

        setVisible(true);
    }
    
    public static void main(String[] args) {
        RegistrarEmpleados registrarEmpleados = new RegistrarEmpleados();
    }
}
