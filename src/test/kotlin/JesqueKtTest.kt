import net.greghaines.jesque.Job
import net.greghaines.jesque.worker.WorkerImpl
import org.junit.jupiter.api.Test
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

internal class JesqueKtTest {

    @Test
    fun sendTest() {
        val job = Job(
            "TestAction",
            "123",
        )
        send(job)
    }

    @Test
    fun worker() {
        val execService = Executors.newFixedThreadPool(2)

        WorkerImpl(getConfig(), listOf("test"), WorkerJobFactory()).apply {
            execService.execute(this)
        }
        execService.awaitTermination(1, TimeUnit.MINUTES)
    }
}
