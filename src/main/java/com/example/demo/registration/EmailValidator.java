package com.example.demo.registration;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.function.Predicate;

@Service
@AllArgsConstructor
public class EmailValidator implements Predicate {
    @Override
    public boolean test(Object o) {
        return true;
    }
}
