package by.epam.tasks.first.bean;

import java.util.Objects;

public class Directory {
    private String directoryName;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
    }

    public String getDirectoryName() {
        return directoryName;
    }

    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Directory directory = (Directory) o;
        return Objects.equals(directoryName, directory.directoryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(directoryName);
    }

    @Override
    public String toString() {
        return "Directory{" +
                "directoryName='" + directoryName + '\'' +
                '}';
    }
}
