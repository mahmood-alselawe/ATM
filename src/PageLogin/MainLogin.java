package PageLogin;



import PageSignUp.Signup;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;


public class MainLogin   {

    public static void main(String[] args) {

        // her we use to create number Automatic

        AtomicInteger key_generate = new AtomicInteger();

        // we use it to allow to user insert what he want

        Scanner sc = new Scanner(System.in);


        // direct folder
        File f= new File("/Users/mahmoodselawi/Desktop/com_java/ATM/src/Files");

        // create file and extension
        File f1 = new File(f,"user_info.ser");



        // her we use Lambda
        Comparable a1 = (o)->{return 0;};


        // her we use anonymous class instead create regular clas and extend from abstract clas and take object
        // from them
        Login a = new Login() {};

        try{
           // email like that"foobar@gmail.com"

            System.out.print("enter userName : ");

            // save the output from user

            String userName = sc.nextLine();

            // use anonymous class to get MapThree and put the values inside it
            //                    key                   values
            a.Login.put(key_generate.getAndIncrement(), userName);

            // to ensure that the input same the regex
            System.out.println("Login.username_regex_filed(a.userName) = " + Signup.username_regex_filed(userName));

            //Test1vx#$212@gmail.com


            // ========================

             /*
            password
            * At least 8 chars
            * Contains at least one
            * Contains at least one lower alpha char and one upper alpha char
            * Contains at least one char within a set of special chars (@#%$^ etc.)
            * Does not contain space, tab, etc.
              //Test@#$123
            * */

            System.out.print("enter password : ");

            // save the output from user

            String Password = sc.nextLine();

            // use anonymous class to get MapThree and put the values inside it
            //                    key                   values
            a.Login.put(key_generate.getAndIncrement(),Password);

            // to ensure that the input same the regex
            System.out.println("Login.password_regex_filed(a.passWord) = " + Signup.password_regex_filed(Password));

            // =============read and write from file===============

            // complete path
            File fi = new File("/Users/mahmoodselawi/Desktop/com_java/ATM/src/Files","key.ser");

            // create intermediary for ObjectInputStream
            FileInputStream fi1 = new FileInputStream(fi);

            // constructor of ObjectInputStream accept just inputStream or sub of them

            ObjectInputStream fi2 = new ObjectInputStream(fi1);

            // we save what will read a compiler in o type of Object and upcast it to allow to save
            Object o = (Object) fi2.readObject();

            System.out.println(o);

            // to close the file after the program finish
            fi2.close();





        }
        catch (Exception i1){
            System.out.println(i1.toString());
        }



    }



}
