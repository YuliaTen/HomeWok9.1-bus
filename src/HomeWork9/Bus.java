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
            if (countBusStation<2 || countBusStation>10){
                System.err.println("Вы ввели значение не из диапазона");
                System.exit(0);
            }
        }catch (Exception e){
            System.err.println("Вы ввели недопустимое значение "+ e);
            System.exit(0);
        }
        ArrayList<BusStaton> busStations;
        busStations = createBusStation(countBusStation);
        int ostatok = busStations.stream().mapToInt(s -> s.inputPeople - s.outputPeople).sum();
        System.out.println(String.format
          ("Количество человек оставшихся в автобусе при приближении к конечной станции - %d",ostatok));


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
