package HomeWork9;

public class BusStaton {
    int inputPeople;
    int outputPeople;

    public BusStaton(int inputPeople, int outputPeople) {
        this.inputPeople = inputPeople;
        this.outputPeople = outputPeople;
    }


    @Override
    public String toString() {
        return ("Кол-во входящих на остановке "+inputPeople+" ,\n Кол-во выходящих "+outputPeople);
    }
}
