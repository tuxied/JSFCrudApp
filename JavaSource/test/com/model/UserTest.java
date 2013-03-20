package test.com.model;
 
import static junit.framework.Assert.assertEquals;
 
import org.junit.Test;
 
import com.facade.DogFacade;
import com.model.Dog;
import com.model.User;
 
public class UserTest {
 
    @Test
    public void isNameOfUser(){
    	User u = new User();
        u.setName("jonas");
        assertEquals("jonas",u.getName());
       
    }
}