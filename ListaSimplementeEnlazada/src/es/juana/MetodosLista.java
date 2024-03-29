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
		int contador = 0;
		if (inicial == null) {

		}else {
			Nodo<T> actual = inicial;
			while (actual.siguiente != null) {
				actual = actual.siguiente;
				contador++;
				if (actual.siguiente == null) {
					index = index -1;
					if(contador == index) {
						actual.siguiente = new Nodo<T>(elemento);
					}
					if(contador == index) {
						actual.siguiente = new Nodo<T>(elemento);

					}
				}
			}
		}

	}

	@Override
	public T remove(int index) {
		int contador = 0;
		if (inicial == null) {
			return null;
		}else {
			Nodo<T> actual = inicial;
			while (actual.siguiente != null) {
				actual = actual.siguiente;
				contador++;
				if(contador == index) {
					System.out.println(actual);
					actual = null;
				}
			}
		}
		return null;

	}

	@Override
	public void remove(T elemento) {
		if (inicial == null) {
		}else {
			Nodo<T> actual = inicial;
			while (actual.siguiente != null) {
				actual = actual.siguiente;
				if (actual == elemento) {
					actual = null;
				}
			}

		}	

	}

	@Override
	public boolean isEmpty() {
		if (inicial == null) {
			return true;
		}
		return false;

	}

	@Override
	public int size() {
		int contador = 0;
		if (inicial == null) {
			return 0;
		}else {
			Nodo<T> actual = inicial;
			while (actual.siguiente != null) {
				actual = actual.siguiente;
				contador++;
			}
		}
		return contador;	
	}

	@Override
	public void clear() {
		if (inicial == null) {
		}else {
			Nodo<T> actual = inicial;
			while (actual.siguiente != null) {
				actual = actual.siguiente;
				actual = null;
			}
		}	
	}

	@Override
	public boolean contains(T elemento) {
		if (inicial == null) {
			return false;
		}else {
			Nodo<T> actual = inicial;
			while (actual.siguiente != null) {
				if (actual == elemento) {
					return true;
				}
			}
			return false;
		}	
	}
	/*@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("head\n");
		sb.append("-\n");
		sb.append("[");
		while () {
			sb.append();
		}
		sb.append(", ");
		sb.append("]");
		return sb.toString();
	}*/

	@Override
	public Object[] toArray() {
		if (inicial == null) {
		}else {
			Nodo<T> actual = inicial;
			while (actual.siguiente != null) {
				actual = actual.siguiente;
				System.out.println(actual);
			}
		}
		return null;
	}






}
