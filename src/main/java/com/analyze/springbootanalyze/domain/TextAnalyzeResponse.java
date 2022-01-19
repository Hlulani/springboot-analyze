package com.analyze.springbootanalyze.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TextAnalyzeResponse {
    @JsonProperty("text")
    private String text;

    @JsonProperty("analyze_type")
    private String analyzeType;

    @JsonProperty("frequency_count")
    private HashMap<Character, Integer> freqCount;

    public TextAnalyzeResponse(String text, String analyzeType, HashMap<Character, Integer> freqCount) {
        this.text = text;
        this.analyzeType = analyzeType;
        this.freqCount = freqCount;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAnalyzeType() {
        return analyzeType;
    }

    public void setAnalyzeType(String analyzeType) {
        this.analyzeType = analyzeType;
    }

    public HashMap<Character, Integer> getFreqCount() {
        return freqCount;
    }

    public void setFreqCount(HashMap<Character, Integer> freqCount) {
        this.freqCount = freqCount;
    }
}
