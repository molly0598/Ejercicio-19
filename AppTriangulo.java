import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppTriangulo extends JFrame {
    private JTextField campoLado;
    private JLabel etiquetaResultado;

    public AppTriangulo() {
        setTitle("Calculadora Triángulo Equilátero");
        setSize(600, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new GridLayout(3, 2));

        JLabel etiquetaLado = new JLabel("Lado:");
        campoLado = new JTextField();
        JButton botonCalcular = new JButton("Calcular");
        etiquetaResultado = new JLabel();

        botonCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double longitudLado = Double.parseDouble(campoLado.getText());
                    TrianguloEquilatero triangulo = new TrianguloEquilatero(longitudLado);
                    etiquetaResultado.setText("Perímetro: " + triangulo.calcularPerimetro() +
                            " | Altura: " + triangulo.calcularAltura() +
                            " | Area: " + triangulo.calcularArea());
                } catch (NumberFormatException ex) {
                    etiquetaResultado.setText("Por favor ingrese un número válido.");
                }
            }
        });

        panelPrincipal.add(etiquetaLado);
        panelPrincipal.add(campoLado);
        panelPrincipal.add(botonCalcular);
        panelPrincipal.add(etiquetaResultado);

        add(panelPrincipal);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AppTriangulo();
    }
}