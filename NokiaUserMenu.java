import java.util.Scanner;
  
  public class NokiaUserMenu{
  
        public static void main(String [] args){ 
       
         Scanner input = new Scanner(System.in);
 System.out.println();
 System.out.println("===========WELCOME TO NOKIA 5510=============");
     
   String searchedname = " ";  
   String notepage1input = " "; 
   String notepage2input = "  " ;  
     
     
     System.out.println(); 
     System.out.println("***CREATE A PASSWORD*****"); 
     System.out.println();  
     System.out.println("Enter four(4) digit number:");    
         int firstpassword = input.nextInt();
 
 System.out.println();
 int userpassword = firstpassword;
 while (true){  
    System.out.println("****CONFIRM THE PASSWORD*******");
         int password = input.nextInt();
       
if (password == userpassword ){
    break;
 }   
 else{
     System.out.println(); 
     System.out.println("ENTER THE CORRECT PASSWORD");  
 }
 }
 
    System.out.println();  
    System.out.println("INSERT A SIM");        
 
 
 System.out.println();   
 String Stringmenu ="""
=========NOKIA 5510==================   
        
           MENU
           
           press 
1.  profile
2.  Phone Book
3.  Call register
4.  Chat 
5.  Message
6.  Call divert
7.  Settings
8.  Calculator
9.  Games
10. Music
11. Clock
12. Reminders
13. Sim Service
14. Tones 
15. Service

=====================================
""";
    
    System.out.println(Stringmenu); 
    
    System.out.println("Enter your option");
      int option = input.nextInt();

switch (option){
       
       case 1 -> {
String profile = """
  ========PROFILE========

1. General MODE 

2. Silent

3. Meeting

4. outdoor

5. Customize
""";
   System.out.println(profile);
   System.out.println("Enter your option");
    int phoneprofile = input.nextInt();
    
switch (phoneprofile){
    case 1 -> {
String generalmode ="""
      GENERAL MODE
    
   GENERAL MODE ACTIVATED !!!!!!

""";
   System.out.println(generalmode);
}
}

switch (phoneprofile){
    case 2 -> {
String silent ="""
      SILENT MODE
    
   SILENT MODE ACTIVATED !!!!!!

""";
   System.out.println(silent);
}
}

switch (phoneprofile){
    case 3 -> {
String meeting ="""
      MEETING MODE
    
   MEETING MODE ACTIVATED !!!!!!

""";
   System.out.println(meeting);
}
}

switch (phoneprofile){
    case 4 -> {
String outdoor ="""
      OUTDOOR MODE
    
   OUTDOOR MODE ACTIVATED !!!!!!

""";
   System.out.println(outdoor);
}
}

switch (phoneprofile){
    case 5 -> {
String customize ="""
      CUSTOMIZE YOUR VOLUME
    
1. Increase Ringtone volume

2. Increase keyboard volume

3. Reduce Ringtone volume

4. Reduce Keyboard volume
""";
   System.out.println(customize);
   System.out.println("Enter your option");
    int customizevolume = input.nextInt();

if (customizevolume== 1){
     System.out.println("RINGTONE VOLUME INCREASED  !!!!!!");
    }
if (customizevolume == 2){
     System.out.println("KEYBOARD VOLUME INCREASED !!!!!!!");
    }
if (customizevolume == 3){
     System.out.println("RINGTONE VOLUME REDUCED !!!!!!!");
    }
if (customizevolume == 4){
     System.out.println("KEYBOARD VOLUME REDUCED !!!!!!! ");
    }
if (customizevolume >= 5){
     System.out.println("OPTION NOT FOUND  ");
    }
}
}
}
}


switch (option){
       
       case 2 -> {
String phonebook = """
========PHONE BOOK========

1. Search

2. Add name 

3. Delete

4. Copy

5. Option 
""";
   System.out.println(phonebook);
   System.out.println("Enter your option");
    int bookpage = input.nextInt();
switch(bookpage){
     case 1 -> {
String search ="""
           SEARCH
abc....                        
  
   
       EMPTY CONTACT !!!!!!
  
  
Enter the name : ...................   
  """;
    System.out.println(search);
    System.out.println("Enter the name ");
      String bookpage2 = input.nextLine();
          input.nextLine();
    System.out.println("Enter done ");
      String bookpage3 = input.nextLine();      
        bookpage2 += searchedname;
}
}
switch(bookpage){
     case 2 -> {
String addname ="""
           ADD NAME 
abc....                        
  
   
       EMPTY CONTACT !!!!!!


Enter the name : .................
Enter phone number :.. ...............   
  """;
     System.out.println(addname);
    System.out.println("Enter the name ");
      String notepage1 = input.nextLine();
          input.nextLine();   
    System.out.println("Enter the number ");
       String notepage2= input.nextLine();
   
      notepage1 += notepage1input; 
      notepage2 += notepage2input; 
System.out.println();
System.out.println("CONTACT SAVED");
}
}
if (bookpage == 3){
  System.out.println("""
           DELETE                        
  
   
       EMPTY CONTACT !!!!!!

  
  """);
}
if (bookpage == 4){
  System.out.println("""
           COPY NUMBER                         
  
   
       EMPTY CONTACT !!!!!!

   
  """);
}
if (bookpage == 5){
  System.out.println("""
           SETTINGS 
1. Memory status 

2. view type 

3. Speed type 
  
0. Back  
  """);
while(true){
  System.out.println ("Enter your option:");
     int booksettings = input.nextInt();
if (booksettings == 1){
     System.out.println("""
                  MEMORY SPECIFICATIONS

• Internal Storage: 64 MB of built-in flash storage, designed for 
  digital audio files (MP3 and AAC),
  holding roughly 2 hours of music or about one full album.

• Expandable Storage: None (the device does not have a memory card slot).

• Phone book Capacity: Stores up to 100 names and numbers in the device memory.

• SIM Memory: Supports an additional 250 entries on the SIM card.

• Call and Dial Memory: Accommodates 8 speed-dial and voice-dial entries, 
  plus a standard call register.   
""");
   int back = input.nextInt();
if (back == 0){
    continue;
}
else{
   break;
}   
   }
if (booksettings  == 2){
     System.out.println("""
                   DISPLAY SPECIFIAATIONS

• Screen Type: Monochrome STN graphic LCD 
  (no color, purely black-and-white pixels with a green/amber backlight).

• Resolution: 84 x 48 pixels.

• Physical Size: 1.5 inches diagonally.

• Text Capacity: Accommodates up to 5 lines of text simultaneously.

• Form Factor: Positioned horizontally in a landscape orientation right
  in the center of the split QWERTY keyboard.

• Additional Visual Features: Supports dynamic font sizing, pixel-art screensavers, 
  and dedicated text templates or smileys.

     
     """);
    }
if (booksettings  == 3){
     System.out.println("""
               NETWORK & DATA SPEED 
• 2G Mobile Data: No GPRS or EDGE support. It relies on CSD (Circuit-Switched Data)
  to load primitive text-based WAP pages over a dial-up style mobile connection.

• Data Transfer Rate: CSD caps out at a maximum internet connection speed of just 9.6 kbps.
              
              HARDWARE INTERFACE TRANSFER SPEED
• USB Cable Connection: It was the first Nokia phone to feature a direct Mini-USB port.
• Connection Protocol: It uses USB 1.0 (Low-Speed / Full-Speed).
• Transfer Rate: Transferring MP3 audio files from a PC into the phone's 64 MB 
  memory maxes out at roughly 1.5 Mbps to 12 Mbps. 
  Filling up the internal music drive completely usually takes several minutes.
              
              DIALING SPEED
• Speed Dial Capacity: It supports standard 1-touch speed dialing for up to 8 custom contacts, 
  mapped directly to keys 2 through 9 on the keyboard     
""");
    }
}
}
}
}



switch (option){
       
       case 3-> {
String callregister = """
    ========CALL REGISTER========
    
       Insert your sim !!!!!!

1. Missed calls     
    
2. Call duration    

3. Clear log 
""";
   System.out.println(callregister);
  System.out.println();
  System.out.println("Enter your option");
   int register = input.nextInt();
if (register  == 1){
  System.out.println("EMPTY CONTACT !!!!!!!");
   }
if (register == 2 ){
   System.out.println("EMPTY CONTACT!!!!!!");
   }
if (register  == 3){
   System.out.println("EMPTY CONTACT !!!!!!");
   }
if (register == 0){
   System.out.println("back !!!!!!");
   }
}
}


switch (option){
       
       case 4-> {
String chat = """
   ========CHAT========     
   
   Welcome to chat box

      
          KINDLY
      INSERT YOUR SIM 

""";
   System.out.println(chat);
}
}

switch (option){
      case 5-> {
String message = """
  ========MESSAGE========    

1. Write message 

2. Inbox

3. Outbox

4. Send items 

5. Drafts

6. Picture message 
""";
   System.out.println(message);
  System.out.println("Enter your option");
   int phonemessage = input.nextInt();
System.out.println();
if (phonemessage == 1){
  System.out.println("NO SIM TO MOVE FURTHER !!!!!!!");
   }
if (phonemessage == 2 ){
   System.out.println("EMPTY INBOX !!!!!!!!");
   }
if (phonemessage == 3){
   System.out.println("EMPTY OUTBOX !!!!!!!!");
   }
if (phonemessage == 4){
   System.out.println("NO ITEM UNTIL THERE IS SIM !!!!!!!!!!!");
   }
if (phonemessage== 5){
   System.out.println("EMPTY DRAFT  !!!!!!");
   }
if (phonemessage>= 6){
   System.out.println("NO PICTURE MESSAGE YET  !!!!!!");
   }
}
}


switch (option){
       case 6 -> {
String calldivert = """
 =============CALL DIVERT============    

1. Divert all voice calls 

2. Divert when busy

3. Divert when not answered

4. Divert when phone off 

5. cancel all divert
""";
     System.out.println(calldivert);
  System.out.println("Enter your option");
   int divert = input.nextInt();
System.out.println();
if (divert == 1){
  System.out.println("NO SIM TO MOVE FURTHER !!!!!!!");
   }
if (divert == 2 ){
   System.out.println("EMPTY SIM CASE");
   }
if (divert == 3){
   System.out.println("NO SIM FOUND ");
   }
if (divert == 4){
   System.out.println("NO SIM FOUND");
   }
if (divert == 5){
   System.out.println("EMPTY DIVERT !!!!!!");
   }
if (divert >= 6){
   System.out.println("OPTION NOT FOUND");
   }
}
}


switch (option){
        case 7-> {
String settings ="""
=============SETTINGS============

1. Call settings

2. Phone settings

3. Security settings

4. Restore factory settings 
""";
  System.out.println(settings);
  System.out.println("Enter your option");
   int devicesettings = input.nextInt();

switch (devicesettings){
       case 1 -> {
String callssettings  ="""
       CALL  SETTING
   
  1. Automatic redial
  
  2. Call waiting
  
  3. Speed dialing
""";
    System.out.println(callssettings);
  System.out.println("Enter your option");
   int settinginput = input.nextInt();
 System.out.println();
 if (settinginput == 1){
  System.out.println("AUTOMATIC REDIAL ACTIVATED !!!!!!!");
   }
if (settinginput == 2 ){
   System.out.println("EMPTY CALL TAKEN");
   }
if (settinginput == 3){
   System.out.println("SPEED DIALING ACTIVATED");
   }
if (settinginput >= 4){
   System.out.println("NO SIM FOUND");
   }
}
}


switch (devicesettings){
        case  2 -> {
String phonesettings  ="""
       CALL  SETTING
   
  1. Language settings 
  
  2. Confirm SIM service  action 
  
  3. Network selection
  
  4. Welcome note
""";
    System.out.println(phonesettings);
  System.out.println("Enter your option");
   int settingin = input.nextInt();
 if (settingin == 1){
  System.out.println();
  System.out.println("""
           LANGUAGE OPTIONS
 
1. English
 
2. Arabic
 
3. Spanish
 
4. Japanese
 
5. Chinese 
  """);
     System.out.println("Enter your option");
   int language = input.nextInt();
 
 System.out.println();
 if (language  == 1){
  System.out.println("LANGUAGE CHANGE TO ENGLISH !!!!!!!");
   }
if (language == 2 ){
   System.out.println("LANGUAGE CHANGE TO ARABIC");
   }
if (language == 3){
   System.out.println("LANGUAGE CHANGE TO SPANISH");
   }
if (language  == 4){
   System.out.println("LANGUAGE CHANGE TO JAPANESE");
   }
if (language  == 5){
   System.out.println("LANGUAGE CHANGE TO CHINESE");
   }
if (language  >= 6){
   System.out.println("OPTION NOT FOUND");
   }
}      
   
   
if (settingin  == 2){
  System.out.println();
  System.out.println("NO SIM FOUND YET. INSERT A SIM");
   }   
   
if (settingin  == 3){
  System.out.println();
  System.out.println("""
            NETWORK  SELECTION
  
SIM 1 : [NONE]
  
SIM 2 : [NONE]
  
DEFAULT : [NONE]
  
""");
   }      
if (settingin  == 4){
  System.out.println();
  System.out.println("""
Welcome to Nokia 5510. It is actually the best phone

you would get to see , promising you with all your

possible desires, pleasure , and imaginations

Thank you for choosing this product !!!!!!.
""");
}
if (settingin  >= 5){
  System.out.println();
  System.out.println("OPTION NOT FOUND");
}
}
}
/*switch(devicesettings){
         case 3 -> {
String securitysettings="""
       SECURITY  SETTINGS
  
      RESET PASSWORD  
""";
    System.out.println(securitysettings);
   System.out.println("Enter your option");
   int resetpassword = input.nextInt();
      userpassword +=  resetpassword;
}
}
*/
switch (devicesettings){
        case 4 -> {  
String restoresetting ="""
  
        RESETTING YOU PHONE !!!!!!!!!! 
  
""";
   System.out.println();
   System.out.println(restoresetting);
}
}
}
}




switch (option){
       case 10 -> {
String music = """
======MUSICS=======  

1. Recorder 

2. Radio

3. track list
""";
   System.out.println(music);
  System.out.println("Enter music list of your choice");
   int musictracks = input.nextInt();

switch (musictracks){
    case 1 -> {
String recorder =""" 
  =====Recorder=====
        
      EMPTY LIST
""";
  System.out.println(recorder);
}
}
switch (musictracks){    
    case 2 -> {
String radio ="""
     ====Radio====
  
  EMPTY FREQUENCY LIST 
  
  *   *   *    *   *   *   *   *
 *   *   *    *   *   *   *   *

""";
   System.out.println(radio);
}
}

switch (musictracks){    
    case 3 -> {
String tracklist ="""
  ===Track list===

   EMPTY TRACK LIST !!
""";
   System.out.println(tracklist);
}
 }
  }
   }
   
switch(option){
      case 9 -> {
String gamemenu ="""
===============WELCOME TO GAME STATION=================
        
              press

1. Snake game 

2. Bounce ball

3. Quiz
""";
  System.out.println(gamemenu);
  System.out.println("Enter game of your choice");
   int game = input.nextInt();

switch(game){
     case 1 -> {
String snakegame = """
============WELCOME TO SNAKE GAME====================== 
          
          Select Game Level
1. Easy

2. Normal

3. Hard
""";
  System.out.println(snakegame);
  System.out.println("Enter game level");
   int gamelevel = input.nextInt();
if (gamelevel == 1){
  System.out.println("Easy mode,here we go !!!!!!!");
   }
if (gamelevel == 2 ){
   System.out.println("Normal mode, is getting interesting !!!!!!");
   }
if (gamelevel == 3){
   System.out.println("Hard mode, you can do this  !!!!!!");
   }
if (gamelevel >= 4){
   System.out.println("level not found !!!!!!");
   }
}
}

switch(game){
    case 2 -> {
String bounceballgame = """ 
===========WELCOME TO BOUNCE BALL GAME================
        
        Select Game Level 
        
1. Level one 

2. Level two

3. Level three 
""";
   System.out.println(bounceballgame);
  System.out.println("Enter game level");
   int gamelevel = input.nextInt();
 if (gamelevel == 1){
  System.out.println("it's just getting started !!!!!!!");
   }
if (gamelevel == 2 ){
   System.out.println("now it's getting interesting !!!!!!");
   }
if (gamelevel == 3){
   System.out.println("Let see how far you can go  !!!!!!");
   } 
if (gamelevel >= 4){
   System.out.println("hoops! level not found");
   }
}
}

switch(game){   
   case 3 -> {

String quizgame1 = """ 
===============QUIZ TIME !!!!!!==================

There are two(5) questions only, so try your luck.

Use number to answer the questions(1,2, or 3).  

EYES WILL NOT PUSH US oooo.....         
          
          QUESTION 1
  WHICH NUMBER IS BOTH A PERFECT SQUARE AND A PERFECT CUBE?
  
1. 625

2. 144

3. 729
""";
   System.out.println(quizgame1);
   System.out.println("Enter your answer ");
   int answer1 = input.nextInt();
if (answer1 == 1){
  System.out.println("Wrong !!,");
  System.out.println("Correct answer: 729");
   }
if (answer1 == 2 ){
  System.out.println("Wrong !!,");
  System.out.println("Correct answer: 729");
   }
if (answer1 == 3){
   System.out.println("CORRECT !!!!!!");
   } 
if (answer1 >= 4){
   System.out.println("Option not found");
   }

System.out.println();
String quizgame2= """ 
          QUESTION 2
  WHICH TREATY FORMALLY ENDED THE THIRTY YEARS' WAR IN 1648?
  
1. Treaty of Versailles

2. Treaty of Westphalia

3. Treaty of Tordesillas
""";
    System.out.println(quizgame2);
   System.out.println("Enter your answer ");
   int answer2 = input.nextInt();
if (answer2 == 1){
  System.out.println("Wrong !!,");
  System.out.println("Correct is answer: Treaty of Westphalia");
   }
if (answer2 == 2 ){
  System.out.println("CORRECT !!!!!!");
   }
if (answer2 == 3){
  System.out.println("Wrong !!,");
  System.out.println("Correct is answer: Treaty of Westphalia");
   } 
if (answer2 >= 4){
   System.out.println("Option not found");
   }

System.out.println();
String quizgame3="""
            QUESTION  3

What unique design feature defines the physical appearance of the Nokia 5510?

1. A sliding touch panel

2. A full QWERTY keyboard split across both sides of the screen

3. A circular rotary dialing pad

4. A completely buttonless frame
""";
    System.out.println(quizgame3);
   System.out.println("Enter your answer ");
   int answer3 = input.nextInt();
if (answer3 == 1){
  System.out.println("Wrong !!,");
  System.out.println("Correct is answer: [2]");
   }
if (answer3 == 2 ){
  System.out.println("CORRECT !!!!!!");
   }
if (answer3 == 3){
  System.out.println("Wrong !!,");
  System.out.println("Correct is answer: [2]");
   } 
if (answer3 >= 4){
   System.out.println("Option not found");
   }
System.out.println();
String quizgame4="""
            QUESTION  4

Borrowed from the classic Nokia 3310, what is the screen resolution of the Nokia 5510?

1.  84 x 48 pixels

2.  128 x 128 pixels

3.  176 x 220 pixels

4.  320 x 240 pixels
""";
    System.out.println(quizgame4);
   System.out.println("Enter your answer ");
   int answer4 = input.nextInt();

if (answer4 == 1){
  System.out.println("CORRECT !!!!!!");
   }
if (answer4 == 2 ){
  System.out.println("Wrong !!,");
  System.out.println("Correct is answer: [1]");
   }
if (answer4 == 3){
  System.out.println("Wrong !!,");
  System.out.println("Correct is answer: [1]");
   } 
if (answer4 == 4){
  System.out.println("Wrong !!,");
  System.out.println("Correct is answer: [1]");
   }
if (answer4 >= 5){
   System.out.println("Option not found");
   }
System.out.println();
String quizgame5="""
            QUESTION  5

 Which technology did the Nokia 5510 use to browse primitive W.A.P internet pages?
 
1. G.P.R.S (General Packet Radio Service)

2. C.S.D (Circuit-Switched Data at 9.6 k.b.p.s)

3. Wi-Fi 1.0

4. 3G  U.M.T.S
""";
     System.out.println(quizgame5);
   System.out.println("Enter your answer ");
   int answer5 = input.nextInt();

if (answer5 == 1){
  System.out.println("Wrong !!,");
  System.out.println("Correct is answer: [2]");
   }
if (answer5 == 2 ){
  System.out.println("CORRECT !!!!!!");
   }
if (answer5 == 3){
  System.out.println("Wrong !!,");
  System.out.println("Correct is answer: [2]");
   } 
if (answer5 == 4){
  System.out.println("Wrong !!,");
  System.out.println("Correct is answer: [2]");
   }
if (answer5 >= 5){
   System.out.println("Option not found");
   }
}
 }
  }
   } 
    
switch (option){    
     case 14 -> {
String ringtones = """ 
=======RING TONES========

  Select ring tone 
  
1. Groovy blue 

2. Merry X mas

3. Tape dance 

4. Ring Ring

5. Mozart 40

6. Rocket 

7. Play ground

8. Tick Tick 

9. sunny walks 

10.Toreador
""";
  System.out.println(ringtones);
  System.out.println("Enter option: ");
   int ringtone = input.nextInt();

if (ringtone == 1){
     System.out.println("Rhythmic, blue inspired upbeat tune ");
     System.out.println("RINGING.....RINGING......RINGING.......");
    }
if (ringtone == 2){
     System.out.println("A festive holiday jingle");
     System.out.println("RINGING.....RINGING......RINGING.......");
    }
if (ringtone == 3){
     System.out.println("A rhythmic percussive tape pattern");
     System.out.println("RINGING.....RINGING......RINGING.......");
    }
if (ringtone == 4){
     System.out.println(" A standard telephone ring stimulation ");
     System.out.println("RINGING.....RINGING......RINGING.......");
    }
if (ringtone == 5){
     System.out.println("classic excerpt from Mozart symphony NO.40  ");
     System.out.println("RINGING.....RINGING......RINGING.......");
    }
if (ringtone == 6){
     System.out.println(" Rising pitch sound effect");
     System.out.println("RINGING.....RINGING......RINGING.......");
    }
if (ringtone == 7){
     System.out.println("A light cheerful chime like tone");
     System.out.println("RINGING.....RINGING......RINGING.......");
    }
if (ringtone == 8){
     System.out.println("A fast clock ticking alert");
     System.out.println("RINGING.....RINGING......RINGING.......");
    }
if (ringtone == 9){
     System.out.println("A smooth relaxing walking tempo tune");
     System.out.println("RINGING.....RINGING......RINGING.......");
    } 
if (ringtone == 10){
     System.out.println("A dramatic march melody from Carmel  ");
     System.out.println("RINGING.....RINGING......RINGING.......");
    }
if (ringtone >= 11){
     System.out.println("option not found");
    }
}
 }
  
   
 
switch (option){
      case 11 -> {
String clock = """
->->->->->->-> CLOCK <-<-<-<-<-<-<-<-<-
        
        Time is like a piece of gold
               select
1. Alarm

2. Clock

3. Timer
""";      
   System.out.println(clock);
   System.out.println("Enter your option");
    int worldclock = input.nextInt();

switch (worldclock){
       case 1  -> {
String alarm =""" 
  =======ALARM=========

     EMPTY LIST
      
      ADD ALARM
""";
   System.out.println(alarm);
}
}
switch (worldclock){
      case 2  -> {
String clocksetting ="""
 ========CLOCK=========
      
      EMPTY LIST 
       
       ADD CLOCK
""";
   System.out.println(clocksetting);
}
}
switch (worldclock){
      case 3  -> {
String timer ="""
 ========TIMER=========
      
      EMPTY LIST 
       
       ADD TIMER
""";
   System.out.println(timer);
}
 }
}
 }
  }
    }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
