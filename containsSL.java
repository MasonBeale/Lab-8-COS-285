import SkipList.SkipListNode;

/**
 * A class that implements the contains method in the SkipList
 * @author Madalyn Amero
 * @version 15 November, 2023
 *
 */
public abstract class containsSL extends SkipList {
	
	/**
	 * Determines if an item exists within a SkipList
	 * @param value the value to be searched in the SkipList
	 * @return
	 */
	public static boolean contains(T value) {
		//creating a header node at the start of the SkipList
		SkipListNode current = new SkipListNode<>(null, 3);
		boolean targetFound = false;
		int level = 3; //level set to max level
		
		//create a while loop that continues until value is found
		while (!targetFound) {
			if (current == null) {
				return targetFound;
			}
			//if the current node data matches the value, we have found the value
			if ((current!=null) && (current.compareTo(value)==0)) {
				targetFound = true;
			}
			//if value is larger than data at the current node, climb a level at predecessor of value
			else if ((current!=null) && (current.compareTo(value) < 0)) {
				current = current.forward;
			}
			//if value is less than data at current node, keep going along the SkipList
			
		}
	}

}