//import java.awt.*;
//import java.util.*;

//import javax.management.loading.PrivateClassLoader;
public class Player {
	private String player;
    private int totalSpacesMoved = 0;
    private int currentPosition = 0;
    private int passGo = 0;
    Board b = new Board();
    private int money = 0;
    public Player()
    {
//        this.player = player;
//        this.ttsm = ttsm;
//        this.currentPosition = currentPosition;
    }
    
    public void setName(String name)
    {
        player = name;
    }
    
    public String getName()
    {
        return player;
    }

    public void takeTurn(Die die)
    {
    	passGo = currentPosition+die.getSum();
    	currentPosition = b.move(currentPosition, die.getSum());
    	totalSpacesMoved = b.totalSpacesMoved(totalSpacesMoved, die.getSum());
    }
    
    public int getCP()
    {
    	return currentPosition;
    }
    
    public int backToGo() {
        currentPosition = 0;
        return currentPosition;
    }
    
    public int getTsm()
    {
    	return totalSpacesMoved;
    }
    
    public void addMoney(int amont)
    {
    	money += amont;
    }
    
    public int getMoney()
    {
    	return money;
    }
    //counter to see if player passes go
    public int passGo()
    {
    	return passGo;
    }
}
