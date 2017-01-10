import java.util.*;

public class Bus{

  private ArrayList<Commuterable> passengers;

  public Bus(){
    this.passengers = new ArrayList<Commuterable>();
  }

  public int passengerCount(){
    return passengers.size();
  }

  public void pickUp(Commuterable person ){
    passengers.add(person);
  }

  /*
  public boolean isBusFull(){
    return passengerCount() == passengers.length;
  }
  */

  public void dropOff(){

    if(passengerCount()>0){
       passengers.remove(0);
    }
  }

  public void endOfTheRoad(){
    passengers.clear();
  }
}