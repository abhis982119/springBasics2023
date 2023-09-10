package com.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@NoArgsConstructor
@AllArgsConstructor
@org.springframework.web.context.annotation.SessionScope
public class SessionScopeObject {

    private String defaultText = "This is default text of session scope objecty";
}
