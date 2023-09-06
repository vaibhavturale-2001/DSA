package DSA.Problem_Solving;

import java.util.Scanner;

    public class Ex2{

        public static void temperatureConvertion(double temperature,String unit){

            if(unit.equalsIgnoreCase("°C")){
                double convertedTemperature = (temperature * 9 / 5) + 32;
                System.out.println(temperature+"°C is equal to "+convertedTemperature+"°F");
            }
            else if(unit.equalsIgnoreCase("°F")){
                double convertedTemperature=(temperature - 32) * 5/9;
                System.out.println(temperature+"°F is equal to "+convertedTemperature+"°C");
            }else{
                System.out.println("Invalid unit of measurement.Please eneter the Celcius or Fehrenheit ");
            }
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            double temperature=sc.nextDouble();
            String unit=sc.next();

            temperatureConvertion(temperature, unit);
        }
    }

