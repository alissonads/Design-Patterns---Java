package Concrete.model;

import java.util.*;
import javax.sound.midi.*;

import Interfaces.*;

public class BeatModel implements BeatModelInterface, MetaEventListener {

	Sequencer sequencer;
	ArrayList beatObservers = new ArrayList();
	ArrayList bpmObservers = new ArrayList();
	int bpm = 90;
	Sequence sequence;
	Track track;
	
	@Override
	public void meta(MetaMessage message) {
		if(message.getType() == 47){
			beatEvent();
			sequencer.start();
			setBPM(getBPM());
		}
	}

	@Override
	public void initialize() {
		setUpMid();
		buildTrackAndStart();
	}

	@Override
	public void on() {
		sequencer.start();
		setBPM(90);
	}

	@Override
	public void off() {
		setBPM(0);
		sequencer.stop();
	}

	@Override
	public void setBPM(int bpm) {
		this.bpm = bpm;
		sequencer.setTempoInBPM(getBPM());
		notifyBPMObservers();
	}

	@Override
	public int getBPM() {
		return bpm;
	}

	void beatEvent(){
		notifyBeatObservers();
	}
	
	@Override
	public void registerObserver(BeatObserver o) {
		beatObservers.add(o);
	}

	@Override
	public void removeObserver(BeatObserver o) {
		beatObservers.remove(o);
	}

	@Override
	public void registerObserver(BPMObserver o) {
		bpmObservers.add(o);
	}

	@Override
	public void removeObserver(BPMObserver o) {
		bpmObservers.remove(o);
	}

	public void notifyBeatObservers(){
		Iterator iterator = beatObservers.iterator();
		
		while(iterator.hasNext()){
			BeatObserver beatObserver = (BeatObserver)iterator.next();
			beatObserver.updateBeat();
		}
	}
	
	public void notifyBPMObservers(){
		Iterator iterator = bpmObservers.iterator();
		
		while(iterator.hasNext()){
			BPMObserver bpmObserver = (BPMObserver)iterator.next();
			bpmObserver.updateBPM();
		}
	}
	
	public void setUpMid(){
		try{
			sequencer = MidiSystem.getSequencer();
			sequencer.open();
			sequencer.addMetaEventListener(this);
			sequence = new Sequence(Sequence.PPQ, 4);
			track = sequence.createTrack();
			sequencer.setTempoInBPM(getBPM());
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void buildTrackAndStart(){
		int []trackList = {35, 0, 46, 0, 35, 0, 46, 0,
						   35, 0, 46, 0, 35, 0, 46, 0,
						   35, 0, 46, 0, 35, 0, 46, 0,
						   35, 0, 46, 0, 35, 0, 46, 0,
						   35, 0, 46, 0, 35, 0, 46, 0,
						   35, 0, 46, 0, 35, 0, 46, 0,
						   35, 0, 46, 0, 35, 0, 46, 0,
						   35, 0, 46, 0, 35, 0, 46, 0,
						   35, 0, 46, 0, 35, 0, 46, 0,
						   35, 0, 46, 0, 35, 0, 46, 0,
						   35, 0, 46, 0, 35, 0, 46, 0,
						   35, 0, 46, 0, 35, 0, 46, 0,
						   35, 0, 46, 0, 35, 0, 46, 0,
						   35, 0, 46, 0, 35, 0, 46, 0,
						   35, 0, 46, 0, 35, 0, 46, 0,
						   35, 0, 46, 0, 35, 0, 46, 0,
						   35, 0, 46, 0, 35, 0, 46, 0,
						   35, 0, 46, 0, 35, 0, 46, 0,
						   35, 0, 46, 0, 35, 0, 46, 0,
						   35, 0, 46, 0, 35, 0, 46, 0};
		
		sequence.deleteTrack(null);
		track = sequence.createTrack();
		makeTracks(trackList);
		track.add(makeEvent(192, 9, 1, 0, 4));
		
		try{
			sequencer.setSequence(sequence);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void makeTracks(int []list){
		for(int i = 0; i < list.length; i++){
			int key = list[i];
			
			if(key != 0){
				track.add(makeEvent(144, 9, key, 100, i));
				track.add(makeEvent(128, 9, key, 100, i+1));
			}
		}
	}
	
	public MidiEvent makeEvent(int comd, int chan, int one, int two, int tick){
		MidiEvent event = null;
		
		try {
			ShortMessage a = new ShortMessage();
			a.setMessage(comd, chan, one, two);
			event = new MidiEvent(a, tick);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return event;
	}
}
