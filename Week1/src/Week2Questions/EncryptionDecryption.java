//package Week2Questions;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.Scanner;
//
//public class EncryptionDecryption {
//
//    public static void main(String[] args) throws IOException {
//        //you are given a message and a key
//        //you need to encrypt the message using the key and only that key can decrypt the message
//        //eg: kanishk is my name (kanishk)
//        //    kanishk$ka$ni$shkk
//        //
//
//        File messageFile = new File("/Users/kunalgupta/Desktop/DSA/src/message.txt");
//        File encodedMessageFile = new File("/Users/kunalgupta/Desktop/DSA/src/emessage.txt");
//        Scanner scanner = new Scanner(messageFile);
//
//
//        FileWriter writer = new FileWriter(encodedMessageFile, true);
//        String line = "";
//
//        while(scanner.hasNext()) {
//            line = scanner.nextLine();
//            System.out.println("before encryption");
//            System.out.println(line);
//            String encryptedLine = encrypt(line);
//            System.out.println("after encryption");
//            System.out.println(encryptedLine);
//            writer.write(encryptedLine);
//        }
//    }
//
//    private static String encrypt(String line) {
//        return "";
//    }
//
//    private static String decrypt(String line) {
//        return null;
//    }
//    }
//}
