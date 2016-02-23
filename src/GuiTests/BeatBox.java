package GuiTests;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.Track;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by gavri on 11.02.2016.
 */
 public class BeatBox {
   /* JPanel mainPanel;
    ArrayList<JCheckBox> checkboxList;
    Sequencer sequencer;
    Sequence sequence;
    Track track;
    JFrame theFrame;

    String[] instrumentNames = {"Bass Drum", "Closed Hi-Hat", "Open Hi-Hat", "Hi Bongo", "Maracas", "Whistle", "Low Conga","Cowbell", "Vibraslap","Low-mid Tom", "High Agogo","Opne Hi Conga"};
    int[] instruments = {35,42,46,38,49,39,50,60,70,72,64,56,58,47,67,63};
    public static void main(String[] args){
        new BeatBox().buildGUI();
    }

    public void buildGUI() {
        theFrame = new JFrame();
        theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BorderLayout layout = new BorderLayout();
        JPanel background = new JPanel(layout);
        background.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        checkboxList = new ArrayList<>();
        Box buttonBox = new Box(BoxLayout.Y_AXIS);

        JButton start = new JButton("Start");
        start.addActionListener(new MyStartListener());
        buttonBox.add(start);

        JButton stop = new JButton("Stop");
        stop.addActionListener(new MyStopListener());
        buttonBox.add(stop);

        JButton upTempo = new JButton("Tempo up");
        upTempo.addActionListener(new MyUpTempoListener());
        buttonBox.add(upTempo);

        JButton downTempo = new JButton("Tempo down");
        downTempo.addActionListener(new MyDownTempoListener());
        buttonBox.add(downTempo);


        Box nameBox = new Box(BoxLayout.Y_AXIS);
        for (int i = 0; i < instrumentNames.length; i++){
            nameBox.add(new Label(instrumentNames[i]));
        }


        background.add(BorderLayout.EAST,buttonBox);
        background.add(BorderLayout.WEST, nameBox);

        theFrame.getContentPane().add(background);
        GridLayout grid = new GridLayout();
        grid.setVgap(1);
        grid.setHgap(2);
        mainPanel = new JPanel(grid);
        background.add(BorderLayout.CENTER,mainPanel);

        for (int i = 0; i < 256; i++){
            JCheckBox c = new JCheckBox();
            c.setSelected(false);
            checkboxList.add(c);
            mainPanel.add(c);
        }

        setUpMidi();

        theFrame.setBounds(50,50,300,300);
        theFrame.pack();
        theFrame.setVisible(true);

    }

   public void setUpMidi() {
       try{
           sequencer = MidiSystem.getSequencer();
           sequencer.open();
           sequence = new Sequence(Sequence.PPQ,4);
           track = sequence.createTrack();
           sequencer.setTempoInBPM(120);
       } catch (Exception e){
           e.printStackTrace();
       }
    }

    public void buildTrackAndStart(){
        int[] trackList = null;
        sequence.deleteTrack(track);
        track = sequence.createTrack();

            for (int i = 0; i < 16; i++){
                trackList = new int[16];

                int key = instruments[i];

                for (int j = 0; j < 16; j++){
                    JCheckBox jc = (JCheckBox) checkboxList.get(j+(16*i));

                }

            }
    }
*/
}
