package by.epam.tasks.first.runner;

/*
    Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
    вывести на консоль содержимое, дополнить, удалить.
 */

import by.epam.tasks.first.bean.Directory;
import by.epam.tasks.first.bean.File;
import by.epam.tasks.first.bean.TextFile;
import by.epam.tasks.first.logic.TextFileLogic;

public class Runner {
    public static void main(String[] args) {
        TextFile textFile = new TextFile(
                new Directory("task01"), new File("learn java"),"Task01");
        TextFileLogic textFileLogic = new TextFileLogic();
        System.out.println(textFileLogic.getTextFileContent(textFile));
        textFileLogic.addTextFileContent(textFile, "end learning");
        System.out.println(textFileLogic.getTextFileContent(textFile));
        textFileLogic.deleteTextFileContent(textFile);
        System.out.println(textFileLogic.getTextFileContent(textFile)+"<-clear");
        System.out.println(textFileLogic.getNameTextFile(textFile));
        textFileLogic.rename(textFile, "Pablo");
        System.out.println(textFileLogic.getNameTextFile(textFile));
    }
}