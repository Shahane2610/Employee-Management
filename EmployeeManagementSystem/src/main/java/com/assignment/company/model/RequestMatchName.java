package com.assignment.company.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestMatchName {
    @JsonProperty("name1")
    private String name1;

    @JsonProperty("name2")
    private String name2;
}
