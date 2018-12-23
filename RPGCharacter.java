enum RPGClass { MAGE, RANGER, WARRIOR };
public class RPGCharacter {
	RPGClass myClass;
	String name;
	double level, xp, hp, armor, damage;
	public RPGCharacter(String name, RPGClass myClass, double level) {
		this.name = name;
		this.level = level;
		this.xp = level*10;
		this.myClass = myClass;
		this.hp = level*100;
		updateStats();
	}
	public RPGCharacter() {
		
	}
	public void updateStats() {
		if (xp >= level*10 + 10)
			level++;
		if (myClass == RPGClass.MAGE) {
			armor = 25 + (level-1);
			if (armor > 40)
				armor = 40;
			damage = 100 + (level-1)*4;
		}
			else if (myClass == RPGClass.RANGER) {
				armor = 50 + (level-1);
				if (armor > 65) 
					armor = 65;
				damage = 66 + (level-1)*2;
			}
			else if (myClass == RPGClass.WARRIOR) {
				armor = 75 + (level-1);
				if (armor > 90) 
					armor = 90;
				damage = 33 + (level-1);
			}
	}
	public RPGClass getCharacterClass() {
		return myClass;
	}
	public void setMyClass(RPGClass myClass) {
		this.myClass = myClass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLevel() {
		return level;
	}
	public void setLevel(double level) {
		this.level = level;
	}
	public double getXP() {
		return xp;
	}
	public void setXP(double xp) {
		this.xp = xp;
	}
	public double getHP() {
		return hp;
	}
	public void setHP(double hp) {
		this.hp = hp;
	}
	public double getArmor() {
		return armor;
	}
	public void setArmor(double armor) {
		this.armor = armor;
	}
	public double getDamage() {
		return damage;
	}
	public void setDamage(double damage) {
		this.damage = damage;
	}
	public int attack(RPGCharacter npc1) {
		boolean didHit = false;
		int damageDone = 0;
		double hitChance = xp / (npc1.getXP() + xp);
		double roll = Math.random();
		if (roll <= hitChance) {
			didHit = true;
		}
		if (roll > hitChance) {
			didHit = false;
		}
		if (didHit == true) {
			damageDone = (int)(damage*(npc1.getArmor()*.01));
			npc1.setHP(npc1.getHP() - damageDone);
			if (npc1.getHP()<=0) {
				if (npc1.getLevel() < level)
					xp += 2;
				if (npc1.getLevel() > level)
					xp += 6;
				if (npc1.getLevel() == level) 
					xp += 4;
				}
			updateStats();
			}
		return (damageDone);
		}
	public void fightToTheDeath(RPGCharacter npc1) {
		boolean cont = true;
		while (cont) {
			attack(npc1);
				if (npc1.getHP()<=0) {
					cont = false;
				}
			npc1.attack(this);
				if (hp <= 0) {
					cont = false;
				}
		}
	}
	public void incLevel() {
		xp += 10;
		updateStats();
	}
	public boolean isAlive() {
		boolean alive = true;
			if (hp <= 0) {
				alive = false;
			}
			return alive;
	}
	public void rejuvinate() {
		setHP(level*100);
	}
	public String toString() {
		String s = "";
		s += (name + "(Level "+level+" "+ myClass+")");
		s += ("\n     XP: "+xp);
		s += ("\n     HP: "+hp);
		s += ("\n     Armor: "+armor);
		s += ("\n     Damage: "+damage);
		return s;
	}
	
	}
