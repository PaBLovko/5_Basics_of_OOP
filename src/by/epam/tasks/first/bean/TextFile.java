package by.epam.tasks.first.bean;

import java.util.Objects;

public class TextFile {
    private Directory directory;
    private File file;
    private String textFileName;

    public TextFile(Directory directory, File file, String textFileName) {
        this.directory = directory;
        this.file = file;
        this.textFileName = textFileName;
    }

    public Directory getDirectory() {
        return directory;
    }

    public void setDirectory(Directory directory) {
        this.directory = directory;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getTextFileName() {
        return textFileName;
    }

    public void setTextFileName(String textFileName) {
        this.textFileName = textFileName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TextFile textFile = (TextFile) o;
        return Objects.equals(directory, textFile.directory) &&
                Objects.equals(file, textFile.file) &&
                Objects.equals(textFileName, textFile.textFileName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(directory, file, textFileName);
    }

    @Override
    public String toString() {
        return "TextFile{" +
                "directory=" + directory +
                ", file=" + file +
                ", textFileName='" + textFileName + '\'' +
                '}';
    }
}
