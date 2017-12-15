import org.junit.Assert
import org.junit.Test

class UserIntegrationTests(){
    @Test
    fun whenICreateUserNopthingHappens(){
        println("was here Integration ")
        Assert.assertEquals(1,1)
    }
}