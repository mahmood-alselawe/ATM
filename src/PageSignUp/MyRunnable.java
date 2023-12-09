package PageSignUp;



// her we crate class MyRunnable to make ability tm main class to extends
public class MyRunnable implements Runnable{
    @Override
    public void run() {

        try {
            Thread.sleep(30000);
        }
        catch (Exception i)
        {
            System.out.println("i = " + i.toString());
        }
    }
}
