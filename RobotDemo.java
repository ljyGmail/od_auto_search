package com.ffs;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RobotDemo {

    private static final Map<String, Integer> keyCodeMap = new HashMap<>();

    static {
        keyCodeMap.put("0", KeyEvent.VK_0);
        keyCodeMap.put("1", KeyEvent.VK_1);
        keyCodeMap.put("2", KeyEvent.VK_2);
        keyCodeMap.put("3", KeyEvent.VK_3);
        keyCodeMap.put("4", KeyEvent.VK_4);
        keyCodeMap.put("5", KeyEvent.VK_5);
        keyCodeMap.put("6", KeyEvent.VK_6);
        keyCodeMap.put("7", KeyEvent.VK_7);
        keyCodeMap.put("8", KeyEvent.VK_8);
        keyCodeMap.put("9", KeyEvent.VK_9);
    }

    public static void main(String[] args) throws Exception {
        String[] filenameArr = {
                "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14",
                "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28",
        };

        Thread.sleep(3000);

        for (var filename : filenameArr) {
            doCapture(filename);
            Thread.sleep(19000);
        }
    }

    private static void doCapture(String filename) throws Exception {
        // VK_0: 48
        Robot robot = new Robot();

        Random random = new Random();
        robot.mouseMove(800 + random.nextInt(10), 800 + random.nextInt(10));

        String firstDigit = filename.substring(0, 1);
        String secondDigit = filename.substring(1);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_3);
        robot.keyRelease(KeyEvent.VK_3);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.delay(2000);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        robot.delay(35000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_S);
        robot.keyRelease(KeyEvent.VK_S);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.delay(2000);

        robot.keyPress(keyCodeMap.get(firstDigit));
        robot.keyRelease(keyCodeMap.get(firstDigit));
        robot.keyPress(keyCodeMap.get(secondDigit));
        robot.keyRelease(keyCodeMap.get(secondDigit));
        robot.keyPress(KeyEvent.VK_PERIOD);
        robot.keyRelease(KeyEvent.VK_PERIOD);
        robot.keyPress(KeyEvent.VK_P);
        robot.keyRelease(KeyEvent.VK_P);
        robot.keyPress(KeyEvent.VK_N);
        robot.keyRelease(KeyEvent.VK_N);
        robot.keyPress(KeyEvent.VK_G);
        robot.keyRelease(KeyEvent.VK_G);

        robot.delay(2000);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
}