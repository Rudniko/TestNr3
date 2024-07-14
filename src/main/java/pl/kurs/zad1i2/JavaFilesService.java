package pl.kurs.zad1i2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaFilesService {

    public static void findJavaFiles(File directory, List<File> list) {
        if (!directory.isDirectory()) {
            throw new RuntimeException("Podana scieżka nie jest folderem!");
        }

        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                findJavaFiles(file, list);
            } else if (file.getName().endsWith(".java")) {
                list.add(file);
            }
        }
    }

    public static File findLargestFile(List<File> files) {
        if (files.isEmpty()) {
            throw new RuntimeException("Podana lista plików jest pusta!");
        }

        return files.stream()
                .filter(Objects::nonNull)
                .max(Comparator.comparing(File::length))
                .orElseThrow();
    }

    public static void printWeekSummary(List<File> files) {
        if (files.isEmpty()) {
            throw new RuntimeException("Podana lista plików jest pusta!");
        }

        files.stream()
                .filter(Objects::nonNull)
                .map(JavaFilesService::getDayOfWeekFromFile)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(x -> System.out.println(x.getKey() + " -> " + x.getValue()));
    }

    private static DayOfWeek getDayOfWeekFromFile(File file) {
        DayOfWeek dayOfWeek = null;
        try {
            BasicFileAttributes bfa = Files.readAttributes(file.toPath(), BasicFileAttributes.class);
            FileTime creationTime = bfa.creationTime();
            LocalDateTime ldt = LocalDateTime.ofInstant(creationTime.toInstant(), ZoneId.systemDefault());
            dayOfWeek = ldt.getDayOfWeek();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return dayOfWeek;

    }

}
