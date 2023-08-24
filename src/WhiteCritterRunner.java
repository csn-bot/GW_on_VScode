import java.awt.Color;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;

public class WhiteCritterRunner
{
   public static void main(String[] args)
   {
      ActorWorld world = new ActorWorld();
      
      WhiteCritter thang = new WhiteCritter();
      Location loc = new Location(4,4);
      world.add(loc, thang);
      
      world.add(new Location(1,1), new Bug());
      world.add(new Location(9,1), new Bug(Color.CYAN));
      world.add(new Location(7,7), new Bug(Color.ORANGE));
      world.show();       
   }
}