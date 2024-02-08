package es.juana;

public class MetodosLista<T> implements LinkedList<T>{

	private Nodo<T> inicial;
	public MetodosLista() {
	}
	
	@Override
	public void add(T elemento) {
		if (inicial == null) {
			 Nodo<T> inicial1 = new Nodo<T>(elemento);
			 inicial = inicial1;
		}else {
			Nodo<T> actual = inicial;
			while (actual.siguiente != null) {
				actual = actual.siguiente;
			}
			actual.siguiente = new Nodo<T>(elemento);
		}	
		
	}

	@Override
	public void add(T elemento, int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(T elemento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void clear() {
		
		
	}

	@Override
	public boolean contains(T elemento) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		  sb.append("head\n");
		  sb.append("-\n");
		  sb.append("[");
		  while (actual.siguiente != null) {
				 sb.append(actual.siguiente);
			}
		  sb.append(", ");
		  sb.append("]");
		  return sb.toString();
		}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	
}
