package by.epam.tasks.fifth.builder;

import by.epam.tasks.fifth.entity.Present;

abstract class PresentBuilder {
    Present present;

    void createPresent() {
        present = new Present();
    }

    abstract void buildName();
    abstract void buildPrice();
    abstract void buildWrap();
    abstract void buildProducts();

    Present getPresent() {
        return present;
    }
}
