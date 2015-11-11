import java.util.*;
public class Genius<T> implements Queue<T> {

	    private T [] arr;

	    private int total, first, next;

	    public Genius()
	    {
	        arr = (T[]) new Object[2];
	    }

	    private void resize(int capacity)
	    {
	        T[] temp = (T[]) new Object[capacity];

	        for (int i = 0; i < total; i++)
	            temp[i] = arr[(first + i) % arr.length];

	        arr = temp;
	        first = 0;
	        next = total;
	    }

	    public Genius<T> enqueue(T ele)
	    {
	        if (arr.length == total) resize(arr.length * 2);
	        arr[next++] = ele;
	        if (next == arr.length) next = 0;
	        total++;
	        return this;
	    }

	    public T dequeue()
	    {
	        if (total == 0) throw new java.util.NoSuchElementException();
	        T temp = arr[first];
	        arr[first] = null;
	        if (++first == arr.length) first = 0;
	        if (--total > 0 && total == arr.length / 4) resize(arr.length / 2);
	        return temp;
	    }

	    public String toString()
	    {
	        return java.util.Arrays.toString(arr);
	    }

		public boolean addAll(Collection<? extends T> arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void clear() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean contains(Object arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean containsAll(Collection<?> arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Iterator<T> iterator() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean remove(Object arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean removeAll(Collection<?> arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean retainAll(Collection<?> arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public int size() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public Object[] toArray() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <T> T[] toArray(T[] arg0) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean add(T e) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public T element() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean offer(T e) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public T peek() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public T poll() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public T remove() {
			// TODO Auto-generated method stub
			return null;
		}

	}


