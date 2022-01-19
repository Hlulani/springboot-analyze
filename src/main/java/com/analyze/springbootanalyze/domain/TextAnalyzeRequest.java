package com.analyze.springbootanalyze.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TextAnalyzeRequest {

    @JsonProperty("text")
    private String text;

    @JsonProperty("analyze_type")
    private String analyzeType;

    public TextAnalyzeRequest(String text, String type) {
        this.text = text;
        this.analyzeType = type;
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
}
