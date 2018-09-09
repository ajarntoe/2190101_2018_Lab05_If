
public class YugiOhCard {
	String name;
	int level;
	int attack;
	int defence;

	public YugiOhCard(String name, int level, int attack, int defence) {
		super();
		this.name = name;
		this.level = level;
		this.attack = attack;
		this.defence = defence;
	}

	public boolean equals(Object o) {
		YugiOhCard o2 = (YugiOhCard) o;
		//return true; //remove this line
		// fill in the rest of the code
		return (name.equals(o2.name) && level == o2.level && attack == o2.attack && defence == o2.defence) ;

	}

}
