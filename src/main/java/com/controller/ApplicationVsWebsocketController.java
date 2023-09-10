package com.controller;


import com.model.ApplicationScopedBean;
import com.model.WebSocketScopedBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApplicationVsWebsocketController {

    private final ApplicationScopedBean applicationScopedBean ;
    private final WebSocketScopedBean webSocketScopedBean  ;

    public ApplicationVsWebsocketController(
            ApplicationScopedBean applicationScopedBean,
            WebSocketScopedBean webSocketScopedBean) {
        this.applicationScopedBean = applicationScopedBean;
        this.webSocketScopedBean = webSocketScopedBean;
    }

    @GetMapping("/application-scope")
    @ResponseBody
    public String getApplicationScopeData() {
        return "Application Scope Data: " + applicationScopedBean.getData();
    }

  /*  @MessageMapping("/websocket-scope")
    @SendTo("/topic/messages")
    public String getWebSocketScopeData() {
        return "WebSocket Scope Data: " + webSocketScopedBean.getData();
    }*/
}
