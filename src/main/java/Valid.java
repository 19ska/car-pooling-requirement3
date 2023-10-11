
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;
//import java.util.regex.Matcher;

public class Valid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date currentDate = new Date();

        while (true) {
            System.out.println("Menu: 1) Valid Car Registration Number "
            		+ " \n\t 2) Convert Car Registration Number "
            		+ "  \n\t 3) Valid Driving License \n\t"
            		+ " 4) Exit ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                	System.out.println("CAR REGISTRATION NUMBER");
             		String regNum=scanner.next();
             		boolean result=Pattern.matches("[A-Z]{2}-[0-9]{2}-[A-Z]{2}-[0-9]{4}", regNum);
             		if(result==true) {
             			System.out.println(regNum +" is valid ");
             		}
             		else {
             			System.out.println(regNum +" is NOT valid ");
             		}
                    break;

                case 2:
                	System.out.println("CAR REGISTRATION NUMBER");
             		String regNum1=scanner.next();
             		String convertedRegNumber = regNum1.replaceAll("[^A-Za-z0-9]", "-").toUpperCase();
             		System.out.println(convertedRegNumber);
                    break;

                case 3:
                    System.out.print("Enter driving license issue date (dd-MM-yyyy): ");
                    String expiryDateStr = scanner.nextLine();
                    try {
                        Date expiryDate = dateFormat.parse(expiryDateStr);
                        if (isDrivingLicenseValid(currentDate, expiryDate)) {
                            System.out.println("Valid driving license.");
                        } else {
                            System.out.println("Expired driving license.");
                        }
                    } catch (ParseException e) {
                        System.out.println("Invalid date format. Use dd-MM-yyyy.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
    }

    
    // Check the validity of a driving license
    private static boolean isDrivingLicenseValid(Date currentDate, Date expiryDate) {
        long validityPeriod = 10 * 365 * 24 * 60 * 60 * 1000L; // 10 years in milliseconds
        return (currentDate.getTime() <= (expiryDate.getTime() + validityPeriod));
    }
}


