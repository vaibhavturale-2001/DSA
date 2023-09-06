package Cognifyz_Tasks.Level_2_Task_3;

import java.io.*;

public class FileEncryptionDecryption {
    // Encryption function
    private static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();
        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                ch = (char) ((ch - base + shift) % 26 + base);
            }
            result.append(ch);
        }
        return result.toString();
    }

    // Decryption function
    private static String decrypt(String text, int shift) {
        return encrypt(text, 26 - shift); // Reversing the shift to decrypt
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter 'E' for encryption or 'D' for decryption: ");
            String choice = br.readLine().toUpperCase();

            if (!choice.equals("E") && !choice.equals("D")) {
                System.out.println("Invalid choice. Please enter 'E' or 'D'.");
                return;
            }

            System.out.print("Enter the file path: ");
            String filePath = br.readLine();

            System.out.print("Enter the shift value (a number between 1 and 25): ");
            int shift = Integer.parseInt(br.readLine());

            if (shift < 1 || shift > 25) {
                System.out.println("Invalid shift value. Please enter a number between 1 and 25.");
                return;
            }

            // Read the file content
            File inputFile = new File(filePath);
            StringBuilder fileContent = new StringBuilder();
            try (BufferedReader fileReader = new BufferedReader(new FileReader(inputFile))) {
                String line;
                while ((line = fileReader.readLine()) != null) {
                    fileContent.append(line).append(System.lineSeparator());
                }
            }

            String result;
            if (choice.equals("E")) {
                result = encrypt(fileContent.toString(), shift);
                System.out.println("File encrypted successfully!");
            } else {
                result = decrypt(fileContent.toString(), shift);
                System.out.println("File decrypted successfully!");
            }

            // Save the result to a new file
            String outputFilePath = choice.equals("E") ? filePath + ".encrypted" : filePath + ".decrypted";
            try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(outputFilePath))) {
                fileWriter.write(result);
            }

            System.out.println("Result saved to: " + outputFilePath);

        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
