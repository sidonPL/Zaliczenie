import java.io.*;
import java.util.*;

class Main {
    private static void ZnajdzPodobne(String[] arr1, String[] arr2)
    {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {

                    // dodanie podstawowych elementów
                    set.add(arr1[i]);
                    break;
                }
            }
        }
        for (String i : set)
        {
            System.out.print(i + " ");
        }
    }

    // main method
    public static void main(String[] args)
    {

        // Tworzenie 1 tablicy
        String[] arr1 = { "Polak", "Adam", "Litwa", "Polska", "Adam" };

        // Tworzenie 2 tablicy
        String[] arr2 = { "Polak", "Szymon", "Litwa" };

        // Drukowanie Array 1
        System.out.println("Tablica 1: " + Arrays.toString(arr1));

        // Drukowanie Array 2
        System.out.println("Tablica 2: " + Arrays.toString(arr2));

        System.out.print("Podobne elementy: ");

        ZnajdzPodobne(arr1, arr2);
    }
}