package HomeWork9;

import java.util.ArrayList;
import java.util.Scanner;

public class Bus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countBusStation=0;
        System.out.println(" Введите кол-во остановок в пределах от 2х до 10");
        try{
            countBusStation = scanner.nextInt();
        }catch (Exception e){
            System.err.println("Вы ввели недопустимое значение "+ e);
            System.exit(0);
        }
        ArrayList<BusStaton> busStations;
        busStations = createBusStation(countBusStation);
        System.out.println("");
        int ostatok=0;
        busStations.stream().forEach(station ->
            System.out.println(ostatok = ostatok+station.inputPeople-station.outputPeople));


    }

    public static ArrayList<BusStaton> createBusStation(int count){
        ArrayList<BusStaton> busStations = new ArrayList<>();
        int countNow=0;
        for (int i=0; i<count;i++){
            int input = (int)(Math.random()*10);
            int output = (int)(Math.random()*countNow);
            countNow = countNow+input-output;
            busStations.add(new BusStaton(input,output));
        }
        return  busStations;
    }


}
