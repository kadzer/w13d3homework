package com.example.codeclan.folders.components;

import com.example.codeclan.folders.models.File;
import com.example.codeclan.folders.models.Folder;
import com.example.codeclan.folders.models.User;
import com.example.codeclan.folders.repositories.FileRepository;
import com.example.codeclan.folders.repositories.FolderRepository;
import com.example.codeclan.folders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(ApplicationArguments args) {
       User user = new User ("Kas");
       userRepository.save(user);

       Folder folder = new Folder("Home");
       folderRepository.save(folder);

       Folder folder1 = new Folder("MyDocuments");
       folderRepository.save(folder1);

       File file = new File("My CV", ".docx", 12000, folder1);
       File file1 = new File("install", ".log", 12345, folder);
       fileRepository.save(file);
       fileRepository.save(file1);


    }
}
