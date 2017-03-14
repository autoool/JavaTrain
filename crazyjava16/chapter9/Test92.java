package chapter9;

import java.util.Arrays;

import javax.sound.midi.Sequence;

public class Test92 {

	int capacity = 1;
	
	public static void main(String[] args) {
		Test92 test92 = new Test92();
		test92.capacityC(12);
	}
	
	private void capacityC(int initSize) {
		while(capacity<initSize){
			capacity <<=1;
			System.out.println(capacity);
		}
	}
}
