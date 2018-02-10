//package justmap.just.com.justmap;
//
//import java.util.ArrayList;
//
//import android.content.Context;
//import android.database.Cursor;
//import android.database.sqlite.SQLiteDatabase;
//import android.database.sqlite.SQLiteDatabase.CursorFactory;
//import android.database.sqlite.SQLiteOpenHelper;
//
//public class DataBaseOperations extends SQLiteOpenHelper {
//
//    final static String DATABASE_NAME = "Student.db";
//    final static int DATABASE_VERSION = 1;
//    final static String TABLE_NAME = "Student";
//    final static String COLUMN_ID = "id";
//    final static String COLUMN_NAME = "name";
//    final static String COLUMN_PASSWORD = "password";
//
//	/*we create the above finals to make changes easier,for example if we change filenum to be fnumber.
//     * this is done directly by changing the value of COLUMN_FILENUM without make changes to queries  .
//	 * ( try to change a column name without using these finals and see how many queries you must modify!!!)*/
//
//    public DataBaseOperations(Context context) {
//        super(context, DATABASE_NAME, null, DATABASE_VERSION);
//
//    }
//
//    @Override
//    public void onCreate(SQLiteDatabase arg0) { // this method Called automatically when the database is created for the first time.
//        // TODO Auto-generated method stub
//        String q = "create table " + TABLE_NAME +
//                "(" + COLUMN_ID + " INTEGER PRIMARY KEY, " +
//                COLUMN_NAME + " text," +
//                COLUMN_NAME + " integer ," +
//                COLUMN_INSURANCEDEG + " integer);";
//        arg0.execSQL(q);
//
//
//    }
//
//
//    @Override
//    public void onUpgrade(SQLiteDatabase x, int arg1, int arg2) {// call this method by yourself when the database needs to be upgraded(try to  add new  column to a table then call it ).
//        // TODO Auto-generated method stub
//        String q = "drop table " + TABLE_NAME + ";";
//        x.execSQL(q);
//        onCreate(x);
//
//    }
//
////    void addPatient(Patient myPatient) {
////        String q1 = "insert into " + TABLE_NAME + "(" + COLUMN_NAME + "," + COLUMN_GENDER + "," +
////                COLUMN_INSURANCEDEG + ") values (" + "\"" + myPatient.getName() + "\"" + ","
////                + myPatient.getGender() + ", " + myPatient.getIsuranceDegree() + ");";
////        SQLiteDatabase myDB = getWritableDatabase();
////        myDB.execSQL(q1);
////
////
////    }
////
////    Patient searchByFileNum(int f) {
////        Patient p = new Patient();
////        String q = "select * from " + TABLE_NAME + " where " + COLUMN_FILENUM + "=" + f + ";";
////        SQLiteDatabase db = getReadableDatabase();
////        Cursor c = db.rawQuery(q, null);
////        if (c.moveToFirst()) {// if there is data, moveToFirst() moves cursor to first row  and returns true , if there is no data it returns false
////            String n = c.getString(1);
////            p.setName(n);
////            int g1 = c.getInt(c.getColumnIndex(COLUMN_GENDER));
////            p.setGender(g1);
////            int i = c.getInt(c.getColumnIndex(COLUMN_INSURANCEDEG));
////            p.setIsuranceDegree(i);
////
////        }// if
////        return p;
////    }
////
////    ArrayList<String> namesForInsuranceAboveorEqual2() {
////        ArrayList<String> namesList = new ArrayList<String>();
////        String q = "select " + COLUMN_NAME + " from " + TABLE_NAME +
////                " where " + COLUMN_INSURANCEDEG + ">=2;";
////        SQLiteDatabase db1 = getReadableDatabase();// use getReadableDatabase() with select query
////        Cursor c = db1.rawQuery(q, null);
////        c.moveToFirst();
////        while (!c.isAfterLast()) {
////            namesList.add(c.getString(c.getColumnIndex(COLUMN_NAME)));
////            c.moveToNext();
////        }
////        return namesList;
////    }
////
////    void deleteAll() {
////        String myQuery = "delete from " + TABLE_NAME + ";";
////        SQLiteDatabase db2 = getWritableDatabase();// use getWritableDatabase(); with delete,update,insert into queries
////        db2.execSQL(myQuery);
////    }
////
////    void updateBasedonFileNum(Patient p) {
////        String q = "update " + TABLE_NAME + " set " +
////                COLUMN_NAME + "=" + "\"" + p.getName() + "\"" + "," +
////                COLUMN_GENDER + "=" + p.getGender() + "," + COLUMN_INSURANCEDEG + "="
////                + p.getIsuranceDegree() + " where " +
////                COLUMN_FILENUM + "=" + p.getFileNum() + ";";
////        SQLiteDatabase db2 = getWritableDatabase();
////        db2.execSQL(q);
////    }
//
//}
