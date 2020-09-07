/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wangbaichao
 */
public class CarInfoList {
    private static CarInfoList carLists;
    public ArrayList<Car> carList;
    private String updateDate;
    
    public CarInfoList(){
        
        carList = new ArrayList<Car>();
        
        
        Car car1 = new Car(true, "Ferrari", 2019, 1, 2, 1,"Red One", "Boston", true);
        Car car2 = new Car(true, "BMW", 2019, 1, 4, 2, "X1", "New York", true);
        Car car3 = new Car(true, "Toyota", 2018, 1, 4, 3, "T1", "Boston", true);
        Car car4 = new Car(true, "GM", 2018, 1, 4, 4, "G1", "New York", true);
        Car car5 = new Car(true, "Toyota", 2017, 1, 4, 5, "T2", "Chicago", true);
        Car car6 = new Car(true, "GM", 2017, 1, 4, 6, "G2", "Chicago", true);
        Car car7 = new Car(true, "Ferrari", 2016, 1, 4, 7, "488", "Seattle", true);
        Car car8 = new Car(true, "BMW", 2016, 1, 4, 8, "X2", "Seattle", true);
        Car car9 = new Car(true, "Toyota", 2019, 1, 4, 9, "T3", "Austin", true);
        Car car10 = new Car(true, "GM", 2019, 1, 4, 10, "G3", "Austin", true);
        
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
        carList.add(car9);
        carList.add(car10);
        
    }

    
    public static CarInfoList  getCarList() {
        carLists = new CarInfoList();
        return carLists;
    }
    
    public ArrayList<Car> getCarInfoList(){
        return carList;
    }

    

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }
    
    public Car addCar() {
        Car car = new Car();
        carList.add(car);
        return car;
    }
    
    public void deleteCar(Car car) {
        carList.remove(car);
    }
    
    public ArrayList<String> getBrandList(){
        ArrayList<String> brandList=new ArrayList<>();
        for(Car car: this.carList){
            String brand=car.getBrand();
            if(!brandList.contains(brand)){
                brandList.add(brand);
            }
        }
        return brandList;
    }
    
    public ArrayList<String> getYearList(){
        ArrayList<String> yearList=new ArrayList<>();
        for(Car car: this.carList){
            String year=String.valueOf(car.getManufactured_year());
            if(!yearList.contains(year)){
                yearList.add(year);
            }
        }
        return yearList;
    }
    
    public ArrayList<String> getCityList(){
        ArrayList<String> cityList=new ArrayList<>();
        for(Car car: this.carList){
            String city=car.getAvailble_city();
            if(!cityList.contains(city)){
                cityList.add(city);
            }
        }
        return cityList;
    }
    
    public ArrayList<String> getSerialNumList(){
        ArrayList<String> serialNumList=new ArrayList<>();
        for(Car car: this.carList){
            int serialNum=car.getSerial_num();
            if(!serialNumList.contains(serialNum)){
                serialNumList.add(String.valueOf(serialNum));
            }
        }
        return serialNumList;
    }
    
    public ArrayList<String> getModelNumList(){
        ArrayList<String> modelNumList=new ArrayList<>();
        for(Car car: this.carList){
            String modelNum=car.getModel_num();
            if(!modelNumList.contains(modelNum)){
                modelNumList.add(modelNum);
            }
        }
        return modelNumList;
    }
    
//    public ArrayList<String> getSeatList(){
//        ArrayList<String> seatList=new ArrayList<>();
//        for(Car car: this.carList){
//            String seat=String.valueOf(car.getMax_seats());
//            if(!seatList.contains(seat)){
//                seatList.add(seat);
//            }
//        }
//        return seatList;
//    }
    
            
    
    
    //question 1
    public Car SearchFirstAvailable(){
        for(Car car: this.carList){
            if(car.isAvailable()==true){
                return car;
            }
        }
        return null;
    }
    
    //question 2
    public int[] CountAvailableOrNot(){
        int avail=0;
        int noavail=0;
        for(Car car : this.carList){
            if(car.isAvailable()==true) avail++;
            else noavail++;
        }
        int [] result ={avail,noavail};
        return result;
    }
    
    
    
    //question 3
    public ArrayList<Car> searchCarbyBrand(String brand){
        ArrayList<Car> result3 =new ArrayList<>();
        
        for(Car car : this.carList){
            if(car.getBrand().equalsIgnoreCase(brand)){
                result3.add(car);
            }
        }
        return result3;
    }
    
    //question 4
    public ArrayList<Car> searchCarbyYear(int year){
        ArrayList<Car> result4 =new ArrayList<>();
        
        for(Car car : this.carList){
            if(car.getManufactured_year()==year){
                result4.add(car);
            }
        }
        return result4;
    }
    
    //question 5
    public ArrayList<Car> searchCarbySeat(int x,int y){
        ArrayList<Car> result5 =new ArrayList<>();
        
        for(Car car : this.carList){
            if(car.getMin_seats()>=x&&car.getMax_seats()<=y){
                result5.add(car);
            }
        }
        return result5;
    }
    
    //question 6
    public ArrayList<Car> searchCarbySerialNum(int serialNum){
        ArrayList<Car> result6 =new ArrayList<>();
        
        for(Car car : this.carList){
            if(car.getSerial_num()==serialNum){
                result6.add(car);
            }
        }
        return result6;
    }
    
    //question 7
    public ArrayList<Car> searchCarbyModelNum(String modelNum){
        ArrayList<Car> result7 =new ArrayList<>();
        
        for(Car car : this.carList){
            if(car.getModel_num()==modelNum){
                result7.add(car);
            }
        }
        return result7;
    }
    
    //question 8
    public ArrayList<String> allBrand(){
        ArrayList<String> result8=new ArrayList<>();
        
        for(Car car : this.carList){
            String b = car.getBrand();
            if(!result8.contains(b)){
                result8.add(b);
            }
        }
        return result8;
    }
    
    //question 10
    public ArrayList<Car> searchCarbyCity(String city){
        ArrayList<Car> result10 =new ArrayList<>();
        
        for(Car car : this.carList){
            if(car.getAvailble_city()==city&&car.isAvailable()==true){
                result10.add(car);
            }
        }
        return result10;
    }
    
    //quesiton 11
    public ArrayList<Car> allExpired(){
        ArrayList<Car> result11=new ArrayList<>();
        
        for(Car car : this.carList){
            if(car.isMaintenance_certificate()==false){
                result11.add(car);
            }
        }
        return result11;
    }
    
//    //question 12
//    public ArrayList<Car> secondary(String brand){
//        ArrayList<Car> result12=new ArrayList<>();
//       
//        
//        for(Car car : this.carList){
//            if(car.getBrand()==brand){
//                result12.add(car);
//            }
//        }
//        return result12;
//    }
    
}
