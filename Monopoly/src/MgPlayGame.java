import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MgPlayGame {
    //asking for amount of payers
    String players = JOptionPane.showInputDialog("Enter the amont of players");
    int amountOfP =Integer.parseInt(players);
    int top = 0;
    ArrayList<String> winningPlayer = new ArrayList<String>();
    String[] name = new String [amountOfP];
    Player[] pla = new Player[amountOfP];
    public static void main(String[] arg) 
    {
        MgPlayGame play = new MgPlayGame();
        play.playGame();
    }

    public void initGame()
    {
        for(int i=0; i<name.length;i++)
        {
            name[i] = new String("Player "+(i+1));
        }

        for (int i=0; i<pla.length;i++)
        {
            pla[i] = new Player();
            pla[i].setName(name[i]);

        }
    }

    public void playGame()
    {
        initGame();
        for(int j = 0; j<100; j++)
        {
            for(int i=0; i<pla.length;i++)
            {
                Die D2 = new Die();
                System.out.println(" " + "\nPlayer "+ pla[i].getName() + " Start position: " + pla[i].getCP());
                pla[i] .takeTurn(D2);
                if (pla[i].passGo()>39)
                {
                    System.out.println(pla[i].passGo());
                    pla[i].addMoney(200);
                }
                System.out.println("Die 1: "+D2.getFirstValue()
                    + " \nDie 2: "+ D2.getSecondValue()+ " \nNew possition: "
                    + pla[i].getCP());
                    
                if (pla[i].getCP() == 2 || pla[i].getCP() == 3 || pla[i].getCP() == 5 ||
                pla[i].getCP() == 7 || pla[i].getCP() == 11 || pla[i].getCP() == 13 ||
                pla[i].getCP() == 17 || pla[i].getCP() == 19 || pla[i].getCP() == 23 ||
                pla[i].getCP() == 29 || pla[i].getCP() == 31 || pla[i].getCP() == 37) {
                    System.out.println("Prime number! New position is: " + pla[i].getCP());
                }
                System.out.println("total spaces moved: " + pla[i].getTsm()
                    + " \nTotal money: " + pla[i].getMoney());
            }
        }
        for(int i=0; i<pla.length; i++)
        {
            //if there is only one player
            if (pla[i].getMoney()>top)
            {
                winningPlayer.clear();
                top = pla[i].getMoney();
                winningPlayer.add(pla[i].getName());
            }
            //if there is more then one player
            else if(pla[i].getMoney()==top)
            {
                winningPlayer.add(pla[i].getName());
            }
        }
        String formattedString = winningPlayer.toString()
            .replace("[", "") //remove the right bracket
            .replace("]", ""); //remove the right bracket

        System.out.println("\nWinning player/players: "+formattedString);
    }

    //    public void winner()
    //    {
    //    	//initGame();
    //        String winningPlayer = null;
    //    	for(int i=0; i<pla.length; i++)
    //        {
    //            if (pla[i].getTsm()>top)
    //            {
    //                top = pla[i].getTsm();
    //                winningPlayer = pla[i].getName();
    //            }
    //            //winningPlayer = pla[0].getName();
    //            
    //            System.out.println(winningPlayer);
    //        }
    //    	//System.out.println("\n"+winningPlayer+ "  Won" );
    //    
    //    }
}