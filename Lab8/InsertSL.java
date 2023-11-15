package Lab8;

public class InsertSL<T extends Comparable<T>> extends SkipList<T>{
	
	@Override
	public void insert(T value) {
		SkipListNode<T>[] predecessors = (SkipListNode<T>[]) new Object[randomLevel];
		for(int level = predecessors.length-1; level>0; level--) {
			SkipListNode<T> node = header;
			while(node.value.compareTo(value)<0) {
				predecessors[level] = node;
			}
		}
		
	}


	@Override
	public boolean contains(T value) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean delete(T value) {
		// TODO Auto-generated method stub
		return false;
	}
	
}