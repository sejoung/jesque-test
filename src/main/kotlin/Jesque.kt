import net.greghaines.jesque.Config
import net.greghaines.jesque.ConfigBuilder
import net.greghaines.jesque.Job
import net.greghaines.jesque.client.ClientImpl

fun getConfig(): Config = ConfigBuilder().also {
    it.withHost("localhost").withPort(6379)
}.build()

fun send(job: Job) = ClientImpl(getConfig()).enqueue("test", job)
