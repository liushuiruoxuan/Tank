package com.example.demo1.tk;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TankFrame tankFrame = new TankFrame();
        while (true){
            Thread.sleep(50);
            tankFrame.repaint();
        }
    }
}
