import net.greghaines.jesque.Job
import net.greghaines.jesque.worker.JobFactory

class WorkerJobFactory : JobFactory {
    override fun materializeJob(job: Job): Any {
        println("asdasd = $job")
        return TestAction(job.args[0] as String)
    }
}
