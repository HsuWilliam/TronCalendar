package com.example.user.troncalendar;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper{


    public static final String DATABASE_NAME = "TronCalendar.db";
    public static final String TABLE_NAME_STUDENT = "student_table";
    public static final String TABLE_NAME_TEACHER = "teacher_table";
//    public static final String TABLE_NAME_DEPARTMENT = "department_table";
//    public static final String TABLE_NAME_COURSE = "course_table";
//    public static final String TABLE_NAME_STUDENTCOURSE = "studentcourse_table";
//    public static final String TABLE_NAME_BULLETINBOARD = "bulletinboard_table";
//    public static final String TABLE_NAME_TEXTBOOK = "textbook_table";
//    public static final String TABLE_NAME_TEACHINGFILE = "teachingfile_table";
//    public static final String TABLE_NAME_ASSIGNMENT = "assignment_table";
//    public static final String TABLE_NAME_ACTIVITY = "activity_table";
//    public static final String TABLE_NAME_ORGANIZATION = "organization_table";
//    public static final String TABLE_NAME_SCHOOLPOST = "schoolpost_table";

    public static final String STUDENT_COL_1 = "StudentNumber";
    public static final String STUDENT_COL_2 = "Name";
    public static final String STUDENT_COL_3 = "Department";
    public static final String STUDENT_COL_4 = "Grade";
    public static final String STUDENT_COL_5 = "Class";





    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }


    private static final String CREATE_TABLE_STUDENTS = "create table " + TABLE_NAME_STUDENT+ " (StudentNumber INTEGER PRIMARY KEY AUTOINCREMENT, NAME VARCHAR, " +
            "DEPARTMENT VARCHAR, GRADE INTEGER, CLASS TEXT) ";
    private static final String CREATE_TABLE_TEACHER = "create table " + TABLE_NAME_TEACHER+ " (TeacherID INTEGER PRIMARY KEY AUTOINCREMENT, NAME VARCHAR, " +
            "DEPARTMENT VARCHAR, CLASS_TEACHER TEXT) ";

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_STUDENTS);
        db.execSQL(CREATE_TABLE_TEACHER);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME_STUDENT );
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME_TEACHER );
        onCreate(db);
    }
}
