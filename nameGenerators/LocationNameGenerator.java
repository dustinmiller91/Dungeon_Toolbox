package DMtools.nameGenerators;

import java.util.*;

public class LocationNameGenerator {
  // We'll be using this a lot. Might as well instantiate it here at the top.
  Random r = new Random();
  DMtools.nameGenerators.WordGen w = new DMtools.nameGenerators.WordGen();
  
  // Our prefix words, to be combined with a suffix
  HashSet<String> prefix = new HashSet<String>(Arrays.asList("Black", "White", "Gray", "North", "South", "East",
                                                             "West", "Frost", "Rime", "Oak", "Pine", "Birch", "Pale",
                                                             "Stone", "Iron", "Green", "High", "Round", "Dark", "Dawn",
                                                             "Sun", "Pale", "Cold", "Spring", "Gold", "Moon", "Silver",
                                                             "Red", "Summer", "Winter", "Wind", "Dawn", "River", "Dark",
                                                             "Briar", "Clay", "Sky", "Wild", "Ash", "Heart", "Helm", 
                                                             "Crest", "Ember", "Wild", "Hazel", "Briar", "Silver",
                                                             "Steel", "Bronze", "Skull", "Bone", "Salt", "Storm",
                                                             "Willow", "Cedar", "Maple", "Ash"
                                                            ));
  // Our suffix words, to be combined with a prefix
  HashSet<String> suffix = new HashSet<String>(Arrays.asList("keep", "hold", "ville", "boro", "burg", "stone",
                                                             "holt", "tower", "vale", "bridge", "guard", "brook",
                                                             "field", "fall", "fell", "water", "ridge", "ford", "wood",
                                                             "rock", "hollow", "haven", "spring", "bank", "barrow",
                                                             "fort", "crest", "shore", "burn", "forge", "run", "port",
                                                             "view", "helm", "bluff", "moor", "rock", "watch", "march",
                                                             "top", "bottom", "cross", "fork", "sheild",
                                                             "trail", "wild", "worth", "stead", "moon", "star", "hill",
                                                             "smith", "forest", "point", "briar", "gate",
                                                             "town", "henge", "loft", "marsh", "bone", "skull"
                                                            ));
  
  HashSet<String> suffix_landmarks = new HashSet<String>(Arrays.asList("stone", "vale", "brook", "field", "fall",
                                                                       "fell", "water", "ridge", "ford", "wood", "rock",
                                                                       "hollow", "haven", "spring", "bank", "barrow",
                                                                       "crest", "shore", "burn", "run", "view", "bluff",
                                                                       "moor", "rock", "march", "top", "bottom",
                                                                       "trail", "wild", "moon", "star", "hill", "briar",
                                                                       "henge", "marsh", "wind", "bone", "skull"
                                                                      ));
  
  // A set of random animals
  HashSet<String> animals = new HashSet<String>(Arrays.asList("Wolf", "Raven", "Bear", "Eagle", "Hawk", "Elk", "Boar",
                                                              "Bull", "Lion", "Ox", "Horse", "Mule", "Goat", "Trout",
                                                              "Salmon"
                                                             ));
  
  // A set of random monsters
  HashSet<String> monsters = new HashSet<String>(Arrays.asList("Demon", "Drake", "Goblin", "Orc", "Ogre", "Troll",
                                                               "Devil", "Harpy", "Dragon", "Wight", "Hag", "Wyvern",
                                                               "Imp"
                                                              ));
  // A set of place adjectives
  HashSet<String> adjectives = new HashSet<String>(Arrays.asList("Old", "New", "High", "North", "South", "East",
                                                                 "White", "Crimson", "Howling", "Silver", "Gold",
                                                                 "Iron", "Whispering", "Broken", "Grand", "Bad"
                                                                ));
  // A set of creature adjectives
  HashSet<String> creatureAdjectives = new HashSet<String>(Arrays.asList("Old", "Dead", "Mad", "Dancing", "Lost",
                                                                         "Wild", "Howling", "Laughing", "Drunken",
                                                                         "Jolly"
                                                                        ));
 
  
  // A set of place nouns
  HashSet<String> nouns = new HashSet<String>(Arrays.asList("Rock", "Creek", "River", "Lake", "Bluff", "Harbor",
                                                            "Tower", "Canyon", "Rest", "Crossing", "Grove", "Hill",
                                                            "Landing", "Junction", "Crag", "Stone", "Mill", "Gate",
                                                            "Bend", "Falls", "Point", "Rock", "Pass", "Refuge",
                                                            "Bridge", "Hole", "Watch", "Lookout", "Hollow",
                                                            "Henge", "Keep"
                                                           ));
  
  HashSet<String> landmarkNouns = new HashSet<String>(Arrays.asList("Keep", "Temple", "Monastery", "Castle", "Lookout",
                                                                    "Henge", "Barrow", "Mines", "Quarry", "Camp",
                                                                    "Refuge"
                                                                   ));
  
  // A set of archetypes/people
  HashSet<String> archetypes = new HashSet<String>(Arrays.asList("Reveler", "Miner", "Soldier", "Traveler", "Pilgrim",
                                                                 "Hermit", "Magician", "Priest", "Priestess",
                                                                 "Emperor", "Empress", "Fool", "Beggar", "Hunter",
                                                                 "Wayfarer", "Witch" , "Seer", "King", "Queen",
                                                                 "Drunkard", "Gambler", "Hangman", "Carpenter",
                                                                 "Miller", "Baker", "Butcher"
                                                                ));
  
  
  // A set of "virtues" for lack of a better word
  HashSet<String> virtues = new HashSet<String>(Arrays.asList("Mockery", "Hunger", "Fury", "Desperation", "Celebration",
                                                              "Joy", "Faith", "Mercy", "Despair", "Revelry",
                                                              "Temperance", "Fortune", "Justice", "Judgement",
                                                              "Solitude", "Sunrise", "Sunset", "Folly", "Sorrow",
                                                              "Whimsy", "Triumph", "Victory", "Torment", "Desolation",
                                                              "Echo"
                                                             ));
  
  // Random fun nouns
  HashSet<String> flavorNouns = new HashSet<String>(Arrays.asList("Salt", "Death", "Marble", "Granite", "Horseshoe",
                                                                  "Gallows", "Thunder", "Whisper", "Glass", "Bottle",
                                                                  "Sword", "Mirror", "Iron", "Gold"
                                                                 ));
  // Random fun adjectives
  HashSet<String> flavorAdjectives = new HashSet<String>(Arrays.asList("Haunted", "Flaming", "Narrow", "Broken",
                                                                       "Whispering", "Crimson", "Grand" 
                                                                      ));
  
  // Geographical Landmarks
  HashSet<String> geoLandmarks = new HashSet<String>(Arrays.asList("Canyon", "Rock", "River", "Hill", "Bluff", "Peak",
                                                                   "Crag", "Stone", "Pass", "Point", "Marsh", "Mire",
                                                                   "Creek", "Valley", "Grove", "Forest", "Canyon",
                                                                   "Gorge", "Forest", "Woods", "Cave", "Grotto",
                                                                   "Moor", "Swamp", "Brook", "Lake", "Falls", "Reach",
                                                                   "Ridge", "Brook", "Stream", "Spring"
                                                                  ));
  
  HashSet<String> geoLandmarks_rev = new HashSet<String>(Arrays.asList("Vale", "Lake", "River", "Mount"));
  // Civilization Landmarks
  HashSet<String> civLandMarks = new HashSet<String>(Arrays.asList("Tower", "Keep", "Watch", "Temple", "Monastery",
                                                                   "Sanctum", "Refuge", "Lighthouse", "Bridge", "Mine",
                                                                   "Mill", "Plantation", "Barrow", "Henge", "Lookout",
                                                                   "Outpost"
                                                                  ));
  
  
  // Update this method to be able to accept multiple sets and then re-write earlier code
  @SafeVarargs
  public final String getRandomElement(HashSet<String> ...sets) {
    // Pick one of our varArgs randomly
    HashSet<String> set = sets[r.nextInt(sets.length)];
    // Iterate through and get a random element
    int num = (int) (Math.random() * set.size());
    for(String s : set) if (--num < 0) return s;
    throw new AssertionError();
  }
  
// Make the actual title
  public String townNameGen(String lang) { // HashSet<String> nameSet) {
    
    String townName = "";
    // Create a new Random object and use it to determine which case we will be used.
    Random r = new Random();
    int random = r.nextInt(11);
    
    // These will be used in our different cases as components of our final town name.
    String var1; String var2; String var3;
    
    switch(random) {
      case 0:
        // Take three elements, checking to avoid repetition, from the Adjective, prefix, and suffix lists.
        var1 = getRandomElement(adjectives);
        do {var2 = getRandomElement(prefix);} while (var1.toLowerCase().equals(var2));
        do {var3 = getRandomElement(suffix);} while (var1.toLowerCase().equals(var3) ||
                                                     var2.toLowerCase().equals(var3));
        townName = var1 + " " + var2 + var3;
        break;
      case 1:
        // Combine two random elements from the monsters and the nouns lists.
        townName += getRandomElement(monsters);
        if (r.nextBoolean()) townName += "'s";
        townName += " " + getRandomElement(nouns);
        break;
      case 2:
        // Combine two random elements from the animals and the nouns lists.
        townName += getRandomElement(animals) + " ";
        townName += getRandomElement(nouns);
        break;
      case 3:
        // Combine two random elements from the animals and the suffix lists.
        townName += getRandomElement(animals);
        townName += getRandomElement(suffix);
        break;
      case 4:
        // Combine two random elements, checking to avoid repetition, from the prefix, suffix, and nouns lists.
        var1 = getRandomElement(prefix);
        do {var2 = getRandomElement(suffix);} while (var1.toLowerCase().equals(var2));
        do {var3 = getRandomElement(nouns);} while (var1.toLowerCase().equals(var3) ||
                                                     var2.toLowerCase().equals(var3));
        townName = var1 + var2 + " " + var3;
        break;
      case 5:
        // Get a random adjective, a random monster or animal, and a random noun
        townName += getRandomElement(creatureAdjectives) + " ";
        if (r.nextBoolean()) townName += getRandomElement(animals) + " ";
        else townName += getRandomElement(monsters) + " ";
        townName += getRandomElement (nouns);
        break;
      case 6:
        // Get a random archetype and a random virtue
        townName += getRandomElement(archetypes) + "'s ";
        townName += getRandomElement(virtues);
        break;
      case 7:
        // Get a random virtue and a random noun
        townName += getRandomElement(virtues) + " ";
        townName += getRandomElement(nouns);
        break;
      case 8:
        // Get a random archetype and a random noun
        townName += getRandomElement(archetypes) + "'s ";
        townName += getRandomElement(nouns);
        break;
      case 9:
      case 10:
        // Get a random word/name
        townName += w.getWord(lang);
        break;
      case 11:
        townName += w.getWord(lang) + " ";
        townName += getRandomElement(nouns);
        break;
      default:
        // Get two random elements, checking for repetition, from the prefix and suffix lists.
        var1 = getRandomElement(prefix);
        do {var2 = getRandomElement(suffix);} while (var1.toLowerCase().equals(var2));
        townName = var1 + var2;
    }
    return townName;
  }
  
  
  public String geoLandmarkNameGen(String lang) {
    
    String locationName = "";
    // Create a new Random object and use it to determine which case we will be used.
    Random r = new Random();
    int random = r.nextInt(13);
    
    // These will be used in our different cases as components of our final location name.
    String var1; String var2;
    
    switch(random) {
      case 0:
        // Combine two random elements from the animals list.
        locationName += getRandomElement(animals, monsters);
        if (r.nextBoolean()) locationName += "'s";
        locationName += " " + getRandomElement(geoLandmarks);
        break;
      case 1:
        // Combine two random elements from the animals and the suffix lists.
        locationName += getRandomElement(animals, monsters);
        locationName += getRandomElement(suffix_landmarks);
        locationName += " " + getRandomElement(geoLandmarks);
        break;
      case 2:
        // Get a random adjective and a random monster or animal
        locationName += getRandomElement(creatureAdjectives) + " ";
        locationName += getRandomElement(animals, monsters);
        locationName += " " + getRandomElement(geoLandmarks);
        break;
      case 3:
        // Get a random archetype
        locationName += getRandomElement(archetypes);
        if (r.nextBoolean()) locationName += "'s";
        locationName += " " + getRandomElement(geoLandmarks);
        break;
      case 4:
        // Get a random virtue
        locationName += getRandomElement(virtues);
        locationName += " " + getRandomElement(geoLandmarks);
        break;
      case 5:
        // Get a random flavor noun
        locationName += getRandomElement(flavorNouns);
        locationName += " " + getRandomElement(geoLandmarks);
        break;
      case 6:
        // Get a random flavor adjective
        locationName += getRandomElement(flavorAdjectives);
        locationName += " " + getRandomElement(geoLandmarks);
        break;
      case 7:
      case 8:
        // Use a name
        locationName += w.getWord(lang);
        locationName += " " + getRandomElement(geoLandmarks);
        break;
      case 9: 
        locationName += getRandomElement(geoLandmarks_rev);
        locationName += " " + w.getWord(lang);
        break;
      default:
        // Get two random elements, checking for repetition, from the prefix and suffix lists.
        var1 = getRandomElement(prefix);
        do {var2 = getRandomElement(suffix_landmarks);} while (var1.toLowerCase().equals(var2));
        locationName = var1 + var2;
        locationName += " " + getRandomElement(geoLandmarks);
        break;
    }
    return locationName;
  }
  
  
  public String civLandmarkNameGen(String lang) {
    String locationName = "";
    // Create a new Random object and use it to determine which case we will be used.
    Random r = new Random();
    int random = r.nextInt(13);
    
    // These will be used in our different cases as components of our final location name.
    String var1; String var2;
    
        switch(random) {
      case 0:
        // Combine two random elements from the animals list.
        locationName += getRandomElement(animals, monsters);
        if (r.nextBoolean()) locationName += "'s";
        locationName += " " + getRandomElement(geoLandmarks);
        break;
      case 1:
        // Combine two random elements from the animals and the suffix lists.
        locationName += getRandomElement(animals, monsters);
        locationName += getRandomElement(suffix_landmarks);
        locationName += " " + getRandomElement(geoLandmarks);
        break;
      case 2:
        // Get a random adjective and a random monster or animal
        locationName += getRandomElement(creatureAdjectives) + " ";
        locationName += getRandomElement(animals, monsters);
        locationName += " " + getRandomElement(geoLandmarks);
        break;
      case 3:
        // Get a random archetype
        locationName += getRandomElement(archetypes);
        if (r.nextBoolean()) locationName += "'s";
        locationName += " " + getRandomElement(geoLandmarks);
        break;
      case 4:
        // Get a random virtue
        locationName += getRandomElement(virtues);
        locationName += " " + getRandomElement(geoLandmarks);
        break;
      case 5:
        // Get a random flavor noun
        locationName += getRandomElement(flavorNouns);
        locationName += " " + getRandomElement(geoLandmarks);
        break;
      case 6:
        // Get a random flavor adjective
        locationName += getRandomElement(flavorAdjectives);
        locationName += " " + getRandomElement(geoLandmarks);
        break;
      case 7:
      case 8:
        // Use a name
        locationName += w.getWord(lang);
        locationName += " " + getRandomElement(geoLandmarks);
        break;
      case 9: 
        locationName += getRandomElement(geoLandmarks_rev);
        locationName += " " + w.getWord(lang);
        break;
      default:
        // Get two random elements, checking for repetition, from the prefix and suffix lists.
        var1 = getRandomElement(prefix);
        do {var2 = getRandomElement(suffix_landmarks);} while (var1.toLowerCase().equals(var2));
        locationName = var1 + var2;
        locationName += " " + getRandomElement(geoLandmarks);
        break;
    }
    return locationName;
  }
  
  public static void main(String[] args) {
    
    LocationNameGenerator locNameGen = new LocationNameGenerator();
    for (int i = 0; i < 20; i++) {
      System.out.println(locNameGen.townNameGen("Orc"));
    }
  }
}