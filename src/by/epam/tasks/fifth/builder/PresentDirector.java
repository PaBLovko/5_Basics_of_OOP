package by.epam.tasks.fifth.builder;


import by.epam.tasks.fifth.entity.Present;

public class PresentDirector {
    private PresentBuilder presentBuilder;

    public void setPresentBuilder(PresentBuilder presentBuilder) {
        this.presentBuilder = presentBuilder;
    }

    public Present buildPresent() {
        presentBuilder.createPresent();
        presentBuilder.buildName();
        presentBuilder.buildPrice();
        presentBuilder.buildWrap();
        presentBuilder.buildProducts();
        return presentBuilder.getPresent();
    }

    public PresentBuilder getPresentBuilder() {
        return presentBuilder;
    }
}
