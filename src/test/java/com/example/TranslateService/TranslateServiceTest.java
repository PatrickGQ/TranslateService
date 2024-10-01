package com.example.TranslateService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TranslateServiceTest {

    @Autowired
    private TranslateService translateService;

    @Test
    void testTranslateToSpanish() {
        String text = "Hello World";
        String translation = translateService.translate(text, "es");
        Assertions.assertEquals("Texto traducido al español: Hello World", translation);
    }

    @Test
    void testTranslateToFrench() {
        String text = "Hello World";
        String translation = translateService.translate(text, "fr");
        Assertions.assertEquals("Texte traduit en français: Hello World", translation);
    }

    @Test
    void testUnsupportedLanguage() {
        String text = "Hello World";
        String translation = translateService.translate(text, "de");
        Assertions.assertEquals("Traducción no disponible para el idioma: de", translation);
    }
}