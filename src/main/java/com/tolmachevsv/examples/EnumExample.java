package com.tolmachevsv.examples;

public class EnumExample {

    public static void main(String[] args) {
        Button[] buttons = Button.values();
        for (Button button : buttons) {
            System.out.println(button.name());
            System.out.println(button.getButtonName());
        }
    }
}
