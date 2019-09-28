package ds.maxpriorityqueue;

/**
 * Implement priority queue data structure using max heap
 */
public class PriorityQueue extends MaximumHeap implements MaxPriorityQueue {

	PriorityQueue(int size) {
		super(size);
	}

	// returns the largest element of a[]
	@Override
	public int maximum(int[] a) {

		return a[0];
	}

	// removes and returns the largest element of a[]
	@Override
	public int extractMaximum(int[] a) throws HeapUnderflow {

		int max;

		if (heapSize < 1) {

			throw new HeapUnderflow();
		}

		// get max and replace it with a[heapSize]
		max = a[0];
		a[0] = a[heapSize - 1];

		// decrement the heapSize by 1
		heapSize--;

		// call maxHeapify() to maintain the heap property
		maxHeapify(a, 0);

		return max;
	}

	@Override
	public void increaseKey(int[] a, int i, int key) throws SmallerKey {

		if (key < a[i]) {

			throw new SmallerKey();
		}

		// replace the old key with the new key
		a[i] = key;

		// check for the right position of the new key
		while (i > 0 && a[parent(i)] < a[i]) {

			// exchange a[i] with a[parent(i)]
			int temp = a[i];
			a[i] = a[parent(i)];
			a[parent(i)] = temp;

			i = parent(i);
		}

	}

	@Override
	public void insert(int[] a, int key) throws SmallerKey {

		int i;
		
		//for zero based array the heap size remains same
		i = heapSize;

		// insert - infinite value at the last position
		a[i] = -Integer.MAX_VALUE; // - infinite value

		// call increaseKey() method
		increaseKey(a, i, key);

	}

}
