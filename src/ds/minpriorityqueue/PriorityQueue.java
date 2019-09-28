package ds.minpriorityqueue;

/**
 * Implement priority queue data structure using max heap
 */
public class PriorityQueue extends MinimumHeap implements MinPriorityQueue {

	PriorityQueue(int size) {
		super(size);
	}

	// returns the largest element of a[]
	@Override
	public int minimum(int[] a) {

		return a[0];
	}

	// removes and returns the largest element of a[]
	@Override
	public int extractMinimum(int[] a) throws HeapUnderflow {

		int min;

		if (heapSize < 1) {

			throw new HeapUnderflow();
		}

		// get max and replace it with a[heapSize]
		min = a[0];
		a[0] = a[heapSize - 1];

		// decrement the heapSize by 1
		heapSize--;

		// call maxHeapify() to maintain the heap property
		minHeapify(a, 0);

		return min;
	}

	@Override
	public void decreaseKey(int[] a, int i, int key) throws LargerKey {

		if (key > a[i]) {

			throw new LargerKey();
		}

		// replace the old key with the new key
		a[i] = key;

		// check for the right position of the new key
		while (i > 0 && a[parent(i)] > a[i]) {

			// exchange a[i] with a[parent(i)]
			int temp = a[i];
			a[i] = a[parent(i)];
			a[parent(i)] = temp;

			i = parent(i);
		}

	}

	@Override
	public void insert(int[] a, int key) throws LargerKey {

		int i;
		
		//for zero based array the heap size remains same
		i = heapSize;

		// insert infinite value at the last position
		a[i] = Integer.MAX_VALUE; // infinite value

		// call increaseKey() method
		decreaseKey(a, i, key);

	}

}
