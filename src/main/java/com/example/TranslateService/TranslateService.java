package com.example.TranslateService;

import org.springframework.stereotype.Service;

@Service
public class TranslateService {
    public String translate(String text, String language) {
        if (language.equalsIgnoreCase("es")) {
            return "Texto traducido al español: " + text;
        } else if (language.equalsIgnoreCase("fr")) {
            return "Texte traduit en français: " + text;
        }
        return "Traducción no disponible para el idioma: " + language;
    }
}
