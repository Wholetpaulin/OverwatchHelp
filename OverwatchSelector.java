//Paul Trettenero
// 2/28/2016
//  Got most of this code from     https://www.youtube.com/watch?v=iOV_oaJhABQ 



package overwatchselector;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

import javax.swing.*;


public class OverwatchSelector extends JFrame implements ActionListener {

// an array of strings for selctions on the dropdown menu
String[] bestHeroStrings = {"Select Hero", "Genji", "McCree", "Pharah", "Reaper", "Soldier76", "Tracer", "Hanzo", "Junkrat", "Mei", "Torbjorn", "Widowmaker", "D.Va", "Reinhardt", "Roadhog", "Winston", "Zarya", "Ana", "Lucio", "Mercy", "Symmetra", "Zenyatta"};
JComboBox bestHeroList = new JComboBox(bestHeroStrings);     								//this is the first dropdown menu
JLabel lblText = new JLabel();
JLabel primText = new JLabel();
int Genji, McCree, Pharah, Reaper, Soldier76, Tracer, Hanzo, Junkrat, Mei, Torbjorn, Widowmaker, DVa, Reinhardt, Roadhog, Winston, Zarya, Ana, Lucio, Mercy, Symmetra, Zenyatta;
int[] allHeroArray = {Genji, McCree, Pharah, Reaper, Soldier76, Tracer, Hanzo, Junkrat, Mei, Torbjorn, Widowmaker, DVa, Reinhardt, Roadhog, Winston, Zarya, Ana, Lucio, Mercy, Symmetra, Zenyatta};		//creates an array with the value of each hero in it for later
//^^creates an array with the value of each hero in it for later


	public static void main(String[] args) {
		OverwatchSelector fr = new OverwatchSelector();
		centerFrame(fr);  							
		//maximizeFrame(fr);
		fr.setVisible(true);
	}
	
	private static void centerFrame(OverwatchSelector fr) {
		// TODO Auto-generated method stub... 							idk what this is eclipse made me do it..
		
	}

	public OverwatchSelector() {                       //This section is setting up the boring normal GUI interface
		setLayout(new FlowLayout());
		setSize(800, 600);
		setTitle("Overwatch Hero Selector");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		primText.setText("Please select which heroes you are best with, in order.  You may fill any number of the fields.");     //This probably doesn't go here...
		add(primText);							//add direction for the user interface
		
		add(Box.createHorizontalStrut(800));  		//This is the best way I've found to space out the items in the window..
		
		bestHeroList.setSelectedIndex(0);								// index 0 is the first item on the list, which is "Select Hero"
		bestHeroList.addActionListener(this);
		add(bestHeroList);											//added the dropdown or combobox
		add(lblText);													//adds the label for selecting each respective dropdown
	}
	
public void actionPerformed(ActionEvent e) {
	if (e.getSource() == bestHeroList) {                                                   //is the source of any event the source of bestHeroList dropdown
		JComboBox cb = (JComboBox)e.getSource();											//copies what's in the original combo ox into a new one called cb...
		String msg = (String)cb.getSelectedItem();												// checks which item is selected in cb
		switch (msg){																				//does something depending on what the message is..
			case "Select Hero": lblText.setText("These fields may be left blank..");
				
				break;
			case "Genji": lblText.setText("You main Genji bro?  What about Hanzo?"); //this section I'm going to add value +40 for 1st pick,  +35 for 2nd pick,  +30 for 3rd pick... etc. 
			Genji = 0;
			McCree = 0;
			Pharah = 0;
			Reaper = 0;
			Soldier76 = 0;
			Tracer = 0;
			Hanzo = 0;
			Junkrat = 0;
			Mei = 0;
			Torbjorn = 0;
			Widowmaker = 0;
			DVa = 0;
			Reinhardt = 0;
			Roadhog = 0;
			Winston = 0;
			Zarya = 0;
			Ana = 0;
			Lucio = 0;
			Mercy = 0;
			Symmetra = 0;
			Zenyatta = 0;
				//^^^This is needed so values don't stay..
				Genji = 40;													//Genji is given a score of 40 for being the player's favorite hero
				System.out.println("Genji's value is " + Genji); 							// This is for debugging purposes
				break;
			case "McCree": lblText.setText("WHAT TIME IS IT?!");
				Genji = 0;
				McCree = 0;
				Pharah = 0;
				Reaper = 0;
				Soldier76 = 0;
				Tracer = 0;
				Hanzo = 0;
				Junkrat = 0;
				Mei = 0;
				Torbjorn = 0;
				Widowmaker = 0;
				DVa = 0;
				Reinhardt = 0;
				Roadhog = 0;
				Winston = 0;
				Zarya = 0;
				Ana = 0;
				Lucio = 0;
				Mercy = 0;
				Symmetra = 0;
				Zenyatta = 0;
				//^^^This is needed so values don't stay..
				McCree = 40;													//Genji is given a score of 40 for being the player's favorite hero
				System.out.println("McCree's value is " + McCree);
				System.out.println("Genji's value is " + Genji);
				break;
			case "Pharah": lblText.setText("You've selected Pharah!");
				break;
			case "Reaper": lblText.setText("You've selected Reaper!");
				break;
			case "Soldier76": lblText.setText("You've selected Soldier!");
				break;
			case "Tracer": lblText.setText("Cheers, love!");
				break;
			case "Hanzo": lblText.setText("Ryuu ga waga teki wo kurau!!");
				break;
			case "Junkrat": lblText.setText("You've selected Junkrat!");
				break;
			case "Mei": lblText.setText("Sorry, sorry, sorry, sorry....");
				break;
			case "Torbjorn": lblText.setText("You've selected Torbjorn!");
				break;
			case "Widowmaker": lblText.setText("You've selected Widowmaker!");
				break;
			case "D.Va": lblText.setText("You've selected D.Va!");
				break;
			case "Reinhardt": lblText.setText("You've selected Reinhardt!");
				break;
			case "Roadhog": lblText.setText("You've selected Roadhog!");
				break;
			case "Winston": lblText.setText("You've selected Winston!");
				break;
			case "Zarya": lblText.setText("You've selected Zarya!");
				break;
			case "Ana": lblText.setText("You're not actually good with her, don't lie.");
				break;
			case "Lucio": lblText.setText("You've selected Lucio!");
				break;
			case "Mercy": lblText.setText("You've selected Marcy!");
				break;
			case "Symmetra": lblText.setText("Good choice!");
				break;
			case "Zenyatta": lblText.setText("You've selected Zenyatta!");
				break;
			default: lblText.setText("Whoops. We seem to have an error. :-(");
			}
		}
	
	}
}

