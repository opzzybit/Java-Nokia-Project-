import java.util.Scanner;
  
  public class NokiaUserMenu{
  
        public static void main(String [] args){ 
       
         Scanner input = new Scanner(System.in);
 
 System.out.println("===========WELCOME TO NOKIA 5510=============");
     
     System.out.println(); 
     System.out.println("***CREATE A PASSWORD*****"); 
         int firstpassword = input.nextInt();
 
 System.out.println();
 int userpassword = firstpassword;
 while (true){  
    System.out.println("****CONFIRM THE PASSWORD*******");
    System.out.println("Enter four(4) digit number:");
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
0. Back
=====================================
""";
    
    System.out.println(Stringmenu);  
    System.out.println("Enter your option");
      int option = input.nextInt();

switch (option){
       case 1 -> {
System.out.println("""
  ========PROFILE========

1. General MODE 

2. Silent

3. Meeting

4. outdoor

5. Customize
""");
   System.out.println("Enter your option");
    int phoneprofile = input.nextInt();       
if (phoneprofile == 1){
   System.out.println("GENERAL MODE ACTIVATED !!!!!!");
}
if (phoneprofile == 2){
   System.out.println("SILENT MODE ACTIVATED !!!!!!");
}
if (phoneprofile == 3){
    System.out.println(" MEETING MODE ACTIVATED !!!!!!");
}
if (phoneprofile == 4){
    System.out.println("OUTDOOR MODE ACTIVATED !!!!!!");
}
if (phoneprofile == 5){
    System.out.println("""
      CUSTOMIZE YOUR VOLUME
    
1. Increase Ringtone volume

2. Increase keyboard volume

3. Reduce Ringtone volume

4. Reduce Keyboard volume
""");
}  
  System.out.println("Enter your option");
    int customizevolume = input.nextInt();

if (customizevolume== 1){
     System.out.println("RINGTONE VOLUME INCREASED  !!!!!!");
    }
if  (customizevolume == 2){
     System.out.println("KEYBOARD VOLUME INCREASED !!!!!!!");
    }
if  (customizevolume == 3){
     System.out.println("RINGTONE VOLUME REDUCED !!!!!!!");
    }
if  (customizevolume == 4){
     System.out.println("KEYBOARD VOLUME REDUCED !!!!!!! ");
    }
if  (customizevolume >= 5){
     System.out.println("OPTION NOT FOUND  ");
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
 if (bookpage== 1){
  System.out.println("""
           SEARCH
abc....                        
  
   
       EMPTY CONTACT !!!!!!
  
  
Enter the name : ...................   
  """);
}
if (bookpage == 2){
  System.out.println("""
           ADD NAME 
abc....                        
  
   
       EMPTY CONTACT !!!!!!


Enter the name : .................
Enter phone number :.. ...............   
  """);
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
  """);
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

if (phonemessage == 1){
  System.out.println("NO SIM TO MOVE FURTHER !!!!!!!");
   }
if (phonemessage == 2 ){
   System.out.println("EMPTY INBOX !!!!!!!!");
   }
if (phonemessage == 3){
   System.out.println("EMPTY OUTBOX !!!!!!!!");
   }
if (phonemessage >= 4){
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
}



switch(option) {
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

There are two(2) questions only, so try your luck.

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
System.out.println();
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
System.out.println();
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

 
  
  
    
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
