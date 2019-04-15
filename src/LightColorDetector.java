public class LightColorDetector {

    public String detect(int waveLenght) { //Typo - length

        //par daudz ()
        if ((waveLenght > 380) && (waveLenght < 449)) {
            return "Violet light";

        }
        if ((waveLenght > 450) && (waveLenght < 494)) {
            return "Blue light";

        }
        if ((waveLenght > 495) && (waveLenght < 569)) {
            return "Green light";

        }
        if ((waveLenght > 570) && (waveLenght < 589)) {
            return "Yellow light";

        }
        if ((waveLenght > 590) && (waveLenght < 619)) {
            return "Orange light";

        }
        if ((waveLenght > 620) && (waveLenght < 750)) {
            return "Red light";

        } else //trūkst {}
            return "Light not visible";
    }
}