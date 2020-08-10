package case_study_james.controllers;

import case_study_james.commons.FuntionReadAndWrite;
import case_study_james.models.Dictionary;

import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class DirectoryControllers {
    public static void displayMainMenu() {
        System.out.println("---Menu---");
        System.out.println("1.Look up words: " + "\n"
                + "2.Additional definitions for a word: " + "\n"
                + "3.Delete: " + "\n" + "4.Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choose: ");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                lookUpWords();
                break;
            case 2:
                additionalDefinitionsForWord();
                break;
            case 3:
                delete();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Fail ! Please choose again, enter to continue !");
                scanner.nextLine();
                displayMainMenu();
        }
    }

    private static void lookUpWords() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word = scanner.nextLine();
        Map<String, Dictionary> dictionaryMap = FuntionReadAndWrite.readDictionary();
        for (Map.Entry<String, Dictionary> dictionaryEntry : dictionaryMap.entrySet()) {
            if (word.equals(dictionaryEntry.getKey())) {
                System.out.println(dictionaryEntry.getKey() + "" + dictionaryEntry.getValue());
            } else {
                additionalDefinitionsForWord();
            }
        }
        System.out.println("Lookup word complete, enter to countinune !!!");
        scanner.nextLine();
        displayMainMenu();
    }

    private static void additionalDefinitionsForWord() {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Dictionary> listWord = new LinkedList<>();
        Dictionary word = new Dictionary();
        System.out.print("Enter new word: ");
        word.setNameOfWord(scanner.nextLine());
        System.out.print("Enter pronounce: ");
        word.setPronounce(scanner.nextLine());
        System.out.print("Enter type of word: ");
        word.setTypeOfWord(scanner.nextLine());
        System.out.print("Enter similar word: ");
        word.setSimilarWord(scanner.nextLine());
        listWord.add(word);
        FuntionReadAndWrite.writeDictionary(listWord);
        System.out.print("Add word complete, enter to continue !");
        scanner.nextLine();
        displayMainMenu();
    }

    private static void delete() {
        Map<String, Dictionary> dictionaryMap = FuntionReadAndWrite.readDictionary();
        LinkedList<Dictionary> listWord = new LinkedList<>();
        for (Map.Entry<String, Dictionary> dictionaryEntry : dictionaryMap.entrySet()) {
            System.out.println(dictionaryEntry.getValue().toString());
            listWord.add(dictionaryEntry.getValue());
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word you want to delete: ");
        String choose = scanner.nextLine();
        for (int i = 0; i < listWord.size(); i++){
            if (choose.equals(listWord.get(i).getNameOfWord())){
                listWord.remove(i);
                break;
            }
        }
        System.out.println(listWord.toString());
        FuntionReadAndWrite.writeNewDictionary(listWord);
        System.out.print("Delete complete, enter to continue !");
        scanner.nextLine();
        displayMainMenu();
    }


    public static void main(String[] args) {
        displayMainMenu();
    }
}
