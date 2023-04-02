package com.springdi.beans;

import lombok.*;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CollectionInjectionClass {
    private List<String> listOfString;
    private Map<String, String> mapOfString;
    private Properties properties;
    private Set setOfStrings;
}
