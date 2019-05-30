package cn.ch.util;

import cn.ch.model.Label;

public interface Heap {
	public void Insert(Label label);
	
	public void Delete(Label label);
	
	public Label ExtractMin();
	
	public int size();
}
