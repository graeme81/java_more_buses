import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest{

  Bus bus;
  Person traveller;
  BusStop wait;
  Alien commuter;

  @Before
  public void before(){
    bus = new Bus();
    traveller = new Person();
    wait = new BusStop();
  }

  @Test // create empty bus
  public void startsAsEmptyBus(){
    assertEquals(0, bus.passengerCount());
  }

  @Test  // passenger boards bus
  public void passengerBoards(){
    bus.pickUp(traveller);

    assertEquals(1, bus.passengerCount());
  }

  @Test  // alien boards bus
  public void alienBoards(){
    bus.pickUp(commuter);

    assertEquals(1, bus.passengerCount());
  }

  @Test // passenger leaves the bus
  public void passengerLeaves(){
    bus.pickUp(traveller);
    bus.pickUp(traveller);

    bus.dropOff();

    assertEquals(1, bus.passengerCount());
  }

  @Test // passenger leaves the bus
  public void alienLeaves(){
    bus.pickUp(commuter);
    bus.pickUp(commuter);

    bus.dropOff();

    assertEquals(1, bus.passengerCount());
  }

/*
  @Test // empty the bus
  public void everybodyOff(){

    for(int i=0; i<8; i++){
      bus.pickUp(traveller);
    }

    bus.endOfTheRoad();

    assertEquals(0, bus.passengerCount());
  
  }
*/
/*
  @Test // can only pick up 10 passengers
  public void tooManyPassenegers(){
    for(int i = 0; i < 20; i++){
      bus.pickUp(traveller);
    }

    assertEquals(10, bus.passengerCount());
  }
*/


  @Test //add 3 people to Bus Stop
  public void addPeopleWaitingForBus(){
    wait.addWait(traveller);
    wait.addWait(traveller);
    wait.addWait(traveller);

    assertEquals(3, wait.waitCount());

  }

  @Test // move people onto bus
  public void movePeopleWaitingOntoBus(){
    int i;
    for( i = 0; i < 2; i++){ 
      wait.addWait(traveller);
    }

    for (int j = 0; j < i; j ++){
      bus.pickUp(traveller);
    }
    wait.allAboard();

    assertEquals(0, wait.waitCount());
    assertEquals(2, bus.passengerCount());

  }


}