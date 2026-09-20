import java.util.Scanner;
  
  public class NokiaUserMenu{
  
        public static void main(String [] args){ 
       
         Scanner input = new Scanner(System.in);
 
 System.out.println("===========WELCOME TO NOKIA 5510=============");
 
 int userpassword = 0;
      
      System.out.println("***Create a password***");
      System.out.println("Enter four(4) digit number:");
        int password = input.nextInt();
         userpassword = password + userpassword;
 
    System.out.println("INSERT A SIM");        

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
}
}
}
}

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
