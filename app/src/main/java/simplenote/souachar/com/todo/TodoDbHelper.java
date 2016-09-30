package simplenote.souachar.com.todo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by souachar on 9/24/16.
 */
public class TodoDbHelper extends SQLiteOpenHelper {

    public TodoDbHelper(Context context) {
        super(context, Todo.DB_NAME, null, Todo.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + Todo.TaskEntry.TABLE + " ( " +
                Todo.TaskEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                Todo.TaskEntry.COL_TASK_TITLE + " TEXT NOT NULL);";

        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + Todo.TaskEntry.TABLE);
        onCreate(db);

    }
}
