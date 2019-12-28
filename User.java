package sample;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private String name;
    private int id;

    public String SEND_frinndrequest(){
        ArrayList<String> names_Sfriend=new ArrayList<String>();
        for(int s1=1;s1<4;s1++){
        System.out.print("Enter your friend name to send friend request:");
        Scanner sc1=new Scanner(System.in);
        String in1=sc1.nextLine();
        names_Sfriend.add(in1);
    }
     return "You send friend request for this friends: \n"+names_Sfriend;
    }

    public String Accept_frinndrequet(){
        ArrayList<String> names_Afriend=new ArrayList<String>();
        for(int s2=1;s2<5;s2++){
        System.out.print("Enter your friend name to accept friend request:");
        Scanner sc2=new Scanner(System.in);
        String in2=sc2.nextLine();
        names_Afriend.add(in2);
    }
    return "You accept friend request for this friends: \n"+names_Afriend;
    }

    public void SEARCH_frinndpage(){
    System.out.print("Enter name to search for his page:");
    Scanner sc3=new Scanner(System.in);
    String in3=sc3.nextLine();
    System.out.print("Enter 1"+" found"+" or 0"+" not found"+":");
    Scanner sc4=new Scanner(System.in);
    int in4=sc4.nextInt();
    if (in4==1){System.out.print("we found the page\n");}
    else if (in4==0){System.out.print("we not found the page\n");}
    }
    public void CREATE_Group(){
        System.out.print("Enter the name for the group:");
        Scanner sc6=new Scanner(System.in);
        String in6=sc6.nextLine();
        System.out.print("Enter kind of the group public or private:");
        Scanner sc7=new Scanner(System.in);
        String in7=sc7.nextLine();
        System.out.print("Enter the name of the group to search for it:");
        Scanner sc8=new Scanner(System.in);
        String in8=sc8.nextLine();
        System.out.print("Enter 1 or 0:");
        Scanner sc9=new Scanner(System.in);
        int in9=sc9.nextInt();
        if(in9==1){System.out.print("we found the group\n");}
        else if (in9==0){System.out.print("we not found the group\n");}
    }

    public void CREATE_Page(){
        System.out.print("Enter the name for the page:");
        Scanner sc6=new Scanner(System.in);
        String in6=sc6.nextLine();
        System.out.print("Enter kind of the page :");
        Scanner sc7=new Scanner(System.in);
        String in7=sc7.nextLine();
        System.out.print("Enter the name of the page to search for it:");
        Scanner sc10=new Scanner(System.in);
        String in10=sc10.nextLine();
        System.out.print("Enter 1 or 0:");
        Scanner sc9=new Scanner(System.in);
        int in9=sc9.nextInt();
        if (in9==1){System.out.print("we found the page\n");}
        else if (in9==0){System.out.print("we not found the page\n");}
    }

    public void SEND_Message(){

        System.out.print("Select the friend to send message:");
        Scanner sc6=new Scanner(System.in);
        String in6=sc6.nextLine();
        System.out.print("write what's want to send:");
        Scanner sc7=new Scanner(System.in);
        String in7=sc7.nextLine();
    }


}
