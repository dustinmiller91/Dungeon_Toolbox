package DMtools;
import java.util.*;


/* TODO
 *-Add default constructor for NPC where everything is randomized
 * -Add additional constructors for NPCs with optional parameters
 * -Add toString method to NPC class
 */
public class NPCGenerator {
  // We'll be using this a lot.
  Random r = new Random();
  
  // Thank you based Stack Overflow
  public String getRandomElement(HashSet<String> set) {
    int num = (int) (Math.random() * set.size());
    for(String s: set) if (--num < 0) return s;
    throw new AssertionError();
  }
  
  // a NPC class to store all generated data.
  class NPC {
    String race;
    String name;
    String age;
    boolean gender;
    String profession;
    
    // Update this here
    public String toString() {
      return "TODO";
    }
    
    // Constructors will probably have to take CharacterNameGenerator as a parameter in order to work properly
    NPC(NPCGenerator gen, DMtools.nameGenerators.CharacterNameGenerator nameGen) {
      race = gen.getRandomRace();
      gender = gen.r.nextBoolean();
      // name = nameGen.get
    }
    
    
    
  }
  
  // Lists of professions, loosely sorted by rarity/income
  HashSet<String> professionsT1 = new HashSet<String>(Arrays.asList("Miner", "Butcher", "Baker", "Farmer", "Hunter",
                                                                    "Laborer", "Cook", "Barkeep", "Stablehand", "Thug",
                                                                    "Logger", "Fisherman", "Courier", "Weaver", "Whore",
                                                                    "Servant", "Beggar", "Ferryman", "Squire", "Sailor",
                                                                    "Herdsman", "Bricklayer", "Roofer", "Builder",
                                                                    "Ropemaker", "Coachman", "Dockworker", "Porter"
                                                                   ));
  
  HashSet<String> professionsT2 = new HashSet<String>(Arrays.asList("Shopkeeper", "Merchant", "Tailor", "Blacksmith",
                                                                    "Guard", "Brewer", "Stonemason", "Miller",
                                                                    "Cobbler", "Glassblower", "Beekeeper",
                                                                    "Midwife", "Fletcher", "Soldier", "Tanner",
                                                                    "Barber", "Carpenter", "Brigand", "Gardener",
                                                                    "Jailer", "Bard", "Bounty Hunter", "Artist",
                                                                    "Stabler", "Barbarian", "Pilgirm", "Shipbuilder"
                                                                   ));
  
  HashSet<String> professionsT3 = new HashSet<String>(Arrays.asList("Doctor", "Banker", "Scribe", "Jeweler",
                                                                    "Architect", "Knight", "Sheriff", "Priest",
                                                                    "Cartographer", "Librarian", "Barrister",
                                                                    "Tinker", "Guard Captain", "Magistrate",
                                                                    "Ship's Captain", "Perfumer", "Goldsmith",
                                                                    "Silversmith", "Winemaker", "Translator", "Scholar",
                                                                    "Spy", "Illuminator", "Courtier"
                                                                   ));
  
  HashSet<String> professionT4 = new HashSet<String>(Arrays.asList("Alchemist", "Noble", "Wizard"
                                                                  ));
  
  // Lists of races, sorted by rarity
  HashSet<String> racesT1 = new HashSet<String>(Arrays.asList("Elf", "Half-Elf", "Gnome", "Halfling", "Half-Orc",
                                                              "Dwarf"
                                                             ));
  
  HashSet<String> racesT2 = new HashSet<String>(Arrays.asList("Dragonborn", "Tiefling", "Goblin"));
  
  HashSet<String> racesT3 = new HashSet<String>(Arrays.asList("Goliath", "Kobold", "Tabaxi", "Orc", "Hobgoblin"
                                                             ));
  
  HashSet<String> racesT4 = new HashSet<String>(Arrays.asList("Shifter", "Changeling", "Kenku", "Bugbear", "Grung",
                                                              "Triton", "Aarakocra", "Firbolg", "Lizardfolk", "Eladrin",
                                                              "Genasi", "Gith", "Tortle"
                                                             ));
  
  public String getRandomRace() {
    // Get our random seed
    int random = r.nextInt(15);
    
    switch(random) {
      case 7:
      case 8:
      case 9:
      case 10:
        return getRandomElement(racesT1);
      case 11:
      case 12:
        return getRandomElement(racesT2);
      case 13:
      case 14:
        return getRandomElement(racesT3);
      case 15:
        return getRandomElement(racesT4);
      default:
        return "Human";
    }
  }
  
  public static void main(String[] args) {
    NPCGenerator test = new NPCGenerator();
    System.out.println(test.getRandomRace());
  }
}