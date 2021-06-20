package com.asoul.supersensitivity;
import javax.sound.midi.*;
public class MidiUtil {

    //节拍器
    private static Sequencer sequencer;
    //序列
    private static Sequence sequence;
    //初始化
    static {
        try {
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequence = new Sequence(Sequence.PPQ,4);

        } catch (MidiUnavailableException|InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }

    public static Sequencer getSequencer() {
        return sequencer;
    }
    public static Sequence getSequence() {
        return sequence;
    }

    public static void start(){
        try {
            sequencer.setSequence(sequence);
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
        sequencer.start();
    }

    /**
     * MIDI事件 / 写音符
     * @param command MIDI命令 144
     * @param chan  通道
     * @param note 音符
     * @param vol   音量/力度
     * @param tick  时值
     * @return
     * @throws InvalidMidiDataException
     */
    public static MidiEvent makeMidiEvent(int command, int chan, Note note, int vol, int tick) throws InvalidMidiDataException {
        ShortMessage message = new ShortMessage();
        message.setMessage(command,chan,note.getValue(),vol);
        MidiEvent event = new MidiEvent(message, tick);
        return event;
    }
}

