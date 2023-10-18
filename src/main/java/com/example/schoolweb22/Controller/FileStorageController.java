package com.example.schoolweb22.Controller;

import com.example.schoolweb22.entity.FileStorage;
import com.example.schoolweb22.service.FileStorageService;
import org.springframework. beans.factory.annotation.Value;
import org.springframework.core.io.FileUrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.URLEncoder;

@RestController
public class FileStorageController {


    final FileStorageService fileStorageService;

    @Value("${upload.folder}")
    private String uploadFolders;

    public FileStorageController(FileStorageService fileStorageService) {
        this.fileStorageService = fileStorageService;
    }


    @PostMapping("/upload")
    public ResponseEntity upload(@RequestParam("file")MultipartFile multipartFile){
        fileStorageService.save(multipartFile);
       return ResponseEntity.ok(multipartFile.getOriginalFilename()+ " file saqlandi");

    }

    @GetMapping("/preview/{photoname}")
    public ResponseEntity previewFile(@PathVariable String phonename, Model model) throws IOException {
        FileStorage fileStorage=fileStorageService.findByPhotoName(phonename);
        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "inline; fileName=\"" + URLEncoder.encode(fileStorage.getName()))
                .contentType(MediaType.parseMediaType(fileStorage.getContentType()))
                .contentLength(fileStorage.getFileSize())
                .body(new FileUrlResource(String.format("%s/%s", uploadFolders ,fileStorage.getUploadPath())));

    }
    @GetMapping("/download/{photoname}")
    public ResponseEntity downloadFile(@PathVariable String photoname, Model model) throws IOException {
        FileStorage fileStorage=fileStorageService.findByPhotoName(photoname);
        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment; fileName=\"" + URLEncoder.encode(fileStorage.getName()))
                .contentType(MediaType.parseMediaType(fileStorage.getContentType()))
                .contentLength(fileStorage.getFileSize())
                .body(new FileUrlResource(String.format("%s/%s", uploadFolders ,fileStorage.getUploadPath())));

    }
    @DeleteMapping("/delete/{photoname}")
    public ResponseEntity delete(@PathVariable String photoname){
        fileStorageService.delete(photoname);
        return ResponseEntity.ok("File o'chirildi");
    }

}
