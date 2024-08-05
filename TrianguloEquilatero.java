public class TrianguloEquilatero {
    private double longitudLado;

    public TrianguloEquilatero(double longitudLado) {
        this.longitudLado = longitudLado;
    }

    public double calcularPerimetro() {
        return 3 * longitudLado;
    }

    public double calcularAltura() {
        return Math.round((Math.sqrt(3) / 2) * longitudLado);
    }

    public double calcularArea() {
        return Math.round((Math.sqrt(3) / 4) * longitudLado * longitudLado);
    }
}