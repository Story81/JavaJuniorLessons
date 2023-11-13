package lesson17.threads;

import lesson14.CopyUtils;
import lesson14.CopyWithCommonIO;

import java.io.IOException;

public class CopyTaskFileImpl extends AbstractTask implements CopyFileTask {
    private CopyUtils copyUtils = new CopyWithCommonIO();
    private String from;
    private String to;

    public CopyTaskFileImpl(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void setFileCopyUtils(CopyUtils copyUtils) {
        this.copyUtils = copyUtils;
    }

    @Override
    public void execute() throws TaskExecutionFailedException {
        try {
            copyUtils.copy(from, to);
        } catch (IOException e) {
            throw new TaskExecutionFailedException(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "CopyTaskFileImpl{" +
                "copyUtils=" + copyUtils +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }
}
