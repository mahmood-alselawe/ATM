package HomePage;

import java.io.*;
import java.util.Scanner;

public class HomeMain {


    public static void main(String[] args) {

        // her use scanner to allow to user interact with program
        Scanner sc = new Scanner(System.in);


        // instead we create file to regular class and implements HomePageInterface and Override the methods
        // than crate Object and use this methods


        // create anonymous class and implements HomePageInterface and Override the methods
        // than use what you want

        // different between regular class and anonymous class
        // that anonymous you don't need , (create file for class + and implemnts interface + create object )
        // direct implements a methods and use it


        // we use Lambda
        // instead use anonymous class (create a anonymous class and than implements the interface override methods)
        // we use Lambda direct you implements the code and short cut the 1- @override 2- name of methods
        // 3-type of method ==> just stay the parameter (arguments)->{Ststments}

        HomePageInterface HomePage = () -> {

            try {

                File f = new File("/Users/mahmoodselawi/Desktop/com_java/ATM/src/Files","key.ser");

                FileInputStream fis = new FileInputStream(f);

                ObjectInputStream ois = new ObjectInputStream(fis);

                Object Display1 = (Object) ois.readObject();

                System.out.println(Display1);

            }
            catch (Exception i)
            {
                System.out.println(i.getMessage());
            }

        };

        HomePage.DisPlay();

        AddHomeInterface HomeAdd = (int ADD) ->
        {
            System.out.println(" you add =" + ADD);

            return ADD;

        };

        System.out.print("enter the number that want to add : ");

        int Add_number_user = sc.nextInt();

        HomeAdd.Add(Add_number_user);



        try {
            File file_count = new File("/Users/mahmoodselawi/Desktop/com_java/ATM/src/Files","file_count.ser");

            file_count.createNewFile();

            FileOutputStream fos = new FileOutputStream(file_count);

            OutputStreamWriter osw = new OutputStreamWriter(fos);

            BufferedWriter bw = new BufferedWriter(osw);

            bw.write(Add_number_user);

        }
        catch (Exception i)
        {
            System.out.println(i.getMessage());
        }

        HomeSubInterface HomeSub = (int sub) ->
        {
            System.out.println(" you add =" + sub);

            return sub;


        };
        count(HomeAdd,HomeSub);





    }

    public static int count(AddHomeInterface i , HomeSubInterface i1)
    {

        System.out.println(i + "-" + i1 + "=" );

        return 0;
    }

















}
