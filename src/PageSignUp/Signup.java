package PageSignUp;

import java.io.Serializable;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Signup implements Serializable {

    /// share common thing



//    public String name;
//    private String last_name;
//    private  String userName;
//    private  String passWord;
//    private  String phoneNumber;
//    private  Boolean gender;



    // this share map  use to save all object

    TreeMap<Integer , String> tm_for_store_new_data = new TreeMap<Integer,String>();

    // this map use to clone the input users
    TreeMap database_form_signUp = (TreeMap) tm_for_store_new_data.clone();

    //  this map use to compare between old  data and new data
    TreeMap<Integer , String> tm1_OldDatabase_form_signUp = new TreeMap<Integer, String>(database_form_signUp);

    // this function allow to you clone old data that save in map

    public void treemap(Object a)
    {
       a = tm1_OldDatabase_form_signUp.clone();

    }








    // this check the name regex
    public  static  boolean name_regex_filed(String pname1)
    {

        String nameRegex = "^[A-Za-z]+\\\\s[A-Za-z]+$";

        // Compile the regular expression
        Pattern pattern = Pattern.compile(nameRegex);

        // Create a matcher object
        Matcher matcher = pattern.matcher(pname1);

        // Return true if the name matches the pattern
        return matcher.matches();

    }

    // this check the username regex

    public static  boolean username_regex_filed(String puserName)
    {
      String username_regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";

      Pattern pattern = Pattern.compile(username_regex);

      Matcher matcher = pattern.matcher(puserName);

      return  matcher.matches();
    }

    // this check the password regex

    public static boolean password_regex_filed(String ppassWord)
    {
        String passWord = "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$";

        Pattern pattern = Pattern.compile(passWord);

        Matcher matcher = pattern.matcher(ppassWord);

        return matcher.matches();
    }








}
