package com.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.context.annotation.SessionScope;


@Setter
@NoArgsConstructor
@AllArgsConstructor
@SessionScope
public class SessionScopeObject {

    private String defaultText = "This is default text of session scope objecty";
}
