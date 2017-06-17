import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Ahmed on 4/10/2017.
 */

public class DB_sqlite extends SQLiteOpenHelper {
    public static final String DBname = "data.db";// name of database

    public DB_sqlite(Context context) {super(context, DBname, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table mytable(id INTEGER PRIMARY KEY AUTOINCREMENT.name TEXT.email TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS mytable");
        onCreate(db);

    }
}
