package com.malcolm;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException{
	Scanner userInput=new Scanner(System.in);
        System.out.println("Hello, get ready to enter the information for your lake, and run time. \n Enter q,Q,or quit to exit the program.");
       // String userQuitOption="";
        String lakeName;
        Integer numberOfLakes;
        Double runtime=0.0;
        ArrayList<LakeClass> lakeNamesArrayList=new ArrayList<>();
        System.out.println("How many lakes did you want to enter times for?");
        numberOfLakes=userInput.nextInt();
        userInput.nextLine();//this clears the buffer of the newline character
        for(int x=0;x<numberOfLakes;x++){
            System.out.println("Please enter a lake.");
            lakeName=userInput.nextLine();
            lakeNamesArrayList.add(new LakeClass(lakeName));
        }
        for(LakeClass lake:lakeNamesArrayList){
            String userQuitOption="";
            while(!userQuitOption.equals("n") && !userQuitOption.toLowerCase().equals("no")){
                System.out.println(String.format("Please enter a run time(in minutes) for Lake %s",lake.getLakeName()));
                runtime=userInput.nextDouble();
                lake.setRunTime(runtime);
                userInput.nextLine();//this clears the buffer of the newline character
                System.out.println("Do you have more times to enter for this lake?");
                userQuitOption=userInput.nextLine();
            }
        }
        System.out.println("Your best times for your data are:");
        for(LakeClass lake:lakeNamesArrayList){
            System.out.println(lake.displayMinTime());
        }
    }
}
