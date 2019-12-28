package sample;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> Names = new ArrayList<String>();
        ArrayList<String> Passwords = new ArrayList<String>();
        ArrayList<String> Emails = new ArrayList<String>();
        ArrayList<String> Genders = new ArrayList<String>();
        ArrayList<String> Countrys = new ArrayList<String>();
        ArrayList<String> Birthdays = new ArrayList<String>();
        for (int yy = 1; yy > 0; yy++) {
            Registers registers = new Registers();
            System.out.println("press 1 to Registers");
            System.out.println("press 2 to Login");
            System.out.println("Press 0 to Logout");
            Scanner s3 = new Scanner(System.in);
            int press = s3.nextInt();
            if (press == 1) {
                System.out.println("Enter your name:");
                Scanner s = new Scanner(System.in);
                String name = s.nextLine();
                registers.setName(name);
                Names.add(name);
                System.out.println("Enter your password:");
                Scanner s1 = new Scanner(System.in);
                String password = s1.nextLine();
                registers.setPassword(password);
                Passwords.add(password);
                System.out.println("Enter your mail");
                Scanner ss = new Scanner(System.in);
                String Email = ss.nextLine();
                registers.setEmail(Email);
                Emails.add(Email);
                System.out.println("Enter your Gender");
                Scanner ge = new Scanner(System.in);
                String Gender = ge.nextLine();
                registers.setGender(Gender);
                Genders.add(Gender);
                System.out.println("Enter your Country");
                Scanner co = new Scanner(System.in);
                String Country = co.nextLine();
                registers.setCountry(Country);
                Countrys.add(Country);
                System.out.println("Enter your Birthday");
                Scanner br = new Scanner(System.in);
                String Birthday = br.nextLine();
                registers.setBirthday(Birthday);
                Birthdays.add(Birthday);
                System.out.println(registers.havemail(name, password, Email, Gender, Country, Birthday));
            }
            if(press==2)
            {
                Login login=new Login();
                System.out.println("Enter UserName");
                Scanner scanner=new Scanner(System.in);
                String name1=scanner.nextLine();
                login.setName(name1);
                System.out.println("Enter Password");
                Scanner scanner1=new Scanner(System.in);
                String Pass1=scanner1.nextLine();
                login.setPassword(Pass1);
                String check=login.getName();
                String check1=login.getPassword();
                if(Names.contains(check)&&Passwords.contains(check1))
                {
                    System.out.println("Welcome to App");
                    System.out.println("press 1 to logged user");
                    System.out.println("press 2 to Premium uer");
                    Scanner scanner2=new Scanner(System.in);
                    int input=scanner2.nextInt();
                    if(input==1)
                    {
                        System.out.println("You can do:");
                        System.out.println("1)send friend request\n"+"2)accept friend request\n"+"3)search to find friend\n"
                        +"4)create post\n"+"5)create group\n"+"6)create page\n"+"7)send message");
                        Scanner scan1=new Scanner(System.in);
                        int inp=scan1.nextInt();
                        User user1=new User();

                        if(inp==1)
                            {System.out.println(user1.SEND_frinndrequest());}
                        else if(inp==2)
                            {System.out.println(user1.Accept_frinndrequet());}
                        else if (inp==3)
                            {user1.SEARCH_frinndpage();}
                        else if (inp==4){
                            System.out.print("what's on your mind?\n");
                            Scanner sc5=new Scanner(System.in);
                            String in5=sc5.nextLine();
                        }
                        else if (inp==5)
                            {user1.CREATE_Group();}

                        else if (inp==6)
                            {user1.CREATE_Page();}

                        else if (inp==7)
                            {user1.SEND_Message();}

                    }
                    if(input==2)
                    {
                        System.out.println("You can do:");
                        System.out.println("1)create post\n"+"2)create group\n"+"3)create page\n"+"4)send message");
                        Scanner scan1=new Scanner(System.in);
                        int inp=scan1.nextInt();
                        User user1=new User();

                        if (inp==1){
                            System.out.print("what's on your mind?\n");
                            Scanner sc5=new Scanner(System.in);
                            String in5=sc5.nextLine();
                        }
                        else if (inp==2)
                        {user1.CREATE_Group();}

                        else if (inp==3)
                        {user1.CREATE_Page();}

                        else if (inp==4)
                        {user1.SEND_Message();}


                    }
                }
                }


            if(press==0)
            {
                break;
            }
        }
}
 }


