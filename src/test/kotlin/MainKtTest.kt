import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow

internal class MainKtTest {

    @Test
    fun main() {
        assertDoesNotThrow {
            main(arrayOf("a", "asd"))
        }
    }
}
