package simplenote.souachar.com.todo;

import android.provider.BaseColumns;

/**
 * Created by souachar on 9/24/16.
 */
public class Todo {
    public static final String DB_NAME = "com.soumya.todolist.db";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";

        public static final String COL_TASK_TITLE = "title";
    }
}
