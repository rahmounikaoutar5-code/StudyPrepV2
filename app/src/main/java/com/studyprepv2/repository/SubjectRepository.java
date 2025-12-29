package com.studyprepv2.repository;

import com.studyprepv2.model.Subject;
import java.util.ArrayList;
import java.util.List;

/**
 * Gère les matières (logique métier)
 */
public class SubjectRepository {

    private final List<Subject> subjects = new ArrayList<>();

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public List<Subject> getAllSubjects() {
        return subjects;
    }

    public int count() {
        return subjects.size();
    }
}
