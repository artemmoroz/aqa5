package by.issoft.files;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class User {

    String name;
    int age;
    boolean isMale;
    List<String> children;
    @JsonProperty("xxxxxXDASDFASF")
    Wife wife;
    @JsonIgnore
    Math m;


}
