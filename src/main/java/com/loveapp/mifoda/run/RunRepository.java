package com.loveapp.mifoda.run;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;
@Repository
public class RunRepository {
    private List<Run> runs = new ArrayList<>();
    
    List<Run> findAll() {
        return runs;
    }
    Optional<Run> findById(int id) {
        return runs.stream()
                .filter(run -> run.getId() == id)
                .findFirst();
    }
    Run findByTittle(String title) {
        return runs.stream()
                .filter(run -> run.getTitle().equals(title))
                .findAny()
                .orElse(null);
    }

    void create(Run run) {
        runs.add(run);
    }

    void update(Run run, int id) {
        Optional<Run> existingRun = findById(id);
        if(existingRun.isPresent()) {
            runs.set(runs.indexOf(existingRun.get()), run);
        }
    }

    // Remove the run with the given id from the list of runs.
    // This operation will not throw an exception if the run is not found.
    void delete(int id) {
        runs.removeIf(run -> run.getId() == id);
        // If the run is not found, nothing happens.
    }

    @PostConstruct
    private void init() {
        Run run = new Run(1, "Run 1", LocalDateTime.now(), LocalDateTime.now().plusHours(1), 10, Location.OUTDOUR);
        runs.add(run);
        Run run_2 = new Run(2, "Run 2", LocalDateTime.now(), LocalDateTime.now().plusHours(1), 10, Location.OUTDOUR);
        runs.add(run_2);
        Run run_3 = new Run(3, "mifoda", LocalDateTime.now(), LocalDateTime.now().plusHours(1), 10, Location.OUTDOUR);
        runs.add(run_3);
    }
}
