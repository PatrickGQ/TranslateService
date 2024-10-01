package com.example.TranslateService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/translate")
public class TranslateController {

    @Autowired
    private TranslateService translateService;

    @PostMapping
    public ResponseEntity<String> translateText(@RequestParam String text, @RequestParam String language) {
        String translatedText = translateService.translate(text, language);
        return ResponseEntity.ok(translatedText);
    }
}
