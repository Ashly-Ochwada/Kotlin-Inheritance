fun main(){
    var car = Car("Range", "SUV", "Black", 5)
    car.identity()
    car.carry(10)
    car.calculateparkingFees(23)
    var bus = Bus("Coaster","Toyota","White", 30)
    bus.maxTripFare(120.50)
    bus.calculateparkingFees(18)

}
//Create a class Car with the following attributes: make, model, color, capacity.
//It has these functions:
open class  Car(var make:String,var model:String, var color:String, var capacity:Int){
// carry(people: Int) : Prints out “Carrying $peoplepassengers” if the
//number of people is within its capacity else it prints out “Over capacity
//by $x people” where x is the number of people exceeding its capacity
    fun carry(people:Int){
        if(people<=capacity){
            println("Carrying $people passengers")
        }else{
            var x = people - capacity
            println("Over capacity by $x people")
        }

    }
//identity() : Prints out the color, make and model in the following
//format e.g:  “I am a white subaru legacy
    fun identity(){
        println("I am a $color $make $model")
    }
//calculate ParkingFees(hours: Int) : Calculates and returns the
//parking fees by multiplying the hours by 20
   open fun calculateparkingFees(hours:Int):Int {
     var parkingFees = hours*20
    println(parkingFees)
    return parkingFees
    }
}
//maxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per
//trip. The bus’calculateParkingFees method returns the productof hours and
//the capacity of the bus
class Bus(make:String,model:String,color:String,capacity:Int):Car(make, model, color, capacity){
    fun maxTripFare(fare:Double):Double{
     var maxAmountOfFare = fare*capacity
        println(maxAmountOfFare)
        return maxAmountOfFare
    }

    override fun calculateparkingFees(hours: Int): Int {
       // return super.calculateparkingFees(hours)
        var parkingFees = hours*capacity
        println(parkingFees)
        return parkingFees
    }

}