package com.example.examination.Manager;

import com.example.examination.Model.Tests;
import com.example.examination.Repository.TestRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class TestManager {

        @Autowired
        private TestRepository testRepository;

        public Tests createTest(Tests test)  {
            return testRepository.save(test);
        }

     public Tests updateTest(Tests test) {
        // Check if the test exists by its id
        Optional<Tests> existingTestOptional = testRepository.findByTestId(test.getId());

        if (existingTestOptional.isPresent()) {
            // Get the existing test object
            Tests existingTest = existingTestOptional.get();

            // Update the fields you want to change
            existingTest.setName(test.getName());
            existingTest.setLevel(test.getLevel());
            // Add other fields as necessary

            // Save the updated test back to the database
            return testRepository.save(existingTest);
        } else {
            // Handle the case where the test does not exist
            throw new EntityNotFoundException("Test with ID " + test.getId() + " not found.");
        }
    }
}
