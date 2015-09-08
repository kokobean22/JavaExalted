
public class Charm
{
	String name;
	boolean hasPrereq;
	String[] prerequisites;
	boolean isExcellency;
	int moteCost;
	int willCost;
	int healthCost;
	String duration;		//could use an int and measure in ticks? - requires quantifying a scene
	String[] keywords;
	int essenceRequirement;
	int abilityRequirement;
	String ability;
	boolean isActive;
	String flavorText;
	
	public Charm()
	{
		name = "Shattering Grasp";
		hasPrereq = true;
		prerequisites = new String[1];
		prerequisites[0] = "Any Craft Excellency";
		isExcellency = false;
		moteCost = 5;
		willCost = 0;
		healthCost = 0;
		duration = "One Scene";
		keywords = new String[2];
		keywords[0] = "Simple";
		keywords[1] = "Combo-OK";
		essenceRequirement = 2;
		abilityRequirement = 5;
		ability = "Craft";
		isActive = false;
		flavorText = "The secrets of mending include the secrets of breaking. This Charm is a dramatic action taken to disassemble an object or structure. The character chooses whether \nto harmlessly or destructively take the object apart. This Charm allows the disassembly of only those objects the character can break with a feat of strength, adding \ntwice the character's Craft to the character's (Strength + Athletics) pool to determine valid feats. This Charm can disassemble a single object in (8 - Essence) \nminutes, with a minimum of three minutes. This Charm can target larger structures, such as castles and villages. In such cases, the Exalt proceeds methodically from \none major component to the next, taking them apart at the normal rate, until he is interrupted or the task is complete. To take apart a large structure, the Exalt \nmust dedicate at least (8 - Essence) hours, with a minimum of three hours, to the task; he cannot stop early unless he finishes or unexpected events interrupt him. \nThe Exalt cannot demolish anything larger than a large castle or village with a single invocation of this Charm.";
	}
	
	public Charm (String n, boolean preCharm, String[] prereqs, boolean excellent, int motes, int will, int health, String durr, String[] keys, int essence, int abilNum, String abilNeed, String flavor)
	{
		name = n;
		hasPrereq = preCharm;
		prerequisites = prereqs;
		isExcellency = excellent;
		moteCost = motes;
		willCost = will;
		healthCost = health;
		duration = durr;
		keywords = keys;
		essenceRequirement = essence;
		abilityRequirement = abilNum;
		ability = abilNeed;
		isActive = false;
		flavorText = flavor;
	}
	
	public void printCharm()
	{
		System.out.println(name + ":(" + moteCost + " motes;" + duration + ";" + essenceRequirement + " Essence;" + abilityRequirement + " " + ability + ")");
		System.out.println(flavorText);
		System.out.println();
		System.out.println(keywords[0]);
		
		if(hasPrereq)
		{
			System.out.print("Prerequisits: ");
			
			for(int i = 0; i < prerequisites.length; i++)
			{
				if(prerequisites[i] != null)
				{
					System.out.print(prerequisites[i]);
					
					if(i < prerequisites.length - 1)
					{
						System.out.print(", ");
					}
				}
			}
			
			System.out.println();
		}
		
		System.out.print("Keywords: ");
		for(int i = 1; i < keywords.length; i++)
		{
			System.out.print(keywords[i]);
			
			if(i < keywords.length - 1)
			{
				System.out.print(", ");
			}
		}
		System.out.println();
	}
}
