public class App {
    public static void main(String[] args) {

        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyname();
        knight.sayMyagility();
        knight.sayMystrength();
        knight.sayMyintelligence();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyname();
        mage.sayMyagility();
        mage.sayMystrength();
        mage.sayMyintelligence();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyname();
        thief.sayMyagility();
        thief.sayMystrength();
        thief.sayMyintelligence();

        Character archer = new Character();

        archer.strength = 5;
        archer.agility = 5;
        archer.intelligence = 5;
        archer.name = "Sheeeshh";
        archer.sayMyname();
        archer.sayMyagility();
        archer.sayMystrength();
        archer.sayMyintelligence();

        Character sparta = new Character();
        sparta.strength = 10;
        sparta.agility = 9;
        sparta.intelligence = 5;
        sparta.name = "SPAAAARTAAAAAA";
        sparta.sayMyname();
        sparta.sayMyagility();
        sparta.sayMystrength();
        sparta.sayMyintelligence();

    }
}