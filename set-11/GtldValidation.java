import java.util.Scanner;

public class GtldValidation {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Define the list of valid core gTLDs
        String[] validCoreGtld = { ".com", ".net", ".org", ".info" };
        // FIXME: Declare an array named validRestrictedGtld that has the names
        // of the restricted domains, .biz, .name, and .pro
        String inputName;
        String searchName;
        String theGtld;
        boolean isValidDomainName;
        boolean isCoreGtld;
        boolean isRestrictedGtld;
        int periodCounter;
        int periodPosition;
        int i;

        System.out.println("\nEnter the next domain name (-1 to exit): ");
        inputName = scnr.nextLine();

        while (!inputName.equals("-1")) {

            searchName = inputName.toLowerCase();
            theGtld = "";
            isValidDomainName = false;
            isCoreGtld = false;
            isRestrictedGtld = false;

            // Count the number of periods in the domain name
            periodCounter = 0;
            periodPosition = 0;

            for (i = 0; i < searchName.length(); ++i) {
                if (searchName.charAt(i) == '.') {
                    ++periodCounter;
                    periodPosition = i;
                }
            }

            // If there is exactly one period that is not at the start
            // or end of searchName, check if the TLD is a core gTLD or a restricted gTLD
            if ((periodCounter == 1) &&
                    (searchName.charAt(0) != '.') &&
                    (searchName.charAt(searchName.length() - 1) != '.')) {
                isValidDomainName = true;
            }
            if (isValidDomainName) {
                // Extract the Top-level Domain name starting at the period's position. Ex:
                // If searchName = "example.com", the next statement extracts ".com"
                theGtld = searchName.substring(periodPosition);

                i = 0;
                while ((i < validCoreGtld.length) && (!isCoreGtld)) {
                    if (theGtld.equals(validCoreGtld[i])) {
                        isCoreGtld = true;
                    } else {
                        ++i;
                    }
                }

                // FIXME: Check to see if the gTLD is not a core gTLD. If it is not,
                // check to see whether the gTLD is a valid restricted gTLD.
                // If it is, set isRestrictedGtld to true

            }

            System.out.print("\"" + inputName + "\" ");
            if (isValidDomainName) {
                System.out.print("is a valid domain name and ");
                if (isCoreGtld) {
                    System.out.println("has a core gTLD of \"" + theGtld + "\".");
                } else if (isRestrictedGtld) {
                    System.out.println("has a restricted gTLD of \"" + theGtld + "\".");
                } else {
                    System.out.println("does not have a core gTLD."); // FIXME update message
                }
            } else {
                System.out.println("is not a valid domain name.");
            }

            System.out.println("\nEnter the next domain name (-1 to exit): ");
            inputName = scnr.nextLine();
        }
    }
}
