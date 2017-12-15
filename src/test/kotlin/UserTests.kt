import org.junit.Assert
import org.junit.Test

class UserTests(){
    @Test
    fun whenICreateUserNopthingHappens(){
        println("was here Unit!")
        Assert.assertEquals(1,1)
    }
}