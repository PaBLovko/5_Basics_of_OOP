package by.epam.tasks.first.logic;

import by.epam.tasks.first.bean.TextFile;

public class TextFileLogic {
    public void rename(TextFile textFile, String newNameTextFile){
        textFile.setTextFileName(newNameTextFile);
    }

    public String getTextFileContent(TextFile textFile){
        return new FileLogic().getText(textFile.getFile());
    }

    public void addTextFileContent(TextFile textFile, String text){
        new FileLogic().addText(textFile.getFile(), text);
    }

    public void deleteTextFileContent(TextFile textFile){
        new FileLogic().clearText(textFile.getFile());
    }

    public String getNameTextFile(TextFile textFile){
        return textFile.getTextFileName();
    }
}
