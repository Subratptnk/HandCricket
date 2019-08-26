
import java.io.*;

public class Hand_Cricket

{

    public static void main(String args[])throws IOException
    
    {
        
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        
        String name; 		// to accept the player's name;
        int a; 				// converting the random real number generated by 'rr' into a random whole number run for the computer;
        int i; 				// used in for loops;
        int b; 		// to accept the player's number;
        double r; // to generate a random real number;
        int cheat; 			// to end the game if wrong input is entered; to keep a check whilst the game is running as to whether the game has ended or not;
        int score1; // to store the latest runs scored by the player;
        int score2; // to store the latest runs scored by the computer;
        int c; // used in for loops to create a specific design;
        int choice; // used to decide whether the game needs to be ended or restarted;
        int infinity=1; // used to keep the game running until the player decides to end the game;
      
        
        while(infinity>0)
        {
            
            name=" ";
            a=0;
            i=0;
            b=0;
            r=0;
            cheat=0;
            score1=0;
            score2=0;
            c=0;
            choice=0;
            infinity=1;
            
            System.out.println("=======================");
            System.out.println("| WELCOME TO THE GAME |");
            System.out.println("=======================");
            System.out.println("");
            System.out.print("Enter Your Name: ");
            name=br.readLine();
            
                for(c=0;c<=2;c++)
                {
                    System.out.println("====================================");
                }
                
                System.out.println("Hello "+name+",");
                System.out.println(".");
                System.out.println("WELCOME TO THE CRICKET");
                System.out.println(".");
                System.out.println("Instructions:");
                System.out.println(".");
                System.out.println("This Game Is Similar To The Hand-Cricket Game Played By Kids.");
                System.out.println(".");
                System.out.println("There Is No Limit On The Number Of Balls.");
                System.out.println(".");
                System.out.println("You Will First Bat. Enter Any Number From 1 To 6.");
                System.out.println(".");
                System.out.println("Enter The Numbers Carefully Without Making Any Mistake.");
                System.out.println(".");
                System.out.println("If The Number Entered By The Computer Is Same As The Number Entered By You,");
                System.out.println("You Will Be Declared As Out.");
                System.out.println(".");
                System.out.println("Your Final Score Will Be The Sum Of The Numbers You Entered Before Getting Out.");
                System.out.println(".");
                System.out.println("After Getting Out, You Will Have To Bowl.");
                System.out.println(".");
                System.out.println("Try To Enter A Number Similar To The Number Entered By The Computer.");
                System.out.println(".");
                System.out.println("If The Sum Of Numbers Entered By The Computer Becomes More Than Your Score, It Will Win.");
                System.out.println(".");
                System.out.println("But If You Enter A Number Same As The Number Entered By The Computer, You Can Win!");
                System.out.println(".");
                
                for(c=0;c<=2;c++)
                {
                    System.out.println("====================================");
                }
                
                System.out.println("YOU ARE BATTING:");
                
                for(c=0;c<=2;c++)
                {
                	System.out.println("====================================");
                } 
                for(i=1;i>0;i++)
                {
                    System.out.println("");
                    System.out.print("Enter Your Number: ");
                    b=Integer.parseInt(br.readLine());
                    r=((Math.random())*10);
                    r=r+1;
                    a=(int)(r);
                    System.out.println("");
                    System.out.println("Computer's Number: "+a);
                    System.out.println("");
                    System.out.println("**********");
                    System.out.println("");

                    if(b==a)
                    {
                        System.out.println(" ");
                        System.out.println("HOWZATTT!!!!!!");
                        System.out.println(" ");
                        System.out.println("################");
                        System.out.println("################");
                        System.out.println("YOUR FINAL SCORE = "+score1);
                        System.out.println("################");
                        System.out.println("################");
                        System.out.println(" ");
                        break;
                    }
                    
                    else if(b>0&&b<=10) { score1=score1+b; } else if(b>10||b<=0)
                    {
                        for(c=0;c<=2;c++)
                        {
                            System.out.println("====================================");
                        }
                        System.out.println("You have either tried to cheat or entered a wrong input. Game Over!");
                        cheat++;
                        break;
                    }

                    System.out.println("Your Current Score Is "+score1);
                    System.out.println("");
                    System.out.println("**********");
                }
                
                for(c=0;c<=2;c++) { if(cheat>0)
                    {
                        break;
                    }
                    System.out.println("====================================");
                }
                
                for(c=0;c<1;c++) { if(cheat>0)
                    {
                        break;
                    }
                    System.out.println("YOU ARE BOWLING:");
                }
                
                for(c=0;c<=2;c++) { if(cheat>0)
                    {
                        break;
                    }   
                    System.out.println("====================================");
                }
                
                for(i=1;i>0;i++)
                {
                    if(cheat>0)
                    {
                        break;
                    }
                    
                    System.out.println("");
                    System.out.print("Enter Your Number: ");
                    b=Integer.parseInt(br.readLine());
                    r=((Math.random())*6);
                    r=r+1;
                    a=(int)(r);
                    System.out.println("");
                    System.out.println("Computer's Number: "+a);
                    System.out.println("");
                    System.out.println("**********");
                    System.out.println("");
                    
                    if(a==b)
                    {
                        System.out.println(" ");
                        System.out.println("COMPUTER IS OUTT!!!!");
                        System.out.println(" ");
                        System.out.println("################");
                        System.out.println("################");
                        System.out.println("COMPUTER'S FINAL SCORE = "+score2);
                        System.out.println("################");
                        System.out.println("################");
                        System.out.println(" ");
                        break;
                    }
                    
                    else if(b>0&&b<=10)
                    { 
                    	score2=score2+a; 
                    } 
                    else if(b>10||b<=0)
                    {
                        for(c=0;c<=2;c++)
                        { 
                        	System.out.println("====================================");
                        }
                        System.out.println("You have either tried to cheat or entered a wrong input. Game Over!"); 
                        cheat++;
                        break;
                     }
                    if(score2>score1)
                    {
                        System.out.println(" ");
                        System.out.println("THE COMPUTER HAS SCORED MORE THAN YOUU!!!");
                        System.out.println(" ");
                        System.out.println("################");
                        System.out.println("################");
                        System.out.println("COMPUTER'S FINAL SCORE = "+score2);
                        System.out.println("################");
                        System.out.println("################");
                        System.out.println(" ");
                        break;
                    }
                    
                    System.out.println("Computer's Current Score Is "+score2);
                    System.out.println("");
                    System.out.println("**********");
                }
                
                for(c=0;c<=2;c++) { if(cheat>0)
                    {
                        break;
                    }
                    
                    System.out.println("====================================");
                }
                
                for(i=0;i<1;i++) 
                { if(cheat>0)
                    {
                        break;
                    }
                    
                    System.out.println(" ");
                    System.out.println("################");
                    System.out.println("################");
                    System.out.println("YOUR FINAL SCORE = "+score1);
                    System.out.println("COMPUTER'S FINAL SCORE = "+score2);
                    System.out.println("################");
                    System.out.println("################");
                    System.out.println(" ");

                    if((score1)>(score2))
                    {
                        System.out.println("Congratulations "+name+"!! You Have Defeated The Almighty, Computer!!");
                    }
                    
                    else if((score1)<(score2))
                    {
                        System.out.println("Sorry "+name+", But The Computer Has Defeated You..!");
                    }
                    
                    else
                    {
                        System.out.println("It's a Tie..! :(");
                    }
                    
                }
                
                for(c=0;c<=2;c++)
                {
                    System.out.println("====================================");
                }
            
            System.out.println("");
            System.out.println("Enter 1 To Play This Game Again.");
            System.out.println("");
            System.out.println("Enter 0 Or Any Other Number To Quit.");
            choice=Integer.parseInt(br.readLine());
            System.out.println("");
            
            if(choice==1)
            {
                System.out.print('\f');
            }
            
            else
            {
                System.out.print('\f');
                System.out.println("Good Bye!");
                break;
            }
            
        }
    }
}
