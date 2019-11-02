package DMtools.nameGenerators;
import java.util.*;

public class WordGen {
  
  Random r = new Random();
  
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
  
  // Letter combination sets for Elf
  HashSet<String> elfConsonantsT1 = new HashSet<String>(Arrays.asList("n", "th", "l", "r", "s", "k", "r",
                                                                      "f", "m", "h", "n", "b"));
  HashSet<String> elfConsonantsT2 = new HashSet<String>(Arrays.asList("rt", "tr", "yl", "str", "thqu", "ll", "s", "st",
                                                                      "qu", "'"));
  HashSet<String> elfVowelsT1 = new HashSet<String>(Arrays.asList("a", "e", "ia", "ei", "ae", "u", "i", "o", "'"));
  HashSet<String> elfVowelsT2 = new HashSet<String>(Arrays.asList("ia", "ei", "au", "ua", "eu", "aia"));
  HashSet<String> elfChunks = new HashSet<String>(Arrays.asList());
  HashSet<String> elfRemovePrime = new HashSet<String>(Arrays.asList());
  HashSet<String> elfRemoveTerminal= new HashSet<String>(Arrays.asList("tr", "qu", "rt"));

  
  // Letter combination sets for Orc. Short, hard, brutal, strong, simple.
  HashSet<String> orcConsonantsT1 = new HashSet<String>(Arrays.asList("m", "g", "r", "d", "th", "k", "h", "s", "sk", "sh"
                                                                   ));
  HashSet<String> orcConsonantsT2 = new HashSet<String>(Arrays.asList("rg", "rth", "rd", "gr", "thr", "dr", "kr", "sk"
                                                                     ));
  HashSet<String> orcVowelsT1 = new HashSet<String>(Arrays.asList("o", "u", "a", "e"));
  HashSet<String> orcVowelsT2 = new HashSet<String>(Arrays.asList("oa", "au"));
  HashSet<String> orcChunks = new HashSet<String>(Arrays.asList("grom", "gron", "neg", "rok", "rosh", "dash", "dal",
                                                                "mok", "nath", "thal", "morg", "gar", "drak", "rus",
                                                                "usk", "skal", "kald", "lor", "lok", "tar", "ogar",
                                                                "kru"));
  HashSet<String> orcRemovePrime = new HashSet<String>(Arrays.asList("rth", "rd", "rg"));
  HashSet<String> orcRemoveTerminal = new HashSet<String>(Arrays.asList("gr", "hr", "kr", "dr"));
  
  // Wordsets for Orc clan names
  HashSet<String> orcPrefix = new HashSet<String>(Arrays.asList("Blood", "Black", "Red", "Flame", "Storm", "War",
                                                                "Shadow", "Night", "Frost", "Wild", "Dead", "Spine"));
  HashSet<String> orcSuffix = new HashSet<String>(Arrays.asList("axe", "club", "fist", "rage", "blood", "stone", "rock",
                                                                "heart", "song", "bone", "fang", "hammer", "scream",
                                                                "skull", "claw", "wolf", "reaver", "song", "wind",
                                                                "maul"
                                                               ));
  HashSet<String> orcAdjectives = new HashSet<String>(Arrays.asList("Bleeding", "Screaming", "Broken", "Burning",
                                                                    "Howling"));
  HashSet<String> orcNouns = new HashSet<String>(Arrays.asList("Stone", "Skull", "Axe", "Fist", "Bone", "Fang", "Spear"
                                                              ));
  
  // Letter combination sets for Common
  HashSet<String> commonConsonantsT1 = new HashSet<String>(Arrays.asList("d", "n", "m", "g", "r", "s", "k", "b", "l",
                                                                       "t", "h", "w", "ch", "th", "v", "h"));
  HashSet<String> commonConsonantsT2 = new HashSet<String>(Arrays.asList("rn", "lm", "rn", "rt", "st",
                                                                               "lth", "st", "ck"));
  HashSet<String> commonVowelsT1 = new HashSet<String>(Arrays.asList("a", "e", "i", "o"));
  HashSet<String> commonVowelsT2 = new HashSet<String>(Arrays.asList("ea", "eu", "au", "y", "ie", "ou"));
  HashSet<String> commonRemovePrime = new HashSet<String>(Arrays.asList("rt", "lth", "ck", "rn", "lm", "ou", "ouo",
                                                                        "oi", "ib", "lb", "sth"
  ));
  HashSet<String> commonRemoveTerminal = new HashSet<String>(Arrays.asList("ch", "sc"));
  HashSet<String> commonChunks = new HashSet<String>(Arrays.asList("aithe", "aren", "arion", "ellan", "eghan",
                                                                   "arge", "ander", "ill", "arth", "orin", "ennie",
                                                                   "enna", "enne", "alena", "elena", "elle",
                                                                   "eynard", "anton", "aude", "alic", "ames",
                                                                   "edrik", "bern", "fred", "will", "bert", "burn",
                                                                   "bach", "aston", "walt", "bob", "wynn", "gwen",
                                                                   "wend", "dell", "mina", "frey", "ashe", "brill",
                                                                   "mead", "mel", "wald", "ette", "don", "etta",
                                                                   "bell", "lysa", "lian", "ender", "lana",
                                                                   "atri", "lora", "rine", "rite", "ward", "neth",
                                                                   "elia", "theo", "sam", "bert", "vera", "hem",
                                                                   "thew", "curt", "kenn", "anne", "iel", "chad",
                                                                   "well", "ilian", "ina", "ode", "olli", "iver", "old",
                                                                   "enyth", "arth", "thor", "stace", "than", "mera",
                                                                   "mer", "rian", "rell"
                                                                  ));
  
  // Letter and combination sets for Draconic. Sibilant, regal, ancient, brutal, foreign
  HashSet<String> draconicConsonantsT1 = new HashSet<String>(Arrays.asList("z", "s", "n", "d", "r", "t", "x", "l",
                                                                           "b", "k", "'", "v"
                                                                          ));
  HashSet<String> draconicConsonantsT2 = new HashSet<String>(Arrays.asList("zz", "ph", "y", "yx", "ndr", "yl", "xyn",
                                                                           "ryx", "ss", "g", "ld", "lt", "zyx",
                                                                           "rb", "br", "'", "sh"
                                                                          ));
  HashSet<String> draconicChunks = new HashSet<String>(Arrays.asList("andra", "zyx", "xyl", "tiryx", "arin", "obex",
                                                                     "ial", "rul", "xalor", "sari", "phos", "kiph",
                                                                     "baryx", "kalid", "oros", "oryx", "dax", "ander",
                                                                     "kali", "xan", "xil", "bel", "ius", "shir", "resh", 
                                                                     "ibin", "avai", "urux", "uruz", "ssur", "shur",
                                                                     "syz", "yrus", "biak", "ezo", "esha", "xos",
                                                                     "tyryx", "toph", "iss", "as", "andra", "manu",
                                                                     "byses", "orb", "xaro", "oby", "rian", "bian",
                                                                     "dian", "vor", "ryx", "shev"
  ));
  HashSet<String> draconicVowelsT1 = new HashSet<String>(Arrays.asList("a", "o", "i", "e", "u", "ae", "ia"));
  HashSet<String> draconicVowelsT2 = new HashSet<String>(Arrays.asList("a", "o", "i", "e", "u", "ae", "ia"));
  HashSet<String> draconicRemovePrime = new HashSet<String>(Arrays.asList("eau", "ss", "ld", "lt", "rb", "ndr", "yl",
                                                                          "br", "ll", "zz", "aeu", "ie"));
  HashSet<String> draconicRemoveTerminal = new HashSet<String>(Arrays.asList("ug", "zz", "ll", "ss"));
  
  HashSet<String> dwarfClanPrefix = new HashSet<String>(Arrays.asList("battle", "broad", "strong", "black", "stout",
                                                                      "wild", "gray", "stone", "bronze", "iron",
                                                                      "silver", "frost"
                                                                     ));
  
  
  
  HashSet<String> dwarfClanSuffix = new HashSet<String>(Arrays.asList("hammer", "axe", "brew", "anvil", "beard",
                                                                      "mountain", "smith", "fist", "banner", "hand",
                                                                      "forge"
                                                                     ));
  HashSet<String> dwarfClanEnemies = new HashSet<String>(Arrays.asList("orc", "goblin", "giant", "foe"));
  HashSet<String> dwarfClanActions = new HashSet<String>(Arrays.asList("fighter", "slayer", "killer", "foe"));
  
  /**
   * Creates a random Orc clan name.
   */
  public String orcClanName() {  
    String clanName = "";
    int random = r.nextInt(3);
    // Generate a name using random list elements 
    switch(random) {
      case 0:
        clanName += getRandomElement(orcAdjectives) + "-";
        clanName += getRandomElement(orcNouns);
        break;
      default:
        clanName += getRandomElement(orcPrefix);
        clanName += getRandomElement(orcSuffix);
    }
    return clanName;
  }
  
  
  public String dwarfClanName() {
    String clanName = "";
    int random = r.nextInt(3);
    // Only one case right now. This will be extended eventually to encompass other naming patterns for more variation
    switch(random) {
      default:
        clanName += getRandomElement(dwarfClanPrefix);
        clanName += getRandomElement(dwarfClanSuffix);
    }
    // Capitalize and return
    return clanName.substring(0, 1).toUpperCase() + clanName.substring(1);
  }
  
  /**
   * Builds our list of sets
   * @param race The race/language the word to be generated is for.
   * @return sets An array of sets containing our letter combinations, to be used by the getRandomWord method
   */
  @SuppressWarnings("unchecked")
  public HashSet<String>[] getSets(String race) {
    // Building our arrays of sets
    HashSet<String>[] sets;
    switch(race) {
      default:
      case "Common":
        sets = new HashSet[] {commonConsonantsT1, commonConsonantsT2, commonVowelsT1, commonVowelsT2,
        commonChunks, commonRemovePrime, commonRemoveTerminal};
        break;
      case "Draconic":
        sets = new HashSet[] {draconicConsonantsT1, draconicConsonantsT2, draconicVowelsT1, draconicVowelsT2,
        draconicChunks, draconicRemovePrime, draconicRemoveTerminal};
        break;
      case "Elf":
        sets = new HashSet[] {elfConsonantsT1, elfConsonantsT2, elfVowelsT1, elfVowelsT2, elfChunks,
        elfRemovePrime, elfRemoveTerminal};
        break;
      case "Orc":
        sets = new HashSet[] {orcConsonantsT1, orcConsonantsT2, orcVowelsT1, orcVowelsT2, orcChunks,
        orcRemovePrime, orcRemoveTerminal};
        break;
    }
    return sets;
  }
  
  
  /**
   * Procedurally generates a random word/name. Utilizes a variety of different sets of letter combinations to form
   * language-specific words.
   * 
   * @param race The string specifying what language/race the word will be for
   * @return wordStr A string representing our random word.
   */
  public String getRandomWord(String race) {
    /* sets[0]: consonantsT1 - common consonants
     * sets[1]: consonantsT2 - uncommon consonants
     * sets[2]: vowelsT1 -  common vowels
     * sets[3]: vowelsT2 - uncommon vowels
     * sets[4]: chunks - full syllables to be used as "seeds"
     * sets[5]: removePrime - letter combinations to remove if they appear at the beginning of a word
     * sets[6]: removeTerminal - letter combinations to remove if they appear at the end of a word
     * minLen: The minimum random string length before removals.
     * maxLen: The maximum random string length before removals.
     */
    HashSet<String>[] sets = getSets(race);
    
    // Starting empty string
    String wordStr = "";
    
    // Start by adding a random vowel consonant, or chunk. Duplicates are more likely to be chosen
    if (r.nextBoolean()) {wordStr += getRandomElement(sets[2], sets[2], sets[3]);}
    wordStr += getRandomElement(sets[0], sets[0], sets[1]);
    
    // Determine our random length limit based on the given race
    int minLen = 4; int maxLen = 8;
    switch (race) {
      default:
      case "Common" : minLen = 5; maxLen = 7; break;
      case "Draconic" : minLen = 6; maxLen = 9; break;
      case "Elf" : minLen = 5; maxLen = 8; break;
      case "Orc" : minLen = 4; maxLen = 6; break;
    }
    int randLen = 0;
    while (randLen < minLen) {randLen = r.nextInt(maxLen);}
    
    /* While loop - continuously add cunks that have overlap to the end of our wordStr. If no chunks overlap, add a
     * random vowel/consonant pair instead.
     */
    while(wordStr.length() < randLen) {
      String chunk = "";
      HashSet<String> tempChunks = new HashSet<String>();
      if (r.nextInt(3) > 0) {
        // Make a set of all chunks that have an overlap with the end of wordStr
        for (String s : sets[4]) {
          int len = overlappedStringLength(wordStr, s);
          // Check that there is overlap, as well as text past the overlap (the second condition prevents infinite loops)
          if (len > 0 & len < s.length()) {tempChunks.add(s);}
        }
      }
      // If that set has more than zero elements, we pick one at random as our next chunk to be added
      if (tempChunks.size() > 0) {chunk += getRandomElement(tempChunks);}
      /* If the set is empty we instead randomly generate a vowel + consonant combination as our chunk instead.
       */
      else {chunk += getRandomElement(sets[2], sets[2], sets[3]) + getRandomElement(sets[0], sets[0], sets[1]);}
      // System.out.println(wordStr + " + " + chunk); // For Testing
      wordStr += chunk.substring(overlappedStringLength(wordStr, chunk));
    }
    
    /* Iterate through our list of removePrime combinations. Remove the first letter if the string starts with one.
     * This process is continued until none are found
     */
    Boolean overlap = false;
    do {
      for (String str : sets[5]) {
        if (overlappedStringLength(str, wordStr) == str.length()) {wordStr = wordStr.substring(1); overlap = true;}
        else {overlap = false;}
      }
    } while (overlap);
    /* Iterate through our list of removeTerminal combinations. Remove the first letter if the string ends with one.
     * This process is continued until none are found
     */
    do {
      for (String str : sets[6]) {
        if (overlappedStringLength(wordStr, str) == str.length()) {
          wordStr = wordStr.substring(0, wordStr.length() - 2);
          overlap = true;
        }
        else {overlap = false;}
      }
    }
    while (overlap);
    /* Remove any "'" characters from the ends. We can't use our removePrime/removeTerminal lists because our overlap
     * checking method requires strings to have a length > 1
     */
    if (wordStr.substring(0, 1).equals("'")) {wordStr = wordStr.substring(1);}
    if (wordStr.substring(wordStr.length() - 1).equals("'")) {wordStr = wordStr.substring(0, wordStr.length() - 1);}
    // Capitalize and return
    return wordStr.substring(0, 1).toUpperCase() + wordStr.substring(1);
  }
  
  
  /**
   * The main application method. Just for testing purposes
   */
  public static void main(String args[]) {
    WordGen test = new WordGen();
    for (int i = 0; i < 20; i++) {
      System.out.println(test.getRandomWord("Draconic"));
    }
  }
  
  
  /**
   * Used to calculate the number of overlapping letters between two strings
   * 
   * I found this on StackOverflow and converted it to Java. please don't ask about it because I don't know.
   * https://stackoverflow.com/questions/1285434/efficient-algorithm-for-string-concatenation-with-overlap
   */
  int overlappedStringLength(String s1, String s2) {
    //Trim s1 so it isn't longer than s2
    if (s1.length() > s2.length()) s1 = s1.substring(s1.length() - s2.length());
    
    int[] T = ComputeBackTrackTable(s2); //O(n)
    
    int m = 0;
    int i = 0;
    while (m + i < s1.length()) {
      if (s2.charAt(i) == s1.charAt(m + i)) {
        i += 1;
        //<-- removed the return case here, because |s1| <= |s2|
      } else {
        m += i - T[i];
        if (i > 0) i = T[i];
      }
    }
    return i; //<-- changed the return here to return characters matched
  }
  
  /**
   * Helper method for overlappedStringLength method
   */
  int[] ComputeBackTrackTable(String s) {
    int[] T = new int[s.length()];
    int cnd = 0;
    T[0] = -1;
    T[1] = 0;
    int pos = 2;
    while (pos < s.length()) {
      if (s.charAt(pos - 1) == s.charAt(cnd)) {
        T[pos] = cnd + 1;
        pos += 1;
        cnd += 1;
      } else if (cnd > 0) {
        cnd = T[cnd];
      } else {
        T[pos] = 0;
        pos += 1;
      }
    }
    return T;
  }
}
