package com.codeover.documentmind.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/chat")
@Tag(name = "Chat Management", description = "All Endpoints for handling chat messages")
public class ChatController {

    @PostMapping
    @Operation(
        summary = "Send a chat message",
        description = "This endpoint is used to send a chat message to the system."
    )
    public ResponseEntity<String> chat(@RequestParam("message") String message) {
        // Logic to handle chat messages
        return ResponseEntity.ok("Chat message received: " + message);
    }
}
