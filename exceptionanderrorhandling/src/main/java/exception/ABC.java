package exception;

public class ABC {
    public static void main(String[] args){
        try{
            throw new NullPointerException();
        // System.out.println(args[0]);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("No arguments ");
        }
        // catch(NullPointerException e){
        //     System.out.println("A null pointer have occured ");
        // }
        catch(Exception e){
            System.out.println("An exception occured");
        }
    }
}
