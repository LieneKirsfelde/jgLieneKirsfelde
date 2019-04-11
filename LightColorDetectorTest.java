package lv.javaguru.lesson4;

public class LightColorDetectorTest {

    public static void main(String[] args) {

        LightColorDetector lightColorDetector = new LightColorDetector();

        String result = lightColorDetector.detect(500);

        System.out.println("Result: " + result);

        LightColorDetectorTest test = new LightColorDetectorTest();

        test.shouldDetectVioletLight();
        test.shouldDetectGreenLight();
        test.shouldDetectYellowLight();
        test.shouldDetectOrangeLight();
        test.shouldDetectRedLight();
    }

    public void shouldDetectVioletLight() {

        LightColorDetector detector = new LightColorDetector();

        String result = detector.detect(400);

        compareResult(result.equals("Violet light"), "shouldDetectVioletLight");
    }

    public void shouldDetectBlueLight() {

        LightColorDetector detector = new LightColorDetector();

        String result = detector.detect(470);

        compareResult(result.equals("Blue light"), "shouldDetectBlueLight");
    }

    public void shouldDetectGreenLight() {

        LightColorDetector detector = new LightColorDetector();

        String result = detector.detect(500);

        compareResult(result.equals("Green light"), "shouldDetectGreenLight");
    }

    public void shouldDetectYellowLight() {

        LightColorDetector detector = new LightColorDetector();

        String result = detector.detect(580);

        compareResult(result.equals("Yellow light"), "shouldDetectYellowLight");
    }


    public void shouldDetectOrangeLight() {

        LightColorDetector detector = new LightColorDetector();

        String result = detector.detect(600);

        compareResult(result.equals("Orange light"), "shouldDetectOrangeLight");
    }

    public void shouldDetectRedLight() {

        LightColorDetector detector = new LightColorDetector();

        String result = detector.detect(700);

        compareResult(result.equals("Red light"), "shouldDetectRedLight");
    }

    void compareResult(boolean result, String testName) {

        if (result) {

            System.out.println(testName + " OK");

        } else {

            System.out.println(testName + " Fail");

        }
    }
}