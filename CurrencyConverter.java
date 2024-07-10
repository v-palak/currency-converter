import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Currency Selection
        System.out.println("Enter the base currency code (e.g., USD, EUR, GBP):");
        String baseCurrency = scanner.nextLine();

        System.out.println("Enter the target currency code (e.g., USD, EUR, GBP):");
        String targetCurrency = scanner.nextLine();

        // 2. Currency Rates (Simulated for this example)
        double exchangeRate = getExchangeRate(baseCurrency, targetCurrency); // Replace with actual API call
        System.out.println("Exchange rate from " + baseCurrency + " to " + targetCurrency + ": " + exchangeRate);

        // 3. Amount Input
        System.out.println("Enter the amount to convert:");
        double amount = scanner.nextDouble();

        // 4. Currency Conversion
        double convertedAmount = amount * exchangeRate;

        // 5. Display Result
        System.out.println(amount + " " + baseCurrency + " is equal to " + convertedAmount + " " + targetCurrency);
    }

    // Simulated exchange rate retrieval (replace with actual API call)
    private static double getExchangeRate(String baseCurrency, String targetCurrency) {
        if (baseCurrency.equals("USD") && targetCurrency.equals("EUR")) {
            return 0.85; // Example exchange rate
        } else if (baseCurrency.equals("EUR") && targetCurrency.equals("USD")) {
            return 1.18; // Example exchange rate
        } else {
            return 1.0; // Default for the same currency
        }
    }
}