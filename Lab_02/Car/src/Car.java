public class Car {
    private double gas;
    private final double consumptionRate;

    public Car(double consumptionRate){
        this.gas=0;
        this.consumptionRate=consumptionRate;
    }

    public double getGas() {
        return this.gas;
    }

    public void addGas(double gas) {
        this.gas+=gas;
    }

    public void drive(double km) {
        double consume=consumptionRate*km;
        gas-=consume;
    }
}