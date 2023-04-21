/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

      public static void main(String[] args) {
     	Library lib = new Library();
     	System.out.println(lib.someLibraryMethod());
         useASet();
         useAMap();
     }

        // 1. Quick Lookups
        // 2. No Duplicates
        // 3. Counting instances of something


    // Set
    // Tell me students who have answered a question (without duplicates)
    public static void useASet(){
        ArrayList<String> studentsWhoAnswered = new ArrayList<>();
        studentsWhoAnswered.add("John");
        studentsWhoAnswered.add("Steve");
        studentsWhoAnswered.add("Dawn");
        studentsWhoAnswered.add("John");

        // HashSet
        HashSet<String> setOfStudentAnswered = new HashSet<>();
        setOfStudentAnswered.add("Brookelynn");
        setOfStudentAnswered.addAll(studentsWhoAnswered);
    }


    // Map
    // Family Feud (how many times a person has answered a question)
    public static void useAMap(){
        HashMap<String, Integer> personAnsweredQuestion = new HashMap<>();
        personAnsweredQuestion.put("John", 1);
        personAnsweredQuestion.put("Steve", 2);
        personAnsweredQuestion.put("Dawn", 3);
        personAnsweredQuestion.put("Dave", 4);
        personAnsweredQuestion.put("Brookelynn", 5);

        int questions = personAnsweredQuestion.get("Steve");
        personAnsweredQuestion.put("Steve", questions + 5);

        // Get all the keys
        for(String key : personAnsweredQuestion.keySet()){
            System.out.println(key);
        }

        // Get all the values
        for(Integer value : personAnsweredQuestion.values()){
            System.out.println(value);
        }

        // Get all the keys and values
        for(String key : personAnsweredQuestion.keySet()){
            System.out.println(key + " " + personAnsweredQuestion.get(key));
        }
    }
}
