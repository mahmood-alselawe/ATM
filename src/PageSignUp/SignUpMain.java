package PageSignUp;

import java.io.*;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class SignUpMain  {
    public static void main(String[] args) {

        // we am try  use threads
        Thread a = new Thread(new MyRunnable());

        // we use Scanner to make ability for user to write input

        Scanner sc = new Scanner(System.in);


        // we create Anonymous because the Signup class  type of abstract
        Signup signup = new Signup() {};

        // we this class to generate number for the key in three_map
        AtomicInteger key_gen = new AtomicInteger();

        // starts the thread
        a.start();



        while (a.isAlive())
        {
            // -----------
            System.out.print("enter your name : ");
            // save the input user in sc_name
            String sc_name = sc.nextLine();

            //System.out.println("Signup.name_regex_filed(sc_name) = " + Signup.name_regex_filed(sc_name));


            //                               key = generate number   , values
            signup.tm_for_store_new_data.put(key_gen.getAndIncrement(), sc_name);




            // ---------------------------

            System.out.print("enter your Last name : ");
            //save the input user
            String sc_last_name = sc.nextLine();
            //                               key = generate number   , values
            signup.tm_for_store_new_data.put(key_gen.getAndIncrement(), sc_last_name);



            //System.out.println("Signup.name_regex_filed(sc_last_name) = " + Signup.name_regex_filed(sc_last_name));

            // ---------------------------

            System.out.print("enter your userName : ");
            // save the input user
            String sc_userName = sc.nextLine();
            //                               key = generate number   , values
            signup.tm_for_store_new_data.put(key_gen.getAndIncrement(), sc_userName );


            // this function check if the username compile regex
            System.out.println("Signup.username_regex_filed(sc_userName) = " + Signup.username_regex_filed(sc_userName));

            // -----------------
            System.out.print("enter your passWord : ");

            // save input user
            String sc_passWord = sc.nextLine();
            //                               key = generate number   , values
            signup.tm_for_store_new_data.put(key_gen.getAndIncrement(), sc_passWord );

            //this function check if the password compile regex
            System.out.println("password very week tey again = " + Signup.password_regex_filed(sc_passWord));

            // ---------------------------

            System.out.print("enter your phone Number : ");

            // save input users
            String sc_phone_Number = sc.nextLine();

            //                               key = generate number   , values
            signup.tm_for_store_new_data.put(key_gen.getAndIncrement(), sc_phone_Number );



            // ---------------------------


            System.out.print("insert your gender : ");

            // save the input user
            String sc_gender = sc.nextLine();

            //                               key = generate number   , values
            signup.tm_for_store_new_data.put(key_gen.getAndIncrement(), sc_gender );



            // ------------create file and direct---------------

            File f = new File("/Users/mahmoodselawi/Desktop/com_java/ATM/src/Files","key.ser");

            try {
                // -----------write----------------
                // here we put all key and values in file by use object output stream

                f.createNewFile(); //create file

                // create intermediary between file and ObjectOutputStream
                FileOutputStream f2 = new FileOutputStream(f);

                // the constructor of ObjectOutputStream accepts just output_stream or sub of them

                ObjectOutputStream f3 = new ObjectOutputStream(f2);

                // here fill array in file by use writeObject
                f3.writeObject(signup.tm_for_store_new_data);

                // have writeObject between compiler and memory like mediator(ROM) if we execute this methods
                // all data will be deleted so we enforce save data in file
                f3.flush();



                /// -------read--------
                // create intermediary between file and FileInputStream
                FileInputStream fis = new FileInputStream(f);


                // // the constructor of ObjectOutputStream accepts just input_stream or sub of them
                ObjectInputStream ois = new ObjectInputStream(fis);

                // her we readObject data from file
                Object o = ois.readObject();

                System.out.println("o = " + o);


                // close the read and write
                f3.close();

                ois.close();




                 // checks if input of user contain in file

                if (signup.tm1_OldDatabase_form_signUp.containsValue(sc_passWord))
                {
                    System.out.println(" password is used");
                }
                else if (signup.tm1_OldDatabase_form_signUp.containsValue(sc_userName))
                {
                    System.out.println(" username is used");
                }
                else if (signup.tm1_OldDatabase_form_signUp.containsValue(sc_phone_Number))
                {
                    System.out.println(" phone is used");
                }else {
                    System.out.println("selawe");
                }

                // ends checks



                // her we split the MapThree into kay and value

                Iterator key = signup.tm1_OldDatabase_form_signUp.keySet().iterator();

                Iterator values = signup.tm1_OldDatabase_form_signUp.values().iterator();
                // end
            }

            catch (Exception i) {
                System.out.println(i.getMessage());
            }
         }
    }
}
