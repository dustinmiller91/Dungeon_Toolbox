package DMtools.nameGenerators;

import java.util.*;

public class LocationNameGenerator {
  
  // Our prefix words, to be combined with a suffix
  HashSet<String> prefix = new HashSet<String>(Arrays.asList("Black", "White", "Gray", "North", "South", "East",
                                                             "West", "Frost", "Rime", "Oak", "Pine", "Birch", "Pale",
                                                             "Stone", "Iron", "Green", "High", "Round", "Dark", "Dawn",
                                                             "Sun", "Pale", "Cold", "Spring", "Gold", "Moon", "Silver",
                                                             "Red", "Summer", "Winter", "Wind", "Dawn", "River", "Dark",
                                                             "Briar", "Clay", "Sky", "Wild", "Ash", "Heart", "Helm", 
                                                             "Crest", "Ember", "Wild", "Hazel", "Briar"
                                                            ));
  // Our suffix words, to be combined with a prefix
  HashSet<String> suffix = new HashSet<String>(Arrays.asList("keep", "hold", "ville", "boro", "burg", "stone",
                                                             "holt", "tower", "vale", "bridge", "guard", "brook",
                                                             "field", "fall", "fell", "water", "ridge", "ford", "wood",
                                                             "rock", "hollow", "haven", "spring", "bank", "barrow",
                                                             "fort", "crest", "shore", "burn", "forge", "run", "port",
                                                             "view", "helm", "bluff", "moor", "rock", "watch", "march",
                                                             "top", "bottom", "cross", "crest", "fork", "sheild",
                                                             "trail", "wild", "worth", "stead", "moon", "star", "hill",
                                                             "smith", "helm", "forest", "point", "briar", "gate",
                                                             "town"
                                                            ));
  // A set of random animals
  HashSet<String> animals = new HashSet<String>(Arrays.asList("Wolf", "Raven", "Bear", "Eagle", "Hawk", "Elk", "Boar",
                                                              "Bull", "Lion", "Ox", "Horse", "Mule"
                                                             ));
  
  // A set of random monsters
  HashSet<String> monsters = new HashSet<String>(Arrays.asList("Witch", "Drake", "Goblin", "Orc", "Ogre", "Troll",
                                                               "Devil", "Harpy", "Dragon", "Wight", "Hag", "Wyvern",
                                                               "Imp"
                                                              ));
  // A set of place adjectives
  HashSet<String> adjectives = new HashSet<String>(Arrays.asList("Old", "New", "High", "North", "South", "East",
                                                                 "Grand", "White", "Red", "Gray", "Black", "Green"
                                                                ));
  // A set of creature adjectives
  HashSet<String> creatureAdjectives = new HashSet<String>(Arrays.asList("Old", "Dead", "Mad", "Dancing", "Lost",
                                                                         "Wild"                                                  
                                                                        ));
  
  // A set of place nouns
  HashSet<String> nouns = new HashSet<String>(Arrays.asList("Rock", "Creek", "River", "Lake", "Bluff", "Harbor",
                                                            "Tower", "Canyon", "Rest", "Crossing", "Grove", "Hill",
                                                            "Landing", "Junction", "Crag", "Stone", "Mill", "Gate",
                                                            "Marsh", "Bend", "Falls", "Point", "Rock", "Pass", "Refuge"
                                                           ));
  
  public String getRandomElement(HashSet<String> set) {
    int num = (int) (Math.random() * set.size());
    for(String s: set) if (--num < 0) return s;
    throw new AssertionError();
  }
  
// Make the actual title
  public String nameGen(HashSet<String> nameSet) {
    
    String townName = "";
    // Create a new Random object and use it to determine which case we will be used.
    Random r = new Random();
    int random = r.nextInt(12);
    
    // These will be used in our different cases as components of our final town name.
    String var1; String var2; String var3;
    
    switch(random) {
      case 1:
        // Take three elements, checking to avoid repetition, from the Adjective, prefix, and suffix lists.
        var1 = getRandomElement(adjectives);
        do {var2 = getRandomElement(prefix);} while (var1.toLowerCase().equals(var2));
        do {var3 = getRandomElement(suffix);} while (var1.toLowerCase().equals(var3) ||
                                                     var2.toLowerCase().equals(var3));
        townName = var1 + " " + var2 + var3;
        break;
      case 2:
        // Combine two random elements from the monsters and the nouns lists.
        townName += getRandomElement(monsters);
        if (r.nextBoolean()) townName += "'s";
        townName += " " + getRandomElement(nouns);
        break;
      case 3:
        // Combine two random elements from the animals and the nouns lists.
        townName += getRandomElement(animals) + " ";
        townName += getRandomElement(nouns);
        break;
      case 4:
        // Combine two random elements from the animals and the suffix lists.
        townName += getRandomElement(animals);
        townName += getRandomElement(suffix);
        break;
      case 5:
        // Combine two random elements, checking to avoid repetition, from the prefix, suffix, and nouns lists.
        var1 = getRandomElement(prefix);
        do {var2 = getRandomElement(suffix);} while (var1.toLowerCase().equals(var2));
        do {var3 = getRandomElement(nouns);} while (var1.toLowerCase().equals(var3) ||
                                                     var2.toLowerCase().equals(var3));
        townName = var1 + var2 + " " + var3;
        break;
      case 6:
        // Get a random element from the provided name set.
        townName += getRandomElement(nameSet);
        break;
      case 7:
        // Get a two random elements from the nameset and nouns lists.
        townName += getRandomElement(nameSet);
        if (r.nextBoolean()) townName += "'s";
        townName += " " + getRandomElement(nouns);
        break;
      case 8:
        // Get a random adjective, a random monster or animal, and a random noun
        townName += getRandomElement(creatureAdjectives) + " ";
        if (r.nextBoolean()) townName += getRandomElement(animals) + " ";
        else townName += getRandomElement(monsters) + " ";
        townName += getRandomElement (nouns);
        break;
      default:
        // Get two random elements, checking for repetition, from the prefix and suffix lists.
        var1 = getRandomElement(prefix);
        do {var2 = getRandomElement(suffix);} while (var1.toLowerCase().equals(var2));
        townName = var1 + var2;
        
        // townName += getRandomElement(prefix);
        // townName += getRandomElement(suffix);
    }
    return townName;
  }
  
  
  public static void main(String[] args) {
    
    LocationNameGenerator townNameGen = new LocationNameGenerator();
    CharacterNameGenerator charNameGen = new CharacterNameGenerator();
    Random r = new Random();
    HashSet<String> nameSet = new HashSet<String>(Arrays.asList("ERROR"));
    for (int i = 0; i < 20; i++) {
      switch(r.nextInt(3)) {
        case 0:
          nameSet = charNameGen.orcNamesMale_XGE;
          break;
        case 1:
          nameSet = charNameGen.orcNamesFemale_XGE;
          break;
        case 2:
          nameSet = new HashSet<String>(Arrays.asList(charNameGen.orcClanNameGenerator()));;
      }
      System.out.println(townNameGen.nameGen(nameSet));
    }
  }
}