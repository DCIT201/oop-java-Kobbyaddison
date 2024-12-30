class Car extends Vehicle{
    public Car(String vehicleId, String model, double baseRentalRate){
        super(vehicleId, model, baseRentalRate); // calling the parent constructor }
        
    public double calculateRentalCost(int days){
        return getBaseRentalRate() * days;
    }

    public boolean isAvailableForRental(){
        return isAvailable(); // uses parent method
    }
}
