package Iterator;

public class Tasks implements Container{
    private String[] tasks = {"task1", "task2", "task3"};

    @Override
    public Iterator getIterator() {
        return new TaskIterator();
    }
    private class TaskIterator implements Iterator{
        int index = 0;
        @Override
        public boolean hasNext() {
            return index<tasks.length;
        }

        @Override
        public Object next() {
            return tasks[index++];
        }
    }
}
