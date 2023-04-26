package wypozyczalnia.model;

public class Motorcycle extends Vehicle implements ChangeMileage {
    private String type;

    public Motorcycle() {
        
    }

    public Motorcycle(String category, String mark, String model, String year, String engine, String colour, int mileage, String plate_number, String type) {
        super(category, mark, model, year, engine, colour, mileage, plate_number);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public void changeMileage(int add){
        this.setMileage(this.getMileage()+add);
    }

    @Override
    public String toString() {
        return this.getCategory() + "\nMarka: "+this.getMark() + "\nModel: " + this.getModel() + ":\nTyp: "+this.getType() + "\nRok produkcji: " +this.getYear()+"\nSilnik: "+this.getEngine()+
        		"\nKolor: "+this.getColour()+"\nAktualny przebieg: "+this.getMileage()+"\nNumer rejestracyjny: "+this.getPlate_number();
    }
    
    
}
