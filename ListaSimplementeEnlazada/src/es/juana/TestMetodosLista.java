package es.juana;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class TestMetodosLista {

	 private MetodosLista<Integer> lista;

	    @Before
	    public void setUp() {
	        lista = new MetodosLista<>();
	    }

	    @Test
	    public void testAdd() {
	        lista.add(1);
	        lista.add(2);
	        assertEquals(2, lista.size());
	    }

	    @Test
	    public void testAddWithIndex() {
	        lista.add(1);
	        lista.add(2);
	        lista.add(3);
	        lista.add(0, 10);
	        assertEquals(Integer.valueOf(10), lista[0]);
	        assertEquals(Integer.valueOf(1), lista[0]);
	    }

	    @Test
	    public void testRemove() {
	        lista.add(1);
	        lista.add(2);
	        lista.remove(1);
	        assertEquals(1, lista.size());
	        assertEquals(Integer.valueOf(2), lista[0]);
	    }

	    @Test
	    public void testRemoveObject() {
	        lista.add(1);
	        lista.add(2);
	        lista.remove(Integer.valueOf(1));
	        assertEquals(1, lista.size());
	        assertEquals(Integer.valueOf(2), lista[0]);
	    }

	    @Test
	    public void testIsEmpty() {
	        assertTrue(lista.isEmpty());
	        lista.add(1);
	        assertFalse(lista.isEmpty());
	    }

	    @Test
	    public void testSize() {
	        assertEquals(0, lista.size());
	        lista.add(1);
	        lista.add(2);
	        assertEquals(2, lista.size());
	    }

	    @Test
	    public void testClear() {
	        lista.add(1);
	        lista.add(2);
	        lista.clear();
	        assertEquals(0, lista.size());
	        assertTrue(lista.isEmpty());
	    }

	    @Test
	    public void testContains() {
	        lista.add(1);
	        lista.add(2);
	        assertTrue(lista.contains(1));
	        assertFalse(lista.contains(3));
	    }

	    @Test
	    public void testToArray() {
	        lista.add(1);
	        lista.add(2);
	        Object[] array = lista.toArray();
	        assertNotNull(array);
	        assertEquals(2, array.length);
	        assertEquals(Integer.valueOf(1), array[0]);
	        assertEquals(Integer.valueOf(2), array[1]);
	    }
	

}
