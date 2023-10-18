package com.example.schoolweb22.repository;

import com.example.schoolweb22.entity.FileStorage;
import com.example.schoolweb22.enums.FileStorageStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FileStorageRepository extends JpaRepository<FileStorage, Long> {
    FileStorage findByPhotoName(String photoname);

    List<FileStorage> findAllByFileStorageStatus(FileStorageStatus status);
}
