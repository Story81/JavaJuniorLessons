package lesson17.threads;

public abstract class AbstractTask implements Task{
    private int tryCount = 0;


    @Override
    public int getTryCount() {
        return 0;
    }

    @Override
    public void incTryCount() {

    }

//    @Override
//    public void execute() throws TaskExecutionFailedException {
//
//    }
}
