/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repositorio2lab2;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author 50494
 */
public class Repositorio2Lab2 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        
        frame.setSize(500,500); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setLocationRelativeTo(null); 
        frame.setResizable(false);
        frame.setTitle("Gestión de Empleados en una Empresa");
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(0xEBB8DD));
    }
}