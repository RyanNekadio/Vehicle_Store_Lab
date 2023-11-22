package vehicles.water;

import products.IProduct;
import vehicles.IMotorised;
import vehicles.Vehicle;

public class Speedboat extends Vehicle implements IMotorised, IWaterVehicle {

    private String hullType;
    private IMotorised motor;

    public Speedboat(
            float weight,
            int maxSpeed,
            IProduct baseProduct,
            String hullType,
            IMotorised motor){
        super(weight, maxSpeed, baseProduct);
        this.hullType = hullType;
        this.motor = motor;
    }

    @Override
    public String getHullType() {
        return hullType;
    }

    @Override
    public String setHullType(String hullType) {
        this.hullType = hullType;
        return this.hullType;
    }

    public IMotorised getMotor() {
        return motor;
    }

    public void setMotor(IMotorised motor) {
        this.motor = motor;
    }

    @Override
    public void startEngine() {

    }

    @Override
    public void stopEngine() {

    }

    @Override
    public int getHp() {
        return 0;
    }

    @Override
    public void setHp(int hp) {

    }

    @Override
    public int getFuel() {
        return 0;
    }

    @Override
    public void setFuel(int fuel) {

    }
}
