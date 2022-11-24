
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        //if price of instantiated is greater, then the comparison should return true
        //if price of instantiated is lesser, then the comparison should return false
        if (this.rooms > compared.rooms)
            return true;
        else if (this.rooms < compared.rooms)
            return false;

        if (this.squares > compared.squares)
            return true;
        else if (this.squares < compared.squares)
            return false;

        if (this.princePerSquare > compared.princePerSquare)
            return true;
        else if (this.princePerSquare < compared.princePerSquare)
            return false;

        return false;
    }

    public int priceDifference(Apartment compared) {
        int instanceApartmentPrice = this.squares * this.princePerSquare;
        int comparedApartment = compared.squares * compared.princePerSquare;

        return Math.abs(instanceApartmentPrice - comparedApartment);
    }

    public boolean moreExpensiveThan(Apartment compared) {
        //if price of instantiated is greater, then the comparison should return true
        //if price of instantiated is lesser, then the comparison should return false
        if(this.princePerSquare > compared.princePerSquare) {
            return true;
        } else {
            return false;
        }
    }
}
