package chapter9;

import java.util.Arrays;

import javax.sound.midi.Sequence;

public class SequenceList<T> {
	
	private final int DEFAULT_SIZE = 16;
	//保存数组的长度
	private int capacity;
	private Object[] elementData;
	//保存顺序表中元素的当前个数
	private int size = 0;
	
	public SequenceList() {
		capacity = DEFAULT_SIZE;
		elementData = new Object[capacity];
	}
	
	public	SequenceList(T element){
		this();
		elementData[0] = element;
		size++;
	}
	
	public SequenceList(T element,int initSize){
		capacity = 1;
		while(capacity<initSize){
			capacity <<= 1;
		}
		elementData = new Object[capacity];
		elementData[0] = element;
		size++;
	}
	
	public int length() {
		return size;
	}
	
	@SuppressWarnings("unchecked")
	public T get(int i) {
		if (i<0||i>size-1) {
			throw new IndexOutOfBoundsException("线性表索引越界");
		}
		return (T)elementData[i];
	}
	
	public int locate(T element) {
		for (int i = 0; i < size; i++) {
			if (elementData[i].equals(element)) {
				return i;
			}
		}
		return -1;
	}
	
	public void insert(T element,int index) {
		if (index<0||index>size) {
			throw new IndexOutOfBoundsException("线性表索引越界");
		}
		ensureCapacity(size+1);
		System.arraycopy(elementData, index, elementData, 
				index+1, size-index);
		elementData[index] = element;
		size++;
	}
	
	public void add(T element) {
		insert(element, size);
	}
	
	private void ensureCapacity(int minCapacity) {
		if (minCapacity>capacity) {
			while (capacity<minCapacity) {
				capacity <<=1;
			}
			elementData = Arrays.copyOf(elementData, capacity);
		}
	}

	public T delete(int index) {
		if (index<0||index>size) {
			throw new IndexOutOfBoundsException("线性表索引越界");
		}
		T oldValue = (T)elementData[index];
		// 1 2 3 4 5 6 7      size = 7  index = 3   delete(3) to 123567
		int numMoved = size-index-1;
		if (numMoved>0) {
			System.arraycopy(elementData, index+1, elementData, index, numMoved);			
		}
		return oldValue;	
	}
	
	public T remove() {
		return delete(size-1);
	}
	
	public boolean empty() {
		return size==0;
	}
	
	public void clear() {
		Arrays.fill(elementData, null);
		size = 0;
	}
	
	public String toString() {
		if (size==0) {
			return "[]";
		}else {
			StringBuilder sb = new StringBuilder();
			sb.append("[");
			for (int i = 0; i < size; i++) {
				sb.append(elementData[i].toString()+", ");
			}
			int len = sb.length();
			return sb.delete(len-2, len).append("]").toString();
		}		
	}
}
