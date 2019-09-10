package DMtools.nameGenerators;

import java.util.*;

public class CharacterNameGenerator {
  
  public String getRandomElement(HashSet<String> set) {
    int num = (int) (Math.random() * set.size());
    for(String s: set) if (--num < 0) return s;
    throw new AssertionError();
  }
  
  HashSet<String> orcSuffix = new HashSet<String>(Arrays.asList("axe", "club", "fist", "rage", "blood", "stone", "rock",
                                                                "heart", "song", "bone", "fang", "hammer", "scream",
                                                                "skull", "claw", "wolf", "reaver", "song", "wind",
                                                                "maul"
                                                               ));
  
  HashSet<String> orcPrefix = new HashSet<String>(Arrays.asList("Blood", "Black", "Red", "Flame", "Storm", "War",
                                                                "Shadow", "Night", "Frost", "Wild", "Dead", "Spine"));
  
  HashSet<String> orcAdjectives = new HashSet<String>(Arrays.asList("Bleeding", "Screaming", "Broken", "Burning"));
  
  HashSet<String> orcNouns = new HashSet<String>(Arrays.asList("Stone", "Skull", "Axe", "Fist", "Bone"));
  
  HashSet<String> dragonbornNamesMale_XGE = new HashSet<String>(Arrays.asList());
  
  HashSet<String> dragonbornNamesFemale_XGE = new HashSet<String>(Arrays.asList());
  
  HashSet<String> dragonbornNamesFamily_XGE = new HashSet<String>(Arrays.asList());
  
  HashSet<String> dwarfNamesFemale_XGE = new HashSet<String>(Arrays.asList("Anbera", "Artin", "Audhild", "Balfira",
                                                                         "Barbena", "BarDiesa", "Bardryn", "Bolhild",
                                                                         "Dagnal", "Dariff", "Delre", "Eldeth",
                                                                         "Eridred", "Falkrunn", "Fallthra", "Finellen",
                                                                         "Gillydd", "Gunnloda", "Gurdis", "Helgret",
                                                                         "Helja", "Hlin", "Ilde", "Jarana", "Kathra",
                                                                         "Kilia", "Kristryd", "Liftrasa", "Marastyr",
                                                                         "Mardred", "Morana", "Nalaed", "Nora",
                                                                         "Nurkara", "Oriff", "Ovina", "Riswynn",
                                                                         "Sanni", "Therlin", "Thodris", "Tobera",
                                                                         "Tordrid", "Toregga", "Urshar", "Valida",
                                                                         "Werydd", "Whurdred", "Yurgunn"
                                                                        ));
  
  HashSet<String> dwarfNamesMale_XGE = new HashSet<String>(Arrays.asList("Adrik", "Alberich", "Baern", "Barendd",
                                                                          "Beloril", "Brottor", "Dain", "Dalgal",
                                                                          "Darrak", "Delg", "Duergath", "Dworic",
                                                                          "Eberk", "Einkil", "Elaim", "Erias",
                                                                          "Fallond", "Fargrim", "Gardain", "Gilthur",
                                                                          "Gimgen", "Gimurt", "Harbek", "Kildrak",
                                                                          "Kilvar", "Morgran", "Morkral", "Nalral",
                                                                          "Nordak", "Nuraval", "Oloric", "Olunt",
                                                                          "Orsik", "Oskar", "Rangrim", "Reirak",
                                                                          "Rurik", "Taklinn", "Thoradin", "Thorin",
                                                                          "Thradal", "Tordek", "Traubon", "Travok",
                                                                          "Ulfgar", "Uraim", "Veit", "Vonbin",
                                                                          "Vondal", "Whurbin"
                                                                         ));
  
  HashSet<String> dwarfNamesFamily_XGE = new HashSet<String>(Arrays.asList("Aranore", "Balderk", "Battlehammer",
                                                                           "Bigtoe", "Bloodkith", "Bofdann",
                                                                           "Brawnanvil", "Brazzik", "Broodfist",
                                                                           "Burrowfound", "Caerbrek", "Daerdahk",
                                                                           "Dankil", "Daraln", "Deepdelver", "Durthane",
                                                                           "Eversharp", "Fallack", "Fireforge",
                                                                           "Foamtankard", "Frostbeard", "Glanhig",
                                                                           "Goblinbane", "Goldfinder", "Gorunn",
                                                                           "Graybeard", "Hammerstone", "Helcral",
                                                                           "Holderhek", "Ironfist", "Loderr",
                                                                           "Lutgehr", "Morigak", "Orcfoe", "Rakanhrak",
                                                                           "Ruby-Eye", "Rumnaheim", "Silveraxe",
                                                                           "Silverstone", "Steelfist", "Stoutale",
                                                                           "Strakeln", "Strongheart", "Thrahak",
                                                                           "Torevir", "Torunn", "Trollbleeder",
                                                                           "Trueanvil", "Trueblood", "Ungart"
                                                                          ));
  
  HashSet<String> elfNamesFemale_XGE = new HashSet<String>(Arrays.asList("Adrie", "Ahinar", "Althaea",
                                                                         "Anastrianna", "Antinua", "Arara",
                                                                         "Baelitae", "Birel", "Caelynn", "Chaedi",
                                                                         "Claira", "Dara", "Drusila", "Elama",
                                                                         "Enna", "Faral", "Felosial", "Hatae",
                                                                         "Ielenia", "Illanis", "Irann", "Jarsali",
                                                                         "Jelenneth", "Keyleth", "Leshanna", "Lia",
                                                                         "Maiathah", "Malquis", "Beriele", "Mialee",
                                                                         "Myathethil", "Naivara", "Quelenna",
                                                                         "Quillathe", "Ridaro", "Sariel",
                                                                         "Shanairla", "Shava", "Silaqui", "Sumnes", 
                                                                         "Theirastra", "Thiala", "Tiaathque",
                                                                         "Traulam", "Vadania", "Valanthe", "Valna",
                                                                         "Xanaphia"
                                                                         ));
  
  HashSet<String> elfNamesMale_XGE = new HashSet<String>(Arrays.asList("Adrian", "Aelar", "Aerdeth", "Ahvain",
                                                                       "Aramil", "Arannis", "Aust", "Azaki",
                                                                       "Beiro", "Berrian", "Caeldrim", "Carric",
                                                                       "Dayereth", "Dreali", "Efferl", "Eiravel",
                                                                       "Enialis", "Erdan", "Eredan", "Fivin", 
                                                                       "Galinndan", "Gennal", "Hadaral", "Halimath",
                                                                       "Heian", "Himo", "Immeral", "Ivellios",
                                                                       "Korfel", "Lamlis", "Laucian", "Lucan",
                                                                       "Mindartis", "Naal", "Nutae", "Paelias",
                                                                       "Peren", "Riardon", "Rolen", "Soveliss",
                                                                       "Suhnae", "Thamior", "Tharivol", "Theren",
                                                                       "Theriatis", "Thervan", "Uthemar", "Vanuath",
                                                                       "Varis"
                                                                       ));
  
  
  
  HashSet<String> elfNamesFamily_XGE = new HashSet<String>(Arrays.asList("Aloro", "Amakiir", "Amastacia",
                                                                         "Ariessus", "Arnuanna", "Berevan",
                                                                         "Caerdonel", "Caphaxath", "Casilltenirra",
                                                                         "Cireth", "Dalanthan", "Eathalena",
                                                                         "Erenaeth", "Ethanasath", "Fasharash",
                                                                         "Firahel", "Floshem", "Galanodel",
                                                                         "Goltorah", "Hanalai", "Holimion",
                                                                         "Horineth", "Iathrana", "Ilphelkiir", 
                                                                         "Iranapha", "Koehlanna", "Lathalas",
                                                                         "Liadon", "Meliamne", "Mellerelel",
                                                                         "Mystralath", "Nailo", "Netyoive",
                                                                         "Ofandrus", "Ostoroth", "Othronus",
                                                                         "Qualanthri", "Raethran", "Rothenel",
                                                                         "Selavarun", "Siannodel", "Suithrasas",
                                                                         "Sylvaranth", "Teinithra", "Tiltathana",
                                                                         "Wasanthi", "Wilthrethin", "Xiloscient",
                                                                         "Xistsrith", "Yaeldrin"
                                                                         ));
  
  HashSet<String> elfNames_Generated = new HashSet<String>(Arrays.asList("Enira", "Dayeren", "Aerdel", "Eren", "Drena",
                                                                         "Feldris", "Aele", "Meldrie", "Hania", "Enith",
                                                                         "Beren", "Hadan", "Perel", "Illai", "Arash",
                                                                         "Caele", "Caedan", "Amar", "Silthe", "Keylent",
                                                                         "Leshara", "Wiltae", "Vala", "Ahvara", "Ereth",
                                                                         "Daeyrl", "Heindan", "Raea", "Adris", "Enith",
                                                                         "Himar", "Valana", "Berele", "Ausila", "Aral",
                                                                         "Aloshan", "Korith", "Melis", "Quith", "Hathri"
                                                                         ));
  
  
  HashSet<String> orcNamesMale_XGE = new HashSet<String>(Arrays.asList("Argan", "Braak", "Brug", "Cagak", "Dench",
                                                                       "Dorn", "Dren", "Druuk", "Feng", "Gell",
                                                                       "Gnarsh", "Grubar", "Gubrash", "Hagren",
                                                                       "Henk", "Hogar", "Holg", "Imsh", "Karash",
                                                                       "Karg", "Keth", "Korag", "Krusk", "Lubash",
                                                                       "Megged", "Mhurren", "Mord", "Nil", "Nybarg",
                                                                       "Odorr", "Ohr", "Rendar", "Resh", "Ront", 
                                                                       "Rrath", "Sark", "Scrag", "Sheggen", "Shump",
                                                                       "Tanglar", "Tarak", "Thar", "Thokk", "Trag",
                                                                       "Ugarth", "Varg", "Vilberg", "Yurk", "Zed"
                                                                       ));
  
  
  HashSet<String> orcNamesFemale_XGE = new HashSet<String>(Arrays.asList("Arha", "Aggi", "Bilga", "Brakka",
                                                                         "Creega", "Drenna", "Ekk", "Emen",
                                                                         "Engong", "Gaaki", "Gorga", "Grai",
                                                                         "Greeba", "Grigi", "Gynk", "Hrathy",
                                                                         "Huru", "Ilga", "Kabbarg", "Kansif",
                                                                         "Lagazi", "Lezre", "Murgen", "Mulrook",
                                                                         "Myev", "Nagrette", "Neega", "Nella",
                                                                         "Nogu", "Oolah", "Ootah", "Ovak", "Ownka",
                                                                         "Puyet", "Reeza", "Shautha", "Silgre",
                                                                         "Sutha", "Tagga", "Tawar", "Tomph",
                                                                         "Ubada", "Vanchu", "Vola", "Volen",
                                                                         "Vorka", "Yevelda", "Zagga"
                                                                         ));
  
  HashSet<String> gnomeNamesFemale_XGE = new HashSet<String>(Arrays.asList("Ablaba", "Bimpnottin", "Breena", "Buvvie",
                                                                           "Callybon", "Caramip", "Carlin", "Cumpen",
                                                                           "Dalaba", "Donella", "Duvamil", "Ella",
                                                                           "Ellyjoybell", "Ellywick", "Enidda", "Lilli",
                                                                           "Loopmottin", "Lorilla", "Luthra", "Mardnab",
                                                                           "Meena", "Menny", "Mumpena", "Nissa",
                                                                           "Numba", "Nyx", "Oda", "Oppah", "Orla",
                                                                           "Panana", "Pyntle", "Qilla", "Ranala",
                                                                           "Reddlepop", "Roywyn", "Salanop", "Shamil",
                                                                           "Siffress", "Symma", "Tana", "Tenena",
                                                                           "Tervaround", "Tippletoe", "Illa", "Unvera",
                                                                           "Veloptima", "Virra", "Wayworcket", "Yebe",
                                                                           "Zanna"
                                                                           ));
  
  
  HashSet<String> gnomeNamesMale_XGE = new HashSet<String>(Arrays.asList("Alston", "Alvyn", "Anverth", "Arumawann",
                                                                         "Bilbron", "Boddynock", "Brocc", "Burgell",
                                                                         "Cockaby", "Crampernap", "Dabbledob",
                                                                         "Delebean", "Dimble", "Eberdeb", "Eldon",
                                                                         "Erky", "Fablen", "Fibblestib", "Fonkin",
                                                                         "Frouse", "Frug", "Gerbo", "Gimble", "Glim",
                                                                         "Igden", "Jabble", "Jebeddo", "Kellen",
                                                                         "Kipper", "Namfoodle", "Opppleby", "Orryn",
                                                                         "Paggen", "Pallabar", "Pog", "Qualen",
                                                                         "Ribbles", "Rimples", "Roondar", "Sapply",
                                                                         "Seebo", "Senteq", "Sindri", "Umpen", "Warryn",
                                                                         "Wiggens", "Wobbles", "Wrenn", "Zaffrab",
                                                                         "Zook"
                                                                         ));
  
  HashSet<String> gnomeNamesFamily_XGE = new HashSet<String>(Arrays.asList("Albaratie", "Bafflestone", "Beren",
                                                                           "Boondiggles", "Cobblelob", "Daergel",
                                                                           "Dunben", "Fabblestabble", "Fiddlefen",
                                                                           "Folkor", "Garrick", "Gimlen",
                                                                           "Horcusporcus", "Humblebumple", "Ironhide",
                                                                           "Leffery", "Lingenhall", "Loofollue",
                                                                           "Maekkelferce", "Miggledy", "Munggen",
                                                                           "Murning", "Musgraben", "Nackle", "Ningel",
                                                                           "Nopenstallen", "Offund", "Oomtrowl",
                                                                           "Pilwicken", "Pingun", "Quillsharpener",
                                                                           "Raulnor", "Reese", "Rofferton", "Scheppen",
                                                                           "Shadowcloak", "Silverthread", "Symphony",
                                                                           "Tarkelby", "Timbers", "Turen", "Umbodoben",
                                                                           "Waggletop", "Welber", "Wildwander"
                                                                           ));
  
  HashSet<String> halflingNamesFemale_XGE = new HashSet<String>(Arrays.asList("Alain", "Andry", "Anne", "Bella",
                                                                              "Blossom", "Bree", "Callie", "Chenna",
                                                                              "Cora", "Dee", "Dell", "Eida", "Eran",
                                                                              "Euphemia", "Geogrina", "Gynnie",
                                                                              "Harriet", "Jasmine", "Jillian", "Jo",
                                                                              "Kithri", "Lavinia", "Lidda", "Maegan",
                                                                              "Marigold", "Merla", "Myria", "Nedda",
                                                                              "Nikki", "Nora", "Olivia", "Paela",
                                                                              "Pearl", "Pennie", "Philomena", "Portia",
                                                                              "Robbie", "Rose", "Saral", "Seraphina",
                                                                              "Shaena", "Stacee", "Tawna", "Thea",
                                                                              "Trym", "Tyna", "Vani", "Verna", "Wella",
                                                                              "Willow"
                                                                              ));
  
  HashSet<String> halflingNamesMale_XGE = new HashSet<String>(Arrays.asList("Alton", "Ander", "Bernie", "Bobbin",
                                                                            "Cade", "Callus", "Corrin", "Dannad",
                                                                            "Eddie", "Egart", "Eldon", "Errich",
                                                                            "Fildo", "Finnan", "Franklin", "Garret",
                                                                            "Garth", "Gilbert", "Gob", "Harol", "Igor",
                                                                            "Jasper", "Keith", "Kevin", "Lazam",
                                                                            "Kerry", "Lindal", "Lyle", "Merric",
                                                                            "Mican", "Milo", "Morrin", "Nebin", "Nevil",
                                                                            "Osborn", "Oswalt", "Perrin", "Poppy",
                                                                            "Reed", "Roscoe", "Sam", "Shardon", "Tye",
                                                                            "Ulmo", "Wellby", "Wendel", "Wenner", "Wes"
                                                                            ));
  
  
  HashSet<String> halflingNamesFamily_XGE = new HashSet<String>(Arrays.asList("Applelossom", "Bigheart", "Brightmoon",
                                                                              "Brushgather", "Cherrycheeks",
                                                                              "Copperkettle", "Deephollow",
                                                                              "Elderberry", "Fastfoot", "Fatrabbit",
                                                                              "Glenfellow", "Goldfound", "Goodbarrel",
                                                                              "Goodearth", "Greenbottle", "Greenleaf",
                                                                              "High-hill", "Hilltopple", "Hogcollar",
                                                                              "Honeypot", "Jamjar", "Kettlewhistle",
                                                                              "Leagallow", "Littlefoot",
                                                                              "Nimblefingers", "Porridgepot",
                                                                              "Quickstep", "Reedfellow", "Shadowquick",
                                                                              "Silvereyes", "Smoothhands",
                                                                              "Stonebridge", "Stoutbridge", "Stoutman",
                                                                              "Strongbones", "Sunmeadow",
                                                                              "Swiftwhistle", "Tallfellow", "Tealeaf",
                                                                              "Tenpenny", "Thistletop", "Thorngage",
                                                                              "Tosscobble", "Underbough", "Warmwater",
                                                                              "Whispermouse", "Wildcloak", "Wildheart",
                                                                              "Wiseacre"
                                                                              ));
  
  HashSet<String> tieflingNamesFemale_XGE = new HashSet<String>(Arrays.asList("Akta", "Anakis", "Armara", "Astaro",
                                                                              "Aym", "Azza", "Beleth", "Bryseis",
                                                                              "Bune", "Criella", "Damaia", "Decarabia",
                                                                              "Ea", "Gadreel", "Gomory", "Hecat",
                                                                              "Ishte", "Jezebeth", "Kali", "Kallista",
                                                                              "Kasdeya", "Lerissa", "Lilith", "Makaria",
                                                                              "Manaea", "Markosian", "Mastema",
                                                                              "Naamah", "Nemeia", "Nija", "Orianna",
                                                                              "Osah", "Phelaia", "Prosperine", "Purah",
                                                                              "Pyra", "Reita", "Ronobe", "Ronwe",
                                                                              "Seddit", "Seere", "Sekhmet", "Semyaza",
                                                                              "Shava", "Shax", "Sorath", "Uzza",
                                                                              "Vapula", "Vepar", "Verin"
                                                                             ));
  
  HashSet<String> tieflingNamesMale_XGE = new HashSet<String>(Arrays.asList("Abad", "Ahrim", "Akmen", "Amnon", "Andran",
                                                                            "Astar", "Balam", "Barakas", "Bathin",
                                                                            "Caim", "Chem", "Cimer", "Cressel",
                                                                            "Damakos", "Ekemon", "Euron", "Fenriz",
                                                                            "Forcas", "Habor", "Iados", "Kairon",
                                                                            "Lucies", "Mammen", "Mantus", "Marbas",
                                                                            "Melech", "Merihim", "Modean", "Mordai",
                                                                            "Mormo", "Morthos", "Nicor", "Nirgel",
                                                                            "Oriax", "Paymon", "Peliaos", "Purson",
                                                                            "Quemuel", "Raam", "Rimmon", "Sammal",
                                                                            "Tethren", "Thamuz", "Therai", "Valafar",
                                                                            "Vassago", "Xappan", "Zepar", "Zephran"
                                                                           ));
  
  HashSet<String> tieflingNamesVirtue_XGE = new HashSet<String>(Arrays.asList("Ambition", "Art", "Carrion", "Chant",
                                                                              "Creed", "Death", "Debauchery", "Despair",
                                                                              "Doom", "Doubt", "Dread", "Ecstasy",
                                                                              "Ennui", "Entropy", "Excellence", "Fear",
                                                                              "Glory", "Gluttony", "Grief", "Hate",
                                                                              "Hope", "Horror", "Ideal", "Ignominy",
                                                                              "Laughter", "Love", "Lust", "Mayhem",
                                                                              "Mockery", "Murder", "Muse", "Music",
                                                                              "Mystery", "Nowhere", "Open", "Pain",
                                                                              "Passion", "Poetry", "Quest", "Random",
                                                                              "Reverence", "Revulsion", "Sorrow",
                                                                              "Temerity", "Torment", "Tragedy", "Vice",
                                                                              "Virtue", "Weary", "Wit"
                                                                             ));
  
  public String orcClanNameGenerator() {
    
    String clanName = "";
    // Set up our random seed
    Random r = new Random();
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
  
  // Yeah I could probably refactor all of these, but thats a job for a different day.
  
  // True = male, false = female
  public String gnomeFullNameGenerator(boolean gender) {
    HashSet<String> firstNameSet;
    if (gender) firstNameSet = gnomeNamesMale_XGE;
    else firstNameSet = gnomeNamesFemale_XGE;
    return getRandomElement(firstNameSet) + " " + getRandomElement(gnomeNamesFamily_XGE);
  }
  
  // True = male, false = female
  public String orcFullNameGenerator(boolean gender) {
    HashSet<String> firstNameSet;
    if (gender) firstNameSet = orcNamesMale_XGE;
    else firstNameSet = orcNamesFemale_XGE;
    return getRandomElement(firstNameSet) + " " + orcClanNameGenerator();
  }
  
  // True = male, false = female
  public String elfFullNameGenerator(boolean gender) {
    HashSet<String> firstNameSet;
    if (gender) firstNameSet = elfNamesMale_XGE;
    else firstNameSet = elfNamesFemale_XGE;
    return getRandomElement(firstNameSet) + " " + getRandomElement(elfNamesFamily_XGE);
  }
  
  // True = male, false = female
  public String dwarfFullNameGenerator(boolean gender) {
    HashSet<String> firstNameSet;
    if (gender) firstNameSet = dwarfNamesMale_XGE;
    else firstNameSet = dwarfNamesFemale_XGE;
    return getRandomElement(firstNameSet) + " " + getRandomElement(dwarfNamesFamily_XGE);
  }
  
  // True = male, false = female
  public String halflingFullNameGenerator(boolean gender) {
    HashSet<String> firstNameSet;
    if (gender) firstNameSet = halflingNamesMale_XGE;
    else firstNameSet = halflingNamesFemale_XGE;
    return getRandomElement(firstNameSet) + " " + getRandomElement(halflingNamesFamily_XGE);
  }
  
  public String getFullNameChooser(boolean gender, String race) {
    // The string to be returned (says ERROR if left unchanged)
    String fullName = "ERROR";
    switch (race) {
      // case "Human":
      case "Elf":
        fullName = elfFullNameGenerator(gender);
        break;
      case "Dwarf":
        fullName = dwarfFullNameGenerator(gender);
        break;
      case "Gnome":
        fullName = gnomeFullNameGenerator(gender);
        break;
      case "Dragonborn":
        // fullName = dragonbornFullNameGenerator(gender);
        break;
      case "Tiefling":
        // fullName = tieflingFullNameGenerator(gender);
        break;
      case "Halfling":
        fullName = halflingFullNameGenerator(gender);
        break;
     // case "Half-Orc": (Random mix of human and orc)
     // case "Half-Elf": (Random mix of human and elf)
     // case "Goblin":
     //   fullName = goblinFullNameGenerator(gender);
     //   break;
     // case "Tabaxi":
     //   fullName = tabaxiFullNameGenerator(gender);
     //   break;
     // case "Orc":
     //   fullName = orcFullNameGenerator(gender);
     //   break;
     // case "Hobgoblin":
     //   fullName = hobgoblinFullNameGenerator(gender);
     //   break;
     // case "Goliath":
     //   fullName = goliathFullNameGenerator(gender);
     //   break;
     // case "Gith":
     //   fullName = githFullNameGenerator(gender);
     //   break;
     // case "Tortle":
     //   fullName = tortleFullNameGenerator(gender);
     //   break;
     // case "Changeling":
     //   fullName = changelingFullNameGenerator(gender);
     //   break;
     // case "Kenku":
     //   fullName = kenkuFullNameGenerator(gender);
     //   break;
     // case "Firbolg":
     //   fullName = firbolgFullNameGenerator(gender);
     //   break;
     // case "Shifter":
     //   fullName = shifterFullNameGenerator(gender);
     //   break;
     // case "Triton":
     //   fullName = tritonFullNameGenerator(gender);
     //   break;
     // case "Grung":
     //   fullName = grungFullNameGenerator(gender);
     //   break;
      // case "Genasi":
      // case "Eladrin":
      // case "Lizardfolk":
      // case "Aarakocra":
      // case "Warforged"; TODO currently not in any lists
    }
    return fullName;
  }
  
  public static void main(String[] args) {
    CharacterNameGenerator testing = new CharacterNameGenerator();
    
    Random r = new Random();
    
    for (int i = 0; i < 10; i++) {
      // Random gender
      boolean random  = r.nextBoolean();
      // Get a name
      System.out.println(testing.getFullNameChooser(r.nextBoolean(), "Dwarf"));
    }
  }
}