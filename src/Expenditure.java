
import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Expenditure {
    public static void main(String[] args) {
        System.out.println("        WELCOME TO YOUR OWN PERSONAL EXPENSES MANAGER");
        System.out.println("           Note- turning on caps lock is suggested\n");



        Scanner test= new Scanner(System.in);
        int n=0,i,will=2,t;
        transaction_details[] cus = new transaction_details[10];
        while(will==2){
            System.out.print("Enter the number of enteries to be done -:");
            t= test.nextInt();



            for(i=0;i<t;i++) {
                cus[i+n]= new transaction_details();
                System.out.println("Entry "+ (i+n+1));
                cus[i+n].read();
            }
            n=n+t;
            will=1;
            while(will==1){
                System.out.println("Choose any option:\n" +
                        "Press CD for complete description\n" +
                        "Press combination of letters as per required\n" +
                        "(for ex- OR for Online requirement expense)");
                String ca;
                int s=0;
                ca= test.next();
                if(ca.equals("CD")){
                    for(i=0;i<n;i++){

                        cus[i].display();
                        System.out.println("");
                    }
                }
                else if(ca.equals("O")){
                    System.out.println("Your total online expenses is as under :");
                    File read= new File("Online.txt");
                    Scanner sc= null;
                    try {
                        sc = new Scanner(read);
                        while(sc.hasNextLine())
                        {
                            String line = sc.nextLine();
                            System.out.println(line);
                            int a = line.length();
                            int num= a-20;
                            char[] amt = new char[num];
                            line.getChars(20,a,amt,0);
                            s+= Integer.parseInt(String.valueOf(amt));


                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Total = "+s+"\n");
                }
                else if(ca.equals("C")){
                    System.out.println("Your total cash expenses are as under :");
                    File read= new File("Cash.txt");
                    Scanner sc= null;
                    try {
                        sc = new Scanner(read);
                        while(sc.hasNextLine())
                        {
                            String line = sc.nextLine();
                            System.out.println(line);
                            int a = line.length();
                            int num= a-20;
                            char[] amt = new char[num];
                            line.getChars(20,a,amt,0);
                            s+= Integer.parseInt(String.valueOf(amt));


                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Total = "+s+"\n");
                }
                else if(ca.equals("W")){
                    System.out.println("Your total withdrawls are as under :");
                    File read= new File("Withdrawls.txt");
                    Scanner sc= null;
                    try {
                        sc = new Scanner(read);
                        while(sc.hasNextLine())
                        {
                            String line = sc.nextLine();
                            System.out.println(line);
                            int a = line.length();
                            int num= a-20;
                            char[] amt = new char[num];
                            line.getChars(20,a,amt,0);
                            s+= Integer.parseInt(String.valueOf(amt));


                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Total = "+s+"\n");
                }

                else if(ca.equals("CR")){
                    System.out.println("Your total cash useful expenses are as under :");
                    File read= new File("Cash_required.txt");
                    Scanner sc= null;
                    try {
                        sc = new Scanner(read);
                        while(sc.hasNextLine())
                        {
                            String line = sc.nextLine();
                            System.out.println(line);
                            int a = line.length();
                            int num= a-20;
                            char[] amt = new char[num];
                            line.getChars(20,a,amt,0);
                            s+= Integer.parseInt(String.valueOf(amt));


                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Total = "+s+"\n");
                }
                else if(ca.equals("CM")) {
                    System.out.println("Your total cash miscellaneous expenses are as under :");
                    File read= new File("Cash_miscellaneous.txt");
                    Scanner sc= null;
                    try {
                        sc = new Scanner(read);
                        while(sc.hasNextLine())
                        {
                            String line = sc.nextLine();
                            System.out.println(line);
                            int a = line.length();
                            int num= a-20;
                            char[] amt = new char[num];
                            line.getChars(20,a,amt,0);
                            s+= Integer.parseInt(String.valueOf(amt));


                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Total = "+s+"\n");
                }
                else if(ca.equals("OR")){
                    System.out.println("Your total online useful expenses are as under :");
                    File read= new File("Online_required.txt");
                    Scanner sc= null;
                    try {
                        sc = new Scanner(read);
                        while(sc.hasNextLine())
                        {
                            String line = sc.nextLine();
                            System.out.println(line);
                            int a = line.length();
                            int num= a-20;
                            char[] amt = new char[num];
                            line.getChars(20,a,amt,0);
                            s+= Integer.parseInt(String.valueOf(amt));


                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Total = "+s+"\n");
                }
                else if(ca.equals("OM")){
                    System.out.println("Your total online miscellaneous expenses are as under :");
                    File read= new File("Online_miscellaneous.txt");
                    Scanner sc= null;
                    try {
                        sc = new Scanner(read);
                        while(sc.hasNextLine())
                        {
                            String line = sc.nextLine();
                            System.out.println(line);
                            int a = line.length();
                            int num= a-20;
                            char[] amt = new char[num];
                            line.getChars(20,a,amt,0);
                            s+= Integer.parseInt(String.valueOf(amt));


                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Total = "+s+"\n");
                }
                else{
                    System.out.println("No such queries found");
                }
                System.out.println("For more queries press 1\nFor more entries press 2\nFor exiting press 3");
                will= test.nextInt();
            }
        }
        System.out.println("Thanks for using our software\n" +
                "Have a nice day");
    }
}
class transaction_details {
    int amount;
    String mode;
    String type;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    LocalDateTime now = LocalDateTime.now();
    public void read() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter amount paid");

        amount =inp.nextInt();


        System.out.println("Enter mode:-\nO for online\nC for cash\nW for cash withdrawl");
        mode =inp.next();
        if(mode.equals("O") || mode.equals("C") || mode.equals("W"))
        {}
        else{
            System.out.println("Enter valid mode");
            mode=inp.next();
        }
        if(mode.equals("W"))
        {}
        else {
            System.out.println("Enter type of expense:-\nR for Requirement\nM for miscellaneous");
            type = inp.next();
            if (type.equals("R") || type.equals("M")) {
            } else {
                System.out.println("Enter valid type");
                type = inp.next();
            }
        }
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(
                    new FileWriter("Cash_required.txt", true));
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedWriter out4 = null;
        try {
            out4 = new BufferedWriter(
                    new FileWriter("Withdrawls.txt", true));
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter out5=null;
        try {
            out5 = new BufferedWriter(
                    new FileWriter("Online.txt", true));
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter out6 =null;
        try {
            out6 = new BufferedWriter(
                    new FileWriter("Cash.txt", true));
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter out1 = null;
        try {
            out1 = new BufferedWriter(
                    new FileWriter("Cash_miscellaneous.txt", true));
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter out2 = null;
        try {
            out2 = new BufferedWriter(
                    new FileWriter("Online_miscellaneous.txt", true));
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter out3 = null;
        try {
            out3 = new BufferedWriter(
                    new FileWriter("Online_required.txt", true));
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(mode.equals("C") && type.equals("R")){
            try {
                out.write(dtf.format(now));
                out.write("   -"+amount+"\n");
                out6.write(dtf.format(now));
                out6.write("   -"+amount+"\n");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if (mode.equals("C") && type.equals("M")){
            try {

                out1.write(dtf.format(now));
                out1.write("   -"+amount+"\n");
                out6.write(dtf.format(now));
                out6.write("   -"+amount+"\n");


            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if (mode.equals("O") && type.equals("M")){
            try {

                out2.write(dtf.format(now));
                out2.write("   -"+amount+"\n");
                out5.write(dtf.format(now));
                out5.write("   -"+amount+"\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if (mode.equals("O") && type.equals("R")){
            try {
                out5.write(dtf.format(now));
                out5.write("   -"+amount+"\n");
                out3.write(dtf.format(now));
                out3.write("   -"+amount+"\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if (mode.equals("W")){
            try {

                out4.write(dtf.format(now));
                out4.write("   -"+amount+"\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            System.out.println("Nothing");
        }
        try {
            out.close();
            out1.close();
            out2.close();
            out3.close();
            out4.close();
            out5.close();
            out6.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void display(){
        System.out.println("Amount is "+amount);
        if(mode.equals("W")){
            System.out.println("It was a cash withdrawl");
        }
        else{
            if(mode.equals("O")) {
                System.out.print("It was an online ");
            }
            else {
                System.out.print("It was a cash ");
            }
            if(type.equals("R")){
                System.out.println("useful expense");
            }
            else{
                System.out.println("miscellaneous expense");
            }

        }
    }
}
