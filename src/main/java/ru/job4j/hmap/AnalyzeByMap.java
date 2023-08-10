package ru.job4j.hmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        int sum = 0;
        int count = 0;
        for (Pupil pupil : pupils) {
            count += pupil.subjects().size();
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
            }
        }
        return (double) sum / count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int sum = 0;
            double count = pupil.subjects().size();
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
            }
            labels.add(new Label(pupil.name(), sum / count));
        }
        return labels;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        double count = pupils.get(0).subjects().size();
        Map<String, Integer> map = new LinkedHashMap<>();
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                int sum = map.getOrDefault(subject.name(), 0) + subject.score();
                map.put(subject.name(), sum);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            labels.add(new Label(entry.getKey(), entry.getValue() / count));
        }
        return labels;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        String name = "";
        int max = 0;
        for (Pupil pupil : pupils) {
            int sum = 0;
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
            }
            if (sum > max) {
                name = pupil.name();
                max = sum;
            }
        }
        return new Label(name, max);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> map = new HashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                int sum = map.getOrDefault(subject.name(), 0) + subject.score();
                map.put(subject.name(), sum);
            }
        }
        int max = 0;
        String name = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (max < entry.getValue()) {
                max = entry.getValue();
                name = entry.getKey();
            }
        }
        return new Label(name, max);
    }
}
