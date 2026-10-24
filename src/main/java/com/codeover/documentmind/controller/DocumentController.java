package com.codeover.documentmind.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/v1/documents")
@Tag(name = "Document Management", description = "All Endpoints for uploading, managing, and querying documents")
public class DocumentController {


@PostMapping
@Operation (
    summary = "Upload and index a document(PDF, TEXT, DOCX, etc.)",
    description = "This is used to upload and index a document. The document will be processed and stored for future queries.")
public ResponseEntity<String> uploadDocument(@RequestParam("file") MultipartFile file) {
    // Logic to handle document upload
    return ResponseEntity.ok("Document uploaded successfully");

}
}
