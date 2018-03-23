import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import tarea2.Usuario;


public class Testing {
    
    static Usuario pruebaUser;
    
    @Before
    public void setUpBeforeClass() throws Exception {
	
	pruebaUser = new Usuario();
	
    }
        
       
        
         @Test
	public void testUsername() {

	String valorPrueba= " ";
	pruebaUser.setUsernames(valorPrueba);
	String retorno = pruebaUser.getUsernames();
	assertEquals(valorPrueba, retorno);
        
        String valorPrueba2 = "123";
	pruebaUser.setUsernames(retorno);
	String retorno2 = pruebaUser.getUsernames();
	assertEquals(valorPrueba2, retorno2);
        
        }
        @Test
	public void testNombre() {

	String valorPrueba= "123abc";
	pruebaUser.setFullnames(valorPrueba);
	String retorno = pruebaUser.getFullnames();
	assertEquals(valorPrueba, retorno);
        
        String valorPrueba2 = "123";
	pruebaUser.setFullnames(retorno);
	String retorno2 = pruebaUser.getFullnames();
	assertEquals(valorPrueba2, retorno2);
        }
        
     @Test
	public void testTipoID() {

	String valorPrueba= "!";
	pruebaUser.setTypeuser(valorPrueba);
	String retorno = pruebaUser.getTypeid();
	assertEquals(valorPrueba, retorno);
        
        String valorPrueba2 = "_";
	pruebaUser.setTypeuser(retorno);
	String retorno2 = pruebaUser.getTypeid();
	assertEquals(valorPrueba2, retorno2);
        
        }
       @Test
	public void testId() {

	String valorPrueba= "#";
        pruebaUser.setId(valorPrueba);
	
	String retorno = pruebaUser.getId();
	assertEquals(valorPrueba, retorno);
        
        String valorPrueba2 = ")";
	pruebaUser.setId(retorno);
	String retorno2 = pruebaUser.getId();
	assertEquals(valorPrueba2, retorno2);
        
        }
        
        public void testId2() {

	String valorPrueba= "¿?";
        pruebaUser.setId(valorPrueba);
	
	String retorno = pruebaUser.getId();
	assertEquals(valorPrueba, retorno);
        
        String valorPrueba2 = "/";
	pruebaUser.setId(retorno);
	String retorno2 = pruebaUser.getId();
	assertEquals(valorPrueba2, retorno2);
        
        }
        
}
