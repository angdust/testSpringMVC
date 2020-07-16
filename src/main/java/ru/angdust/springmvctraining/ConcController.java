package ru.angdust.springmvctraining;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConcController {
    @GetMapping("/make-a-conclusion")
    public String makeConclusion() {
        return "beginning";
    }
    @GetMapping("/conclusion")
    public String viewConclusion() {
        return "conclusion";
    }
}
