package com.tolmachevsv.examples;

public enum Button {
    OK("Button ok"),
    CANCEL("Button cancel"),
    APPLY("Button apply");

    private String buttonName;

    Button(String buttonName) {
        this.buttonName = buttonName;
    }

    public String getButtonName() {
        return buttonName;
    }
}
