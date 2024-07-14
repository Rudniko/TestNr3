package pl.kurs.zad1i2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class Runner {
    public static void main(String[] args) {

        List<File> myJavaFiles = new ArrayList<>();

        JavaFilesService.findJavaFiles(new File("C:\\Users\\Rudni\\IdeaProjects"), myJavaFiles);

        // 1
        File largestJavaFile = JavaFilesService.findLargestFile(myJavaFiles);

        System.out.println(largestJavaFile + " - " + largestJavaFile.length() + " bytes");
        //C:\Users\Rudni\IdeaProjects\Training\src\main\java\pl\kurs\temat26\MethodsRunner.java - 6632 bytes


        // 2
        JavaFilesService.printWeekSummary(myJavaFiles);
//        MONDAY -> 157
//        TUESDAY -> 120
//        WEDNESDAY -> 75
//        THURSDAY -> 82
//        FRIDAY -> 37
//        SATURDAY -> 41
//        SUNDAY -> 42

    }
}
