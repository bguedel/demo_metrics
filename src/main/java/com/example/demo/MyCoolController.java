package com.example.demo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
@RequiredArgsConstructor
@Slf4j
public class MyCoolController {

    private final MyCoolRepository repository;

    @GetMapping("/v1/hello")
    public int hello(final String name) {
        int id = repository.findByNameIgnoreCase(name).orElseThrow().getId();
        log.info("found {}", id);
        return id;
    }
}
