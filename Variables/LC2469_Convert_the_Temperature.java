package Variables;

public class LC2469_Convert_the_Temperature {
    public double[] convertTemperature(double celsius) {
        double k = celsius + 273.15;
        double f = celsius * 1.80 + 32.00;

        return new double[] { k, f };
    }
}
