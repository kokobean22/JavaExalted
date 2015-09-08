import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		Exalt tom = new Exalt();
		tom.printChar();
		System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println();
		int[] maAb = {3,4,5,4,4,2,0,0,4,0,5,4,4,3,4,2,5,2,1,4,5,5,5,2,0,3,5,0,3,6};
		Charm [] marCharm = new Charm[3];
		String[] bodyKeywords = {"Supplemental", "Combo-OK", "Dawn"}; 
		Charm bodyMending = new Charm("Body Mending Meditation", false, null, false, 10, 0, 0, "Until the day ends", bodyKeywords, 1, 1, "Resistance", "Even wounded nigh unto death, a Lawgiver will marshal the strength to rise again. This Charm supplements a dramatic action to marshal the character's inner \nresources for recovery. This action requires one hour without a stunt or another Charm. The Solar's player rolls (Stamina + Resistance). Success speeds his \nhealing rate by a factor of 10 or, if the character prefers, adds directly to the successes of a physician using Wound-Mending Care Technique on the \ncharacter. See page 149 for more on natural healing rates.");
		marCharm[0] = bodyMending;
		String[] shadowKeywords = {"Reflexive", "Combo-OK"};
		Charm shadowWater = new Charm("Shadow Over Water", false, null, false, 1, 0, 0, "Instant", shadowKeywords, 1, 3, "Dodge", "The Chosen move like shadows over water---with perfect grace and speed. The maneuver named Shadow Over Water restores defensive advantage to a \nbeleaguered or overextended fighter. This Charm is used in response to an attack. It allows the Exalt to ignore all penalties that apply to her \nDodge DV when resolving that attack. Her Dodge DV is still 0 against an undodgeable attack, but she takes no further penalties.");
		marCharm[1] = shadowWater;
		String[] sevenKeywords = {"Reflexive", "Combo-OK", "Obvious", "Dawn"};
		String[] sevenPrereqs = {shadowWater.name};
		Charm sevenShadow = new Charm("Seven Shadow Evasion", true, sevenPrereqs, false, 3, 0, 0, "Instant", sevenKeywords, 2, 4, "Dodge", "The Solar hero is too quick for his enemies to land a blow. The Exalt invokes this Charm in response to an attack. The attack must not be unexpected. \nThis Charm is a dodge that perfectly defends against the attack---even if the attack is undodgeable. \nThis Charm has one of the Four Flaws of Invulnerability listed below. \nVALOR FLAW: The Exalt must move toward the opponent he considers most dangerous, on every tick where this is possible without magic, until his DV refreshes twice. \nCOMPASSION FLAW: The Exalt can only use this Charm when in the presence of someone or something he cares about.\nTEMPERANCE FLAW: The Exalt cannot take movement actions such as move, dash, flight, teleportation, or jumping until his DV refreshes twice. \nCONVICTION FLAW: This Charm does not function when a Solar's actions are contrary to his Motivation. The Storyteller should assume that a Solar's actions \nqualify unless an enemy deliberately arranges for terms of conflict that dispirit and shake the purpose of the Exalt. The player can interpret more strictly if desired.");
		marCharm[2] = sevenShadow;
		
		Exalt marian = new Exalt("Marian", "Solar", "Night", 4, 5, 5, 5, 4, 6, 3, 4, 5, maAb, 9, 6, 2, 5, 3, 3, "Red Rage of Compassion", 22, 22, 15, 3, 2, 1, 0, marCharm);
		marian.printChar();
		
		System.out.println("View Which Charm?");
		String select = input.nextLine();
		boolean valid = false;
		
		while(!valid)
		{
			for(int i = 0; i < marian.charms.length; i++)
			{
				if(select.equalsIgnoreCase(marian.charms[i].name))
				{
					marian.charms[i].printCharm();
					valid = true;
					break;
				}
			}
			
			if(valid != true)
			{
				System.out.println("That Charm does not exist. Please input another charm.");
				select = input.nextLine();
			}
		}
		//Charm test = new Charm();
		//test.printCharm();
	}
}
