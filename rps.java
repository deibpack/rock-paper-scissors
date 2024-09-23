import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class rps{
public static void main (String[] args){
Scanner dave = new Scanner(System.in);
    Random rps = new Random();
String[] rpes = {"1.Rock" ,"2.Paper","3.Scissors"};
System.out.println("You are playing the rock paper scissors ");
int enemy = rps.nextInt(3)+1;
System.out.println("Choose your weapon: " + Arrays.toString(rpes));
int mywep = dave.nextInt();
String yw = "Your weapon is: ";
String ew = "Enemy weapon is: ";
int win = 0;
int lose = 0;
int draw =0;
while (true){if (mywep == 3)break;
    if (mywep ==2)break;
    if (mywep ==1)break;
    System.out.println("Specific number only (1, 2 ,3 ) Choose your weapon: " + Arrays.toString(rpes));
mywep = dave.nextInt();
}


while (true) {
if (enemy==1){System.out.println(ew+"Rock");}
else if  (enemy==2){System.out.println(ew+"Paper");}
else if (enemy==3){System.out.println(ew+"Scissors");}

if (mywep==1){System.out.println(yw+"Rock");}
else if (mywep==2){System.out.println(yw+"Paper");}
else if (mywep==3){System.out.println(yw+"Scissors");}

//win
if ((enemy==3)&&(mywep==1)||(enemy==1)&&(mywep==2)||(enemy==1)&&(mywep==3)) {System.out.println("You Win"); win++;}
else if ((enemy==2)&&(mywep==1)||(enemy==3)&&(mywep==2)||(enemy==2)&&(mywep==3)) {System.out.println("You Lose"); lose++;}
else {System.out.println("Draw");draw++;}
dave.nextLine();
System.out.println("Do you want to play again? (yes/no)");
String again = dave.nextLine().toLowerCase();



    
if (again.equalsIgnoreCase("no")) break;
else if (again.equalsIgnoreCase("yes"))
System.out.println("Choose your weapon: " + Arrays.toString(rpes));
enemy = rps.nextInt(3)+1;
mywep = dave.nextInt();

}

System.out.println("Thank you for playing :>");
System.out.println("Your Stats Is: WIN: "+win+ " LOSE: "+lose+ " DRAW: "+ draw);



dave.close();
}




}




