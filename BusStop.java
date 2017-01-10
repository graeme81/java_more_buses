import java.util.*;

public class BusStop {

  private ArrayList<Commuterable> wait;
  private Bus arrival;

  public BusStop(){
    this.wait = new ArrayList<Commuterable>();
    this.arrival = new Bus();
  }

  public void addWait(Commuterable waiter){
    wait.add(waiter);
  }

  public int waitCount(){
    return wait.size();
  }

  public void allAboard(){
    wait.clear();
  } 

}
