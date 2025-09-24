public class Temperature {
    private double degree; 
    public void setCelsius(double degree) {
        this.degree = degree;
    }
    public double getCelsius() {
        return this.degree;
    }
    public void setFahrenheit(double degree) {
        this.degree = (degree - 32) * 5/9;
    }

    public double getFahrenheit() {
        return (this.degree * 9/5) + 32;
    }
    public String toString() {
        return String.format("Celsius: %.2f, Fahrenheit: %.2f", getCelsius(), getFahrenheit());
    }
}
