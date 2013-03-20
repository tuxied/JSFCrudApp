package test.com.facade;
 
import static junit.framework.Assert.assertEquals;
 
import org.junit.Test;
 
import com.facade.DogFacade;
import com.model.Dog;
 
public class DogFacadeTest {
 
    @Test
    public void isNameOfAllDogsCorret(){
        DogFacade dogFacade = new DogFacade();
//        dogFacade.startConnection();
        Dog dogA = new Dog();
        dogA.setName("Big Dog");
        //dogFacade.createDog(dogA); //lägger in en dog i DB varjegång den körs.
        assertEquals("jack",dogFacade.findDog(1).getName());
        assertEquals("Big Dog",dogFacade.findDog(2).getName());
       
 
//        createData(dogFacade);
//        assertEquals(30, dogFacade.getAverageDogsWeight());
 
//        dogFacade.closeConnection();
    }
 
    private void createData(){
        Dog dogA = new Dog();
        dogA.setName("Big Dog");
        //dogA.setWeight(45);
 
        Dog dogB = new Dog();
        dogB.setName("Medium Dog");
//        dogB.setWeight(30);
 
        Dog dogC = new Dog();
        dogC.setName("Small Dog");
//        dogC.setWeight(15);
    }
}