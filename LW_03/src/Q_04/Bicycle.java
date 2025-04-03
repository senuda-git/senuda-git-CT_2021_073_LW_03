package Q_04;

public class Bicycle {
    public static void main(String[] args) {

        //input data
        Owner U01 = new Owner("Sammy" , "712345678" , "BMX");
        Owner U02 = new Owner("Ann" , "0779876543" , "Singer");

        //output data
        System.out.println("\nOwner Name is : " + U01.getOwnerName());
        System.out.println("Owner Phone is : " + U01.getPhoneNo());
        System.out.println("Bicycle Model is : " + U01.getModel());

        System.out.println("\nOwner Name is : " + U02.getOwnerName());
        System.out.println("Owner Phone is : " + U02.getPhoneNo());
        System.out.println("Bicycle Model is : " + U02.getModel());

    }
}
