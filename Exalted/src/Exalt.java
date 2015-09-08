
public class Exalt
{
	//Concept
	String name;
	String exaltType;
	String caste;
	String anima;
	
	//Attributes
		///Physical
		int strength;
		int dexterity;
		int stamina;
		
		////Mental
		int intelligence;
		int wits;
		int perception;
		
		////Social
		int charisma;
		int manipulation;
		int appearance;
	
	//Abilities
	int[] abilities = new int[30];
	String[] abilityNames = {"Archery", "Athletics", "Awareness", "Bureaucracy", "Craft(Air)", "Craft(Water)", "Craft(Fire)", "Craft(Earth)", "Craft(Wood)",
	 "Craft(Other)", "Dodge", "Integrity", "Investigation", "Larceny", "Linguistics", "Lore", "Martial Arts", "Medicine", "Melee", "Occult", "Performance",
	 "Presence", "Resistance", "Ride", "Sail", "Socialize", "Stealth", "Survival", "Thrown", "War"};
	
	//Advantages
	int willpower;
	int tempWillpower;
	////virtues
	int valor;
	int temperance;
	int compassion;
	int conviction;
	
	int limit;
	int basePersonalMotes;
	int currPersonalMotes;
	int basePeripheralMotes;
	int currPeripheralMotes;
	
	String virtueFlaw;
	int essence; //Essence Level
	
	//Background
	///Oh gods I'll worry about this later
	
	//Charms
	///Will require a separate class, likely an array of sorts
	Charm[] charms = new Charm[100];
	
	//Martial Arts
	///See Charms
	
	//Sorcery
	///AHHHHHHHHHHH
	
	//Specialties
	//tempted to do another class for this too
	
	//Other things
	////Health - Current health starts at max health, and decreases as we take damage.
	////cont.    *Points are the point at which we transition. If we had 10 health, three of which were 
	////cont.    minus 0s, then zeroPoint would be 8. (The last health level that's a zero.) If two were
	////cont.    minus 1s, then onePoint would be 6. (the last health level that's a 1.)
	int maxHealth;
	int currHealth;
	int zeroPoint;
	int onePoint;
	int twoPoint;
	int threePoint;
	int fourPoint;
	int incapPoint;
	int dyingPoint;
	
	int joinBattle;
	
	//Armor
	///Class this
	
	//Soaks
	int bashingSoak;
	int lethalSoak;
	int aggrivatedSoak;
	int bHardness;
	int lHardness;
	int aHardness;
	
	int dodgeDV;
	int parryDV;
	int mentalDodge;
	int mentalParry;
	
	//Artifacts
	///Just names for now
	String[] artifacts;
	
	//Weapons
	///Class this
	
	int totalExperience;
	int availableExperience;
	int bonusPoints;
	
	public Exalt()
	{
		name = "Dead Tom";
		exaltType = "none";
		caste = "none";
		anima = name + " has no anima.";
		
		//Attributes
		///Physical
		strength = 1;
		dexterity = 1;
		stamina = 1;
		
		////Mental
		intelligence = 1;
		wits = 1;
		perception = 1;
		
		////Social
		charisma = 1;
		manipulation = 1;
		appearance = 1;
		
		//Abilities
		for(int i = 0; i < abilities.length; i++)
		{
			abilities[i] = 0;
		}
		
		//Advantages
		willpower = 5;
		tempWillpower = willpower;
		///virtues
		valor = 1;
		temperance = 1;
		compassion = 1;
		conviction = 1;
		
		limit = 0;
		basePersonalMotes = 0;
		currPersonalMotes = basePersonalMotes;
		basePeripheralMotes = 0;
		currPeripheralMotes = basePeripheralMotes;
		
		virtueFlaw = "None";
		essence = 1; //Essence Level
		
		//Background
		///Oh gods I'll worry about this later
		
		//Charms
		///Will require a separate class, likely an array of sorts
		
		//Martial Arts
		///See Charms
		
		//Sorcery
		///AHHHHHHHHHHH
		
		//Specialties
		//tempted to do another class for this too
		
		//Other things
		////Health
		maxHealth  = 7;
		zeroPoint  = 7;
		onePoint   = 5;
		twoPoint   = 3;
		fourPoint  = 2;
		incapPoint = 1;
		dyingPoint = 0;
		
		currHealth = 7;
		
		//Armor
		///Class this
			
		//Artifacts
		///Just names for now
		artifacts = new String[1];
		artifacts[0] = "Sad Broken Soulsteel Tiara";
		
		//Weapons
		///Class this
		///GAAAAH
		
		totalExperience = 0;
		availableExperience = totalExperience;
		bonusPoints = 0;
		
		doMath();
	}
	
	//Calculates calculatable values
	public void doMath()
	{
		basePersonalMotes = (essence *3) + willpower ;
		basePeripheralMotes = (essence *7) + willpower + valor + temperance + compassion + conviction;
		
		joinBattle = wits + abilities[2]; //Wits + Awareness
		
		//Armor
		///Class this
		
		//Soaks
		bashingSoak = stamina;
		lethalSoak = stamina/2;
		
		dodgeDV = (dexterity + abilities[10] + essence)/2;					//(Dex + Dodge + Essence)/2
		parryDV = dexterity + abilities[18]; //Plus weapon defense			//Dex + Melee + Weapon Defense
		mentalDodge = (willpower + abilities[11] + essence)/2;			//(Willpower + integrity + essence)/2
		mentalParry = charisma + abilities[21];							//Many options, go with highest, this case uses Charisma + Presence
		
	}
	
	public Exalt(String n, String type, String kaste, int str, int dex, int sta, int cha, int manip, int looks, int per, int intel, int wit, int[] abiliti, int will, int ess, int val, int comp, int conv, int temp, String vFlaw)
	{
		name = n;
		exaltType = type;
		caste = kaste;
		strength = str;
		dexterity = dex;
		stamina = sta;
		charisma = cha;
		manipulation = manip;
		appearance = looks;
		perception = per;
		intelligence = intel;
		wits = wit;
		for(int i = 0; i < abilities.length; i++)
		{
			abilities[i] = abiliti[i];
		}
		willpower = will;
		essence = ess;
		valor = val;
		conviction = conv;
		compassion = comp;
		temperance = temp;
		
		tempWillpower = willpower;
		limit = 0;
		//Mote calculation based on Solar exalt
		basePersonalMotes = (essence*3) + willpower;
		currPersonalMotes = basePersonalMotes;
		basePeripheralMotes = (essence*7) + willpower + (conviction + temperance + compassion + valor);
		currPeripheralMotes = basePeripheralMotes;
		
		virtueFlaw = vFlaw;
		
		zeroes = 1;
		ones = 2;
		twos = 2;
		fours = 1;
		incap = 1;
		dying = stamina;
		
		currZeroes = zeroes;
		currOnes = ones;
		currTwos = twos;
		currFours = fours;
		currIncap = incap;
		currDying = dying;
		
		
		joinBattle = wits + abilities[2]; //Wits + Awareness
		
		//Armor
		///Class this
		
		//Soaks
		bashingSoak = stamina;
		lethalSoak = stamina/2;
		aggrivatedSoak = 0;
		bHardness = 0;
		lHardness = 0;
		aHardness = 0;
		
		dodgeDV = (dexterity + abilities[10] + essence)/2;					//(Dex + Dodge + Essence)/2
		parryDV = dexterity + abilities[18]; //Plus weapon defense			//Dex + Melee + Weapon Defense
		mentalDodge = (willpower + abilities[11] + essence)/2;				//(Willpower + integrity + essence)/2
		mentalParry = charisma + abilities[21];								//Many options, go with highest, this case uses Charisma + Presence
		
		//Artifacts
		///Just names for now
		artifacts = new String[1];
		artifacts[0] = "Sad Broken Soulsteel Tiara";
		
		//Weapons
		///Class this
		
		totalExperience = 0;
		availableExperience = totalExperience;
		bonusPoints = 0;
		
	}
	
	
	//Print the entire character sheet
	//Note: Ignores Abilities at a skill level of 0
	public void printChar()
	{
		System.out.print("Name: " + name);
		if(exaltType.equalsIgnoreCase("dragonblood"))
		{
			System.out.println(", " + caste + " aspect " + exaltType);
		}
		else if(!exaltType.equalsIgnoreCase("none"))
		{
			System.out.println(", " + caste + " caste " + exaltType);
		}
		else
		{
			System.out.println(", mortal weakling.");
		}
		
		printDots("Essence", essence);
		printDots("Willpower", willpower);
		
		System.out.println();
		
		printDots("Strength", strength);
		printDots("Dexterity", dexterity);
		printDots("Stamina", stamina);
		
		System.out.println();
		
		printDots("Charisma", charisma);
		printDots("Manipulation", manipulation);
		printDots("Appearance", appearance);
		
		System.out.println();
		
		printDots("Perception", perception);
		printDots("Intelligence", intelligence);
		printDots("Wits", wits);
		
		System.out.println();
		
		for(int i = 0; i < abilities.length; i++)
		{
			if(abilities[i] > 0)
			{
				printDots(abilityNames[i], abilities[i]);
			}
		}
		
		System.out.println();
		
		//Charms!
		if(charms[0] != null)
		{
			for(int i = 0; i < charms.length; i++)
			{
				if(charms[i] == null)
				{
					break;
				}
				else
				{
					System.out.println(charms[i].name + " : " + charms[i].ability);
				}
			}
		}
	}
	
	public void printDots(String what, int num)
	{
		int cap = 5;
		
		if(essence > 5)
		{
			cap = essence;
		}
		
		if(what.equalsIgnoreCase("willpower"))
		{
			cap = 10;
		}
		
		System.out.print(what + ": ");
		
		for(int i = 0; i < cap; i++)
		{
			if(i < num)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print("o");
			}
		}
		
		System.out.println();
	}
}
