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
  
  // Singular consonants - Elf ('b' has been removed.)
  HashSet<String> elfConsonantsT1 = new HashSet<String>(Arrays.asList("n", "th", "l", "r", "s", "k", "r",
                                                                      "f", "m"
                                                                     ));
  // Combination consonants - Elf
  HashSet<String> elfConsonantsT2 = new HashSet<String>(Arrays.asList("rt", "tr", "yl", "str", "thqu", "ll", "s", "st",
                                                                      "qu"
                                                                     ));
  // Suitable terminal consonants - Elf
  HashSet<String>elfConsonantsT3 = new HashSet<String>(Arrays.asList("n", "l", "s", "m"));
  
  // Singular vowels - Elf
  HashSet<String> elfVowelsT1 = new HashSet<String>(Arrays.asList("a", "e", "ia", "ei", "ae", "u", "i", "aia", "o", "au"
                                                                 ));
  // Combination vowels - Elf
  HashSet<String> elfVowelsT2 = new HashSet<String>(Arrays.asList("ia", "ei", "ae", "aia", "au", "ua", "eu"));
  
  
  HashSet<String> orcConsonantsTerminal = new HashSet<String>(Arrays.asList("rg", "rth", "rd"));
  
  HashSet<String> orcConsonantsPrime = new HashSet<String>(Arrays.asList("gr", "thr", "dr", "kr"));
  
  HashSet<String> orcConsonants = new HashSet<String>(Arrays.asList("m", "g", "r", "d", "th", "k", "h", "s", "sk", "sh"
                                                                   ));
  
  HashSet<String> orcVowels = new HashSet<String>(Arrays.asList("o", "u", "a", "e"));
  
  HashSet<String> orcSuffix = new HashSet<String>(Arrays.asList("axe", "club", "fist", "rage", "blood", "stone", "rock",
                                                                "heart", "song", "bone", "fang", "hammer", "scream",
                                                                "skull", "claw", "wolf", "reaver", "song", "wind",
                                                                "maul"
                                                               ));
  
  HashSet<String> orcPrefix = new HashSet<String>(Arrays.asList("Blood", "Black", "Red", "Flame", "Storm", "War",
                                                                "Shadow", "Night", "Frost", "Wild", "Dead", "Spine"));
  
  HashSet<String> orcAdjectives = new HashSet<String>(Arrays.asList("Bleeding", "Screaming", "Broken", "Burning",
                                                                    "Howling"));
  
  HashSet<String> orcNouns = new HashSet<String>(Arrays.asList("Stone", "Skull", "Axe", "Fist", "Bone"));
  
  HashSet<String> commonConsonants = new HashSet<String>(Arrays.asList("d", "n", "m", "g", "r", "s", "k", "b", "l",
                                                                       "t", "h", "w"));
  
  HashSet<String> commonConsonantsPrime = new HashSet<String>(Arrays.asList("th", "ch"));
  HashSet<String> commonConsonantsTerminal = new HashSet<String>(Arrays.asList("rn", "rt", "lm", "rn"));
  
  HashSet<String> commonVowelsT1 = new HashSet<String>(Arrays.asList("a", "e", "i", "o"));
  HashSet<String> commonVowelsT2 = new HashSet<String>(Arrays.asList("ea", "eu", "ie", "au"));
  
  HashSet<String> commonChunks_V = new HashSet<String>(Arrays.asList("aithe", "aren", "arion", "ellan", "eghan",
                                                                     "arge", "ander", "ill", "arth", "orrin", "ennie",
                                                                     "enna", "enne", "alena", "elena", "elle",
                                                                     "eynard", "anton", "rmin", "aude", "alic", "ames",
                                                                     "edrik"
                                                                    ));
  HashSet<String> commonChunks_C = new HashSet<String>(Arrays.asList("bern", "fred", "will", "bert", "burn", "bach",
                                                                     "ston", "walt", "bob", "wynn", "gwen", "wend",
                                                                     "dell", "mina", "frey", "ashew", "brill", "mead",
                                                                     "melb", "wald"
                                                                    ));
  
  
  public String getWord(String lang) {
    String retStr = "ERROR";
    switch (lang) {
      case "Orc":
        if (r.nextBoolean()) {retStr = orcClanNameGenerator();}
        else {retStr = getOrcWord();}
        break;
      case "Elf":
        retStr = getElfWord();
        break;
      default:
        retStr = getCommonWord();
    }
    return retStr;
  }
  
  public String getElfWord() {
    // Generate a random target length
    int randLen = 0;
    while (randLen < 4) {
      randLen = r.nextInt(7);
    }
    // Starting empty string
    String wordStr = "";
    // Chance to start with a vowel
    if (r.nextBoolean()) wordStr += getRandomElement(elfVowelsT1);
    // While the string length is less than target length, continue adding random consonant/vowel pairs
    while (wordStr.length() < randLen) {
      // Duplicates are there to make T1 set elements occur more often than t2 elemnts,
      wordStr += getRandomElement(elfConsonantsT2, elfConsonantsT1, elfConsonantsT1);
      wordStr += getRandomElement(elfVowelsT2, elfVowelsT1, elfVowelsT1);
    }
    // Chance to end with a consonant
    if (r.nextBoolean()) wordStr += getRandomElement(elfConsonantsT3);
    // Capitalize and return
    return wordStr.substring(0, 1).toUpperCase() + wordStr.substring(1);
  }
  
  
  public String getOrcWord() {
    // Generate a random target length
    int randLen = 0;
    while (randLen < 3) {
      randLen = r.nextInt(5);
    }
    // Starting empty string
    String wordStr = "";
    // Chance to start with a consonant. Note we are not including our teminal consonants.
    if (r.nextBoolean()) {wordStr += getRandomElement(orcConsonantsPrime, orcConsonants);}
    wordStr += getRandomElement(orcVowels);
    // While the string length is less than target length, continue adding random consonant/vowel pairs
    while (wordStr.length() < randLen) {
      // orcConsonants is duplicated so it occurs more often
      wordStr += getRandomElement(orcConsonantsPrime, orcConsonantsTerminal, orcConsonants, orcConsonants);
      wordStr += getRandomElement(orcVowels);
    }
    // Chance to end with a consonant
    if (r.nextBoolean()) wordStr += getRandomElement(orcConsonantsTerminal);
    // Capitalize and return
    return wordStr.substring(0, 1).toUpperCase() + wordStr.substring(1);
  }
  
  
  public String getCommonWord() {
    int randLen = 0;
    while (randLen < 4) {randLen = r.nextInt(7);}
    // Starting empty string
    String wordStr = "";
    String chunk;
    if (r.nextBoolean()) {wordStr += getRandomElement(commonConsonantsPrime, commonConsonants, commonChunks_C);}
    while(wordStr.length() < randLen) {
      int num = r.nextInt(5);
      if (num < 2) {chunk = getRandomElement(commonChunks_V);}
      if (num > 1 & num < 4) {chunk = getRandomElement(commonVowelsT1, commonVowelsT1, commonVowelsT2)
                     + getRandomElement(commonChunks_C);}
      else {
        chunk = getRandomElement(commonVowelsT1, commonVowelsT1, commonVowelsT2) + 
        getRandomElement(commonConsonantsPrime, commonConsonantsTerminal, commonConsonants, commonConsonants);
      }
      wordStr += chunk.substring(overlappedStringLength(wordStr, chunk));
    }
    return wordStr.substring(0, 1).toUpperCase() + wordStr.substring(1);
  }
  
  
  public String orcClanNameGenerator() {  
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
  
  public static void main(String args[]) {
    WordGen test = new WordGen();
    for (int i = 0; i < 20; i++) {
      System.out.println(test.getElfWord());
    }
  }
  
  
  // I found this on StackOverflow please don't ask about it because I don't know.
  // https://stackoverflow.com/questions/1285434/efficient-algorithm-for-string-concatenation-with-overlap
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
