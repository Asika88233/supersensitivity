package com.asoul.supersensitivity;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.Track;

public class PianoRoll {
    public PianoRoll(int bpm,int loopCount) {
        //设置BPM
        MidiUtil.getSequencer().setTempoInBPM(bpm);
        //循环次数 -1无限循环 0循环一次
        MidiUtil.getSequencer().setLoopCount(loopCount);
    }
    //获得track
    private Track track = MidiUtil.getSequence().createTrack();

    /**
     * 写音符
     * @param notes 音符序列
     * @param chan  频道
     * @param vol   音量/力度
     * @param ticks 时值
     * @throws InvalidMidiDataException
     */

    public void setNote(Note[] notes,int chan,int vol,int[] ticks) throws InvalidMidiDataException {
        int tickTime=0;
        for (int i=0;i<notes.length;i++){
            tickTime+=ticks[i];
            track.add(MidiUtil.makeMidiEvent(144,chan,notes[i],vol,tickTime));
        }
    }
    public void run(){
        MidiUtil.start();
        System.out.println("playing...");
    }
}
