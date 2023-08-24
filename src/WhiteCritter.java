import java.awt.Color;
import java.util.ArrayList;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;

public class WhiteCritter extends Critter
{
	public WhiteCritter()
	{
		setColor(Color.WHITE);
	}
	
	
   public ArrayList<Actor> getActors()
   {
   	ArrayList<Actor> eatem = getGrid().getNeighbors(getLocation());
   	int flowerCnt=0;
   	
   	for(int i=eatem.size()-1; i>=0; i--) {
   	    if(eatem.get(i) instanceof Flower) {
   	        flowerCnt++;
   	        if(flowerCnt==1) {
   	            eatem.get(i).setColor(Color.WHITE);
   	            eatem.remove(i);
   	            }
   	        }
   	     else
   	         eatem.remove(i);
   	    }
   	
   	return eatem; 	

   }
}