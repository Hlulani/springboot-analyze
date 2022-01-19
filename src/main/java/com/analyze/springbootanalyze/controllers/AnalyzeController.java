package com.analyze.springbootanalyze.controllers;

import com.analyze.springbootanalyze.domain.TextAnalyzeRequest;
import com.analyze.springbootanalyze.domain.TextAnalyzeResponse;
import com.analyze.springbootanalyze.helper.TextAnalyzer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class AnalyzeController {

    @Autowired
    private TextAnalyzer analyzer;

//    @CrossOrigin(origins = "http://localhost:8080")
    @PostMapping(value = "/analyze", consumes = "application/json", produces = "application/json")
    public TextAnalyzeResponse getTextToAnalyze(@RequestBody TextAnalyzeRequest request) {
        System.out.println(request.getText());
        System.out.println(request.getAnalyzeType());

        HashMap<Character, Integer> freqCount = analyzer.getFreqCount(request.getText(), request.getAnalyzeType());

        TextAnalyzeResponse response = new TextAnalyzeResponse(request.getText(), request.getAnalyzeType(), freqCount);

        return response;
    }

}