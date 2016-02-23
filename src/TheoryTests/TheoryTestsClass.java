package TheoryTests;

import javax.sound.midi.*;
import javax.swing.*;

/**
 * Created by gavri on 26.01.2016.
 */
public class TheoryTestsClass {
    public static void main (String[] args){

        System.out.println("why do i need arguments in main class?");
        float f = 3.14f;
        int x = (int) f;
        System.out.println(x);
        play();

    }

    public static void play(){
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();
            Sequence sequence = new Sequence(Sequence.PPQ, 4);
            Track track = sequence.createTrack();

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, 44, 100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            a.setMessage(128, 1, 44, 100);
            MidiEvent noteOff = new MidiEvent(b, 16);
            track.add(noteOff);

            ShortMessage a2 = new ShortMessage();
            a.setMessage(144, 9, 46, 100);
            MidiEvent noteOn2 = new MidiEvent(a2, 1);
            track.add(noteOn2);

            ShortMessage b2 = new ShortMessage();
            a.setMessage(128, 9, 46, 100);
            MidiEvent noteOff2 = new MidiEvent(b2, 16);
            track.add(noteOff2);

            player.setSequence(sequence);

            player.start();
            Thread.sleep(20000);
            player.close();



        } catch (Exception ex){
            ex.printStackTrace();
        } finally {
            System.out.println("I'll do it anyway!!");

        }
    }
}
