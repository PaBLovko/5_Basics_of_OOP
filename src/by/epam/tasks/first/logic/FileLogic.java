package by.epam.tasks.first.logic;

import by.epam.tasks.first.bean.File;

public class FileLogic {

    public void clearText(File file) {
        file.setText("");
    }

    public void addText(File file, String text) {
        file.setText(file.getText().concat(" "+text));
    }

    public String getText(File file) {
        return file.getText();
    }
}
